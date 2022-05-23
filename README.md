# 운동할 메이트와 장소를 같이 찾아요!



## 👭팀원 소개

##### 조영현 (Yeonghyeon Jo)

- **총괄 팀장, 프론트 엔드, Vue 개발**
- 🍎 Github : https://github.com/doyosaedog

##### 정재호 ( Jaeho Jeong )

- **프론트 엔드, Vue 개발**
- 🍋 Github : https://github.com/jaho901

##### 조해성 (Haesung Cho)

- **프론트 엔드, Vue 개발**
- 🍌 Github : https://github.com/daedaem

##### 김현민 (Hyunmin Kim)

- **백엔드, SpringBoot 개발**
- 🍇 Github : https://github.com/hyunmin2439

##### 배소원 (Sowon Bae)

- **백엔드, SpringBoot 개발**
- 🍓 Github : https://github.com/SowonBae

##### 임창현 (Changhyeon Lim)

- **백엔드, SpringBoot 개발**
- 🍑 Github : https://github.com/ckdgus777





## 프로젝트 개요

<img src="https://img.shields.io/badge/vue.js-4FC08D?style=for-the-badge&logo=vue.js&logoColor=white"> <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=SpringBoot&logoColor=white">  <img src="https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=MongoDB&logoColor=white"> <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white"> <img src="https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=Jenkins&logoColor=white"> <img src="https://img.shields.io/badge/NGINX-009639?style=for-the-badge&logo=NGINX&logoColor=white"> <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=Docker&logoColor=white">



- 운동 카테고리별 자신의 거주지와 가까운 운동장 및 체육관의 정보를 알려주고 예약을 할 수 있는 기능을 제공한다.

- 혼자하는 운동이 아닌 다양한 사람과의 만남을 통해 흥미를 가지고 함께 할 수 있는 운동을 제공한다.

  

#### 프로젝트 관련 사이트

---

##### [기능 명세서](https://docs.google.com/spreadsheets/d/1kfCWI3TbXJp1Jj8yONFbBbaU0l_I9F6j67QyKznPYfg/edit#gid=0)

##### [마인드맵](https://www.mindmeister.com/map/2250153434)

##### [팀 노션](https://www.notion.so/201826888/2fbf3ac7c3c240cd934527d143c50d0e)

##### [와이어프레임](https://www.figma.com/file/H1SQuE4vjwrjhhhonxnxa6/%EC%9E%90%EC%9C%A8-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8?node-id=0%3A1)

##### [ERD](https://www.erdcloud.com/d/PdrjSfBm9oB4e4rur)

##### [GitLab](https://lab.ssafy.com/s06-final/S06P31E205)

##### [Jira](https://jira.ssafy.com/projects/S06P31E205?selectedItem=com.atlassian.jira.jira-projects-plugin:report-page)

---



### 기획 의도

---

####  ‘체육활동을 위한 **장소**와 **사람**을 중개함으로써, 국민생활체육 활동 증진 도모하는 **운동 중개 플랫폼**’

- 2021년, 문체부 국민생활체육조사에 따르면 생활체육 참여율 50%로 부족. -> **'국민의 생활체육 참여 부족'**

- 체육시설 비이용 이유 2위, 12.4% '체육시설에 대한 정보가 없어서' -> **'운동 장소 정보 부족'**

- 체육 동호회 조직 가입 이유 1위, 59.4% '여러 사람들과 어울려서 운동하고 싶어서' -> '**운동을 함께 할 사람 필요'**

<img src="README.assets/intentionOfProject.png" alt="프레젠테이션1" style="zoom:67%;" />

## 프로젝트 소개

![image-20220415195611472](README.assets/image-20220415195611472.png)



#### 주요 서비스

##### 1. 운동 장소
- 운동 카테고리별 검색을 통해 원하는 운동 시설을 조회하고 예약할 수 있는 서비스를 제공합니다.
![장소수정](README.assets/장소수정.gif)


##### 2. 운동 메이트
- 자신의 지역 기반으로 메이트 목록을 확인하고 운동 종목별로 같이 운동을 원하는 메이트를 찾을 수 있는 서비스를 제공합니다.
![메이트](README.assets/메이트.gif) 


##### 3. 프로필
- 자신의 개인화된 정보를 보여주고, 자신의 활동 이력을 조회할 수 있는 서비스를 제공합니다.
![프로필](README.assets/프로필.gif)


#### 기능 소개

##### 1. 카카오 로그인

![로그인](exec/4. 시연 시나리오/image/01.PNG)

![카카오 로그인](exec/4. 시연 시나리오/image/02.PNG)

##### 2. 메인 페이지

![메인 페이지](exec/4. 시연 시나리오/image/03.PNG)

##### 3. 장소 페이지

![장소 페이지](exec/4. 시연 시나리오/image/04.PNG)

![장소 검색](exec/4. 시연 시나리오/image/05.PNG)

![장소 상세 페이지](exec/4. 시연 시나리오/image/06.PNG)

![장소 예약 결제](exec/4. 시연 시나리오/image/07.PNG)

##### 4. 메이트 페이지

![메이트 페이지](exec/4. 시연 시나리오/image/08.PNG)

![메이트 생성](exec/4. 시연 시나리오/image/09.PNG)

![메이트 상세 조회](exec/4. 시연 시나리오/image/10.PNG)

##### 5. 프로필 페이지

![프로필 소개](exec/4. 시연 시나리오/image/11.PNG)

![찜한 목록](exec/4. 시연 시나리오/image/12.PNG)

![예약 목록](exec/4. 시연 시나리오/image/13.PNG)

![운동 스케줄](exec/4. 시연 시나리오/image/14.PNG)

![메이트 신청 목록](exec/4. 시연 시나리오/image/15.PNG)
