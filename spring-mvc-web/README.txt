url: http://localhost:8082/spring-mvc-web/home.htm

CREATE TABLE
    USER_DATA
    (
        USER_ID VARCHAR2(50),
        PASSWORD VARCHAR2(50),
        FIRST_NAME VARCHAR2(50),
        LAST_NAME VARCHAR2(50)
    );

INSERT INTO USER_DATA (USER_ID, PASSWORD, FIRST_NAME, LAST_NAME) VALUES ('111', 'welcome', 'Krishna', 'Chaitanya');
INSERT INTO USER_DATA (USER_ID, PASSWORD, FIRST_NAME, LAST_NAME) VALUES ('222', 'welcome', 'Venkatesh', 'Sajjanapu');
	
SELECT * FROM USER_DATA --WHERE USER_ID=? AND PASSWORD=?
