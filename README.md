# 🚀 NextDay Delivery Service

사용자에게 빠르고 정확한 배달 경험을 제공하기 위한 백엔드 시스템입니다. **도메인 주도 설계(DDD)**와 **클린 아키텍처**를 적용하여 견고한 비즈니스 로직을 구축하였으며, **Spring REST Docs**를 통해 신뢰할 수 있는 API 문서를 제공합니다.

---

## 1. 프로젝트 핵심 가치
* **신뢰성**: 테스트 코드로 검증된 API만 문서화되는 REST Docs 도입.
* **유지보수성**: DDD 기반 아키텍처로 도메인 간 결합도를 낮추고 비즈니스 로직의 응집도를 높임.
* **성능**: Redis를 활용한 데이터 캐싱 및 QueryDSL을 이용한 동적 쿼리 최적화.

---

## 2. 팀원 및 역할 분담
| 이름 | 담당 도메인 및 역할 |
| :--- | :--- |
| **김재현** | **Backend Lead**: 가게 관리, 카테고리 관리 |
| **임세희** | 주문(Order) 시스템 설계 및 결제(Payment) 처리 |
| **최승원** | 회원(User) 도메인 구축 및 보안(Spring Security/JWT) |
| **예준성** | 상품(Product) 관리 및 **LLM 기반 AI 상품 설명 추천** |
| **김준원** | 인프라 구성(PostgreSQL/Redis) 및 장바구니 기능 |
| **나웅철** | 가게 리뷰(Review) 및 평점 시스템 관리 |

---

## 3. 기술 스택 (Tech Stack)

### Backend
* **Framework**: Spring Boot 3.x
* **Language**: Java 17
* **Database**: PostgreSQL, Redis (Caching)
* **Persistence**: Spring Data JPA, **QueryDSL**
* **Migration**: **Liquibase**
* **Security**: Spring Security, JJWT
* **Documentation**: **Spring REST Docs**

### AI & Infrastructure
* **AI**: Google GenAI (LLM integration)
* **Build Tool**: Gradle

---

## 4. API 문서 확인 (REST Docs)
저희 프로젝트는 Swagger 대신, 테스트 코드의 성공을 보장하는 **Spring REST Docs**를 사용합니다.

1. **프로젝트를 빌드합니다.**
   ```bash
   ./gradlew asciidoctor
   서버 실행 후 아래 주소에서 문서를 확인할 수 있습니다.

Local: http://localhost:8080/docs/index.html

Build Path: build/docs/asciidoc/index.html

5. 실행 방법 (Getting Started)
Prerequisites
JDK 17 이상

PostgreSQL 15+

Redis

Installation
Bash
# 레포지토리 클론
git clone [https://github.com/your-repo/delivery-backend.git](https://github.com/your-repo/delivery-backend.git)

# 설정 파일 확인 (src/main/resources/application.yml)
# DB 접속 정보 및 JWT Secret Key 설정 필요

# 프로젝트 빌드 및 실행
./gradlew bootRun
6. 아키텍처 및 ERD
7. 주요 기능 (Key Features)
도메인별 격리: 가게, 주문, 회원 등 각 도메인이 명확한 경계(Bounded Context)를 가짐.

보안 강화: Spring Security와 JWT를 연동한 권한 기반(Role-based) 접근 제어.

AI 상품 추천: 상품 등록 시 LLM을 활용하여 자동으로 매력적인 상품 설명을 생성.


위의 코드 블록 오른쪽 상단에 있는 복사 아이콘을 누르시면 한 번에 전체 복사가 가능합니다! 혹시 6번의 ERD 사진이나 아키텍처 다이어그램 이미지가 필요하시면 제가 추가로 그려드릴까요?
