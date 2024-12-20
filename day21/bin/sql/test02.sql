CREATE TABLE PRODUCT(
	NUM INT PRIMARY KEY,--자료형 뒤에 제약조건 입력
	NAME VARCHAR(150) NOT NULL,--NOT NULL제약조건
	PRICE INT ,
	CNT INT DEFAULT 0 --기본값 0
);
-- 컬럼(COLUMN) 제약조건(강제)
--컬럼은 자바에서 속성,필드 등을 의미
--SQL은 스크립트어==인터프리터 언어라서
--위에서 아래로 실행되는 것이 아닌
--선택한 부분만 실행

INSERT INTO PRODUCT VALUES(11,'콜라',1200,10);
--순서대로 넣어야 한다 11번 콜라 1200원 10개

--보편적으로 사용하는 형태

SELECT*FROM PRODUCT;
--에스터리스트,와일드카드 (전부라는 뜻) 사용하지는 않는다.
SELECT NUM,NAME,PRICE,CNT FROM PRODUCTL;
SELECT NUM,NAME,CNT FROM PRODUCT;
SELECT*FROM PRODUCT WHERE PRICE>=1000;
SELECT*FROM PRODUCT WHERE PRICE>=1000 ORDER BY NUM DESC;
--이름으로 검색
SELECT*FROM PRODUCT WHERE NAME LIKE '%라면%';


DROP TABLE PRODUCT;










DROP TABLE PRODUCT;