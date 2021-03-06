package com.ssafy.api.service;

import com.ssafy.domain.entity.Member;
import com.ssafy.common.util.OAuthAttributes;
import com.ssafy.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Collections;
import java.util.Map;
import java.util.Random;

@RequiredArgsConstructor // 요구되는 생성자 자동으로 집어넣어주는 어노테이션
@Service
public class CustomOAuth2UserService implements OAuth2UserService<OAuth2UserRequest, OAuth2User> {

    private final MemberRepository memberRepository;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        OAuth2UserService delegate = new DefaultOAuth2UserService();
        OAuth2User oAuth2User = delegate.loadUser(userRequest);

        // 구글 / 카카오 로그인인지 구분용
        String registrationId = userRequest.getClientRegistration().getRegistrationId();
        // 제공 타입?
        String userNameAttributeName = userRequest.getClientRegistration()
                .getProviderDetails().getUserInfoEndpoint().getUserNameAttributeName();
        // 유저 토큰
        String userToken = userRequest.getAccessToken().getTokenValue();
        // 유저 정보
        Map<String, Object> attribute = oAuth2User.getAttributes();

        // 제공되는 socialId
        String socialId = oAuth2User.getName();

//        System.out.println("------------------------------------------------------------------------------");
//        System.out.println("소셜로그인 구분 : " + registrationId);
//        System.out.println("로그인 한 소셜 유저 ID : " + socialId);
//        System.out.println("소셜로그인 제공 accessToken : " + userToken);
//        System.out.println("------------------------------------------------------------------------------");

        // OAuth2UserService를 통해 가져온 OAuth2User의 attribute를 담을 클래스
        OAuthAttributes attributes = OAuthAttributes.
                of(registrationId, userNameAttributeName, attribute);

        Member member = null;
        try {
            member = saveOrUpdate(attributes, socialId);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new DefaultOAuth2User(
                Collections.singleton(new SimpleGrantedAuthority("USER")),
                attributes.getAttributes(),
                attributes.getNameAttributeKey());
    }

    private Member saveOrUpdate(OAuthAttributes attributes, String socialId) throws SQLException {
        String nickname = randomNickname(attributes.getNickname());

        Member member = memberRepository.findByEmail(attributes.getEmail())
                .map(entity -> entity.updateSocialId(
                        socialId)) // 업데이트 : 사용자 정보 업데이트시 같이 변경
                .orElse(attributes.toEntity(socialId, nickname));

        return memberRepository.save(member);
    }

    private String randomNickname(String nickName) {
        Random random = new Random();
        String number = "";

        while (true) {
            if(memberRepository.findByNickname((nickName + number)).orElse(null) == null) return nickName + number;

            number = String.valueOf(random.nextInt(10000) + 1);
        }

    }
}