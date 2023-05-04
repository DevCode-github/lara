create table PERSON(SNO NUMBER, NAME VARCHAR2(40),AGE NUMBER);
CREATE  TABLE EMPLOYEE(EMP_ID NUMBER, FIRST_NME VARCHAR2(50), SALARY NUMBER);
CREATE TABLE PRODUCT1(ID NUMBER, PRODUCT_NAME VARCHAR(90), PRICE NUMBER);
INSERT INTO PRODUCT1 VALUES(1,'MOBILE', 30000);
INSERT INTO PRODUCT1 VALUES(2, 'LAPTOP', 55000);
INSERT INTO EMPLOYEE VALUES(101, 'VIJAY', 40000);
INSERT INTO PERSON VALUES(40, 'MURALI', 30);

CREATE TABLE STUDENT(STD_ID NUMBER, FIRST_NAME VARCHAR2(70), LAST_NAME VARCHAR2(90), AGE NUMBER, ADDRESS VARCHAR2(90));
INSERT INTO STUDENT VALUES(501, 'RAMU', 'RAO', 22, 'BTM');
INSERT INTO STUDENT VALUES(502, 'SWETHA', 'RAO', 23, 'JP NAGAR');
INSERT INTO STUDENT VALUES(503, 'MOHAN', 'KISHORE', 43, 'JAYA NAGAR');
INSERT INTO STUDENT VALUES(504, 'ANU', 'RAO', 22, 'BTM');
INSERT INTO STUDENT VALUES(505, 'PAVAN', 'RAO', 23, 'JP NAGAR');
INSERT INTO STUDENT VALUES(506, 'ROHAN', 'KISHORE', 43, 'JAYA NAGAR');
INSERT INTO STUDENT(STD_ID, FIRST_NAME, LAST_NAME, AGE) VALUES(510, 'RATHODE', 'KUMAR', 22);
INSERT INTO STUDENT(FIRST_NAME, AGE) VALUES('RAMU', 33);
INSERT INTO STUDENT(AGE, FIRST_NAME, ADDRESS) VALUES(22, 'ABC', 'BTM');
INSERT INTO STUDENT(AGE, STD_ID, FIRST_NAME, ADDRESS) VALUES(22, 45, 'MOHAN', 'BTM');
INSERT INTO STUDENT(FIRST_NAME, ADDRESS, AGE) VALUES('RUPA', 'KORAMANGALA', 25);
INSERT INTO STUDENT(STD_ID, FIRST_NAME, LAST_NAME, AGE, ADDRESS) VALUES(66, 'KISHORE', 'RAO', 33, 'BTM');
insert into student(last_name) values('rao');
insert into student(address) values('Marathalli');

DROP TABLE EMPLOYEE;
DROP TABLE PERSON;
DROP TABLE STUDENT;

CREATE TABLE PERSON(ID NUMBER, FIRST_NAME VARCHAR2(90), LAST_NAME VARCHAR2(30), AGE NUMBER, EMAIL VARCHAR2(40), ADDRESS VARCHAR2(90));
INSERT INTO PERSON VALUES(1, 'RAMU', 'R', 22, 'R@R.COM', 'BTM');
INSERT INTO PERSON VALUES(2, 'MADHU', 'P', 22, 'P@R.COM', 'BTM1');
INSERT INTO PERSON VALUES(3, 'KIRAN', 'T', 22, 'M@R.COM', 'BTM1');
INSERT INTO PERSON VALUES(4, 'SWETHA', 'P', 22, 'M@R.COM', 'BTM1');
INSERT INTO PERSON VALUES(5, 'MURALI', 'S', 22, 'M@A.COM', 'BTM1');

UPDATE PERSON SET FIRST_NAME='RAVI' WHERE ID = 3;
UPDATE PERSON SET LAST_NAME='ABC' WHERE ID=5;
UPDATE PERSON SET AGE=45 WHERE ID=2;  
UPDATE PERSON SET ADDRESS='BTM2' WHERE ID=5;  
UPDATE PERSON SET FIRST_NAME='RAGHU', LAST_NAME='RRR', AGE=25 WHERE ID=1;
UPDATE PERSON SET AGE=45,EMAIL='ABC@XYZ.COM' WHERE ID=4;
UPDATE PERSON SET FIRST_NAME='XYZ', EMAIL='HELLO@XYZ.COM' WHERE AGE=25;
UPDATE PERSON SET LAST_NAME='test' WHERE FIRST_NAME='RAVI';
update person set first_name='www' where id > 2;
UPDATE person SET last_name='ramu',id = 4 WHERE age>26;
update person set age=30, email='a@a.com';

DROP TABLE PERSON;
CREATE TABLE PERSON(ID NUMBER, FIRST_NAME VARCHAR2(90), LAST_NAME VARCHAR2(90), AGE NUMBER);
INSERT INTO PERSON VALUES(10, 'VIJAY', 'T', 22);
INSERT INTO PERSON VALUES(11, 'MURALI', 'Y', 24);
INSERT INTO PERSON VALUES(12, 'MOHAN', 'R', 26);
INSERT INTO PERSON VALUES(14, 'SWETHA', 'S', 25);
INSERT INTO PERSON VALUES(16, 'RUPA', 'Q', 21);
INSERT INTO PERSON VALUES(40, 'KIRAN', 'T', 22);
INSERT INTO PERSON VALUES(21, 'OLE', 'Y', 24);
INSERT INTO PERSON VALUES(55, 'ADANI', 'R', 26);
INSERT INTO PERSON VALUES(6, 'MUKESH', 'S', 25);
INSERT INTO PERSON VALUES(1, 'RAJU', 'W', 21);

DELETE FROM PERSON WHERE ID = 16;
DELETE FROM PERSON WHERE LAST_NAME='S';
DELETE FROM PERSON WHERE AGE > 30;
DELETE FROM PERSON WHERE AGE > 25 OR LAST_NAME = 'W';
DELETE FROM PERSON;
DROP TABLE PERSON;

CREATE TABLE STUDENT (ID NUMBER, FIRST_NAME VARCHAR2(90), AGE NUMBER);
INSERT INTO STUDENT VALUES(1, 'RAMU', 22);
INSERT INTO STUDENT VALUES(2, 'VIJAY', 22);
INSERT INTO STUDENT VALUES(3, 'SWETHA', 24);
INSERT INTO STUDENT VALUES(4, 'MOHAN', 23);
INSERT INTO STUDENT VALUES(5, 'RUPA', 28);
INSERT INTO STUDENT VALUES(6, 'KIRAN', 25);
INSERT INTO STUDENT VALUES(7, 'BHARATH', 24);
INSERT INTO STUDENT VALUES(8, 'ROHAN', 22);

SELECT * FROM STUDENT;
SELECT * FROM STUDENT WHERE ID >= 3;
SELECT * FROM STUDENT WHERE ID = 3;
SELECT * FROM STUDENT WHERE AGE >= 25;
SELECT * FROM STUDENT WHERE FIRST_NAME LIKE '%RA%';
SELECT * FROM STUDENT WHERE ID >= 4 OR AGE <= 28;
SELECT * FROM STUDENT WHERE ID >= 4 AND AGE <= 28;
SELECT * FROM STUDENT WHERE ID BETWEEN 4 AND 6;
SELECT * FROM STUDENT WHERE ID NOT BETWEEN 2 AND 7;
SELECT * FROM STUDENT WHERE AGE BETWEEN 23 AND 27;
SELECT * FROM STUDENT WHERE AGE IN (23, 25, 28, 24);
SELECT * FROM STUDENT WHERE ID IN (3,2,5,8);
SELECT * FROM STUDENT WHERE ID NOT IN (3,2,5,8);

DROP TABLE STUDENT;
CREATE TABLE STUDENT(ID NUMBER, FIRST_NAME VARCHAR2(90), LAST_NAME VARCHAR2(90), AGE NUMBER);
INSERT INTO STUDENT VALUES(1, 'DEV', 'K', 22);
INSERT INTO STUDENT(ID , FIRST_NAME, AGE) VALUES(2, 'RAM', 23);
UPDATE STUDENT SET ID = 3, FIRST_NAME = 'MOHAN';
DELETE FROM STUDENT WHERE ID = 3;
INSERT INTO STUDENT VALUES(3, 'MOHAN', 'V', 34);
INSERT INTO STUDENT VALUES(4, 'RUPA', 'W', 40);

SELECT * FROM STUDENT;
SELECT FIRST_NAME, AGE FROM STUDENT;
SELECT AGE, FIRST_NAME FROM STUDENT;
SELECT LAST_NAME FROM STUDENT WHERE ID > 3;
SELECT LAST_NAME FROM STUDENT WHERE ID <= 3;
SELECT FIRST_NAME, AGE, ID FROM STUDENT WHERE AGE <= 25;

SELECT FIRST_NAME AS FNAME FROM STUDENT;
SELECT FIRST_NAME AS NAME, LAST_NAME AS LNAME, AGE AS MY_AGE FROM STUDENT;

SELECT FIRST_NAME FNAME, LAST_NAME LNAME, AGE MY_AGE, ID YOUR_ID FROM STUDENT;
SELECT COUNT(*) FROM STUDENT;
SELECT COUNT(*) TOTAL FROM STUDENT;
SELECT COUNT(LAST_NAME) TOTAL FROM STUDENT;
INSERT INTO STUDENT(FIRST_NAME, AGE) VALUES('MURALI', 22);
SELECT COUNT(FIRST_NAME) TOTAL FROM STUDENT;
SELECT COUNT(ID) TOTAL FROM STUDENT;
SELECT MAX(FIRST_NAME) FROM STUDENT;
SELECT MAX(AGE) "MAXIMUM AGE" FROM STUDENT;
SELECT MIN(AGE) "MINIIMUM AGE"FROM STUDENT;
SELECT MIN(FIRST_NAME) "MINIMUM FIRST NAME" FROM STUDENT;
INSERT INTO STUDENT VALUES(5, 'SURESH', 'B', 44);
INSERT INTO STUDENT VALUES(6, 'ARON', 'B', 44);
SELECT AVG(AGE) "AVERAGE AGE" FROM STUDENT;
SELECT AVG(ID) "AVERAGE ID" FROM STUDENT;

SELECT * FROM STUDENT;
SELECT SUM(AGE) AS SUM FROM STUDENT;
SELECT AVG(AGE) AS AVERAGE FROM STUDENT;
SELECT MIN(AGE) AS MINIMUM FROM STUDENT;
SELECT MAX(AGE) MAXIMUM FROM STUDENT;

--SUB QUERY FOR SECOND MAX AND MIN
SELECT MAX(AGE) FROM STUDENT WHERE AGE < (SELECT MAX(AGE) FROM STUDENT);
SELECT MIN(AGE) FROM STUDENT WHERE AGE > (SELECT MIN(AGE) FROM STUDENT);

--OLDEST STUDENT QUERY
SELECT FIRST_NAME AS "OLDEST PEOPLE", AGE FROM STUDENT WHERE AGE = (SELECT MAX(AGE) FROM STUDENT);

--YOUNGEST STUDENT QUERY
SELECT FIRST_NAME AS "YOUNGEST PEOPLE", AGE FROM STUDENT WHERE AGE = (SELECT MIN(AGE) FROM STUDENT);

--SECOND YOUNGEST STUDENT QUERY
SELECT FIRST_NAME "SECOND_YOUNGEST_STUDENT", AGE FROM STUDENT WHERE AGE = (SELECT MIN(AGE) FROM STUDENT WHERE AGE > (SELECT MIN(AGE) FROM STUDENT));

--SECOND OLDEST STUDENT QUERY
SELECT FIRST_NAME "SECOND_OLDEST_STUDENT", AGE FROM STUDENT WHERE AGE = (SELECT MAX(AGE) FROM STUDENT WHERE AGE < (SELECT MAX(AGE) FROM STUDENT));

DROP TABLE EMPLOYEE;
CREATE TABLE EMPLOYEE(SNO NUMBER, FIRST_NAME VARCHAR2(90), SALARY NUMBER);
INSERT INTO EMPLOYEE VALUES(1, 'RAMU', 45000);
INSERT INTO EMPLOYEE VALUES(2, 'VIJAY', 85000);
INSERT INTO EMPLOYEE VALUES(3, 'KUMAR', 65000);
INSERT INTO EMPLOYEE VALUES(4, 'MOHAN', 47000);
INSERT INTO EMPLOYEE VALUES(5, 'SWETHA', 84000);
INSERT INTO EMPLOYEE VALUES(6, 'RUPA', 20000);
INSERT INTO EMPLOYEE VALUES(7, 'AKASH', 34000);
INSERT INTO EMPLOYEE VALUES(8, 'PAVAN', 25000);
INSERT INTO EMPLOYEE VALUES(9, 'PAVI', 47000);
INSERT INTO EMPLOYEE VALUES(10, 'KAVI', 45000);
INSERT INTO EMPLOYEE VALUES(11, 'RAMANA', 55000);
INSERT INTO EMPLOYEE VALUES(12, 'SWAROOP', 42000);
INSERT INTO EMPLOYEE VALUES(13, 'THIRUMAL', 75000);
INSERT INTO EMPLOYEE VALUES(14, 'CHANDRA', 25000);
INSERT INTO EMPLOYEE VALUES(15, 'MUDRA', 41000);
INSERT INTO EMPLOYEE VALUES(16, 'RAVI', 84000);
INSERT INTO EMPLOYEE VALUES(17, 'SWATHI', 25000);
INSERT INTO EMPLOYEE VALUES(18, 'SURESH', 99000);
INSERT INTO EMPLOYEE VALUES(19, 'KIRAN', 66000);
INSERT INTO EMPLOYEE VALUES(20, 'MAMTHA', 77000);
SELECT MAX(SALARY) "HIGHEST" FROM EMPLOYEE;
SELECT MIN(SALARY) "LOWEST" FROM EMPLOYEE;

--MAX AND MIN SALARY PERSON
SELECT FIRST_NAME FROM EMPLOYEE WHERE SALARY = (SELECT MAX(SALARY) FROM EMPLOYEE);
SELECT FIRST_NAME FROM EMPLOYEE WHERE SALARY = (SELECT MIN(SALARY) FROM EMPLOYEE);

--SECOND MAX AND MIN SALARY PERSON
SELECT FIRST_NAME, SALARY FROM EMPLOYEE WHERE SALARY = (SELECT MAX(SALARY) FROM EMPLOYEE WHERE SALARY < (SELECT MAX(SALARY) FROM EMPLOYEE));
SELECT FIRST_NAME, SALARY FROM EMPLOYEE WHERE SALARY = (SELECT MIN(SALARY) FROM EMPLOYEE WHERE SALARY > (SELECT MIN(SALARY) FROM EMPLOYEE));

--ORDER BY
SELECT * FROM EMPLOYEE ORDER BY SALARY;
SELECT * FROM EMPLOYEE ORDER BY FIRST_NAME;
SELECT * FROM EMPLOYEE ORDER BY SALARY ASC;--ASCENDING BY DEFAULT
SELECT * FROM EMPLOYEE ORDER BY SALARY DESC;

--RANK() OVER()
SELECT SNO, FIRST_NAME, SALARY, RANK() OVER(ORDER BY SALARY DESC) "SALARY_RANK" FROM EMPLOYEE;--RANK BY SALARY
SELECT SNO, FIRST_NAME, SALARY, RANK() OVER(ORDER BY SALARY DESC) "SALARY_RANK" FROM EMPLOYEE WHERE SALARY_RANK = 2;--ERROR , WHERE CLAUSE ONLY SELECTS FROM COLUMNS
SELECT * FROM(SELECT SNO, FIRST_NAME, SALARY, RANK() OVER(ORDER BY SALARY DESC) "SALARY RANK" FROM EMPLOYEE) WHERE "SALARY RANK" = 2;--CREATE A TEMPARORY TABLE WITH RANK AS COLUMN USING A SUB QUERY OF RANK AND OVER
SELECT FIRST_NAME FROM(SELECT SNO, FIRST_NAME, SALARY, RANK() OVER(ORDER BY SALARY DESC) "SALARY RANK" FROM EMPLOYEE) WHERE "SALARY RANK" = 3;

--PAGINATION : DISPLAYING RECORDS ACROSS THE PAGES NOT IN A SINGLE PAGE | ROWNUM
SELECT SNO, FIRST_NAME, SALARY, ROWNUM FROM EMPLOYEE;--SEQUENTIAL INCREMENTING NUMBER
SELECT * FROM (SELECT SNO, FIRST_NAME, SALARY, ROWNUM RN FROM EMPLOYEE) WHERE RN BETWEEN 10 AND 20;

DROP TABLE STUDENT;
CREATE TABLE STUDENT(ID NUMBER, NAME VARCHAR(90), AGE NUMBER);
INSERT INTO STUDENT VALUES(1, 'RAMU', 22); 
INSERT INTO STUDENT VALUES(2, 'MOHAN', 24);
INSERT INTO STUDENT VALUES(3, 'SWETHA', 21);
INSERT INTO STUDENT VALUES(4, 'PAVANI', 23);
INSERT INTO STUDENT VALUES(5, 'MURALI', 33);

--DISTINCT
SELECT * FROM STUDENT;
SELECT DISTINCT ID, NAME, AGE FROM STUDENT;
SELECT DISTINCT * FROM STUDENT;

--GROUP BY
SELECT * FROM STUDENT GROUP BY ID,NAME, AGE;
SELECT * FROM STUDENT GROUP BY ID, NAME, AGE ORDER BY ID;

--ROWID | ORACLE SPECIFIC | INNER TABLE
SELECT ROWID FROM STUDENT;
SELECT ID, NAME, AGE, ROWID FROM STUDENT;
SELECT MIN(ROWID), MAX(ROWID) FROM STUDENT;
SELECT MIN(ROWID), MAX(ROWID) FROM ANIMAL;
DELETE FROM STUDENT WHERE ROWID NOT IN (SELECT MIN(ROWID) FROM STUDENT GROUP BY ID, NAME, AGE);

--DDL(DATA DEFINITION LANG.)    => CREATE, ALTER, TRUNCATE, DROP, RENAME
--DML(DATA MANUPILATING LANG.)  => INSERT, UPDATE, DELETE
--DQL(DATA QUERY LANG.)         => SELECT
--DCL(DATA CONTROLING LANG.)    => GRANT, REVOKE

CREATE TABLE TAB1(SNO NUMBER, NAME VARCHAR(90));

--DESCRIPTION DESC|DESCRIBE
DESC TAB1;
DESCRIBE TAB1;

--RENAME COLUMN
RENAME TAB1 TO TAB2;
DESC TAB2;
RENAME TAB2 TO TABLE2;

ALTER TABLE TABLE2 RENAME COLUMN SNO TO ID;
ALTER TABLE TABLE2 RENAME COLUMN ID TO FIRST_NAME;

--ADD, DROP COLUMN
ALTER TABLE TABLE2 ADD LAST_NAME VARCHAR2(90);
ALTER TABLE TABLE2 ADD ID NUMBER;
ALTER TABLE TABLE2 DROP COLUMN FIRST_NAME;
ALTER TABLE TABLE2 ADD EMAIL VARCHAR2(90);
ALTER TABLE TABLE2 ADD AGE NUMBER;
DESC TABLE2;

--TRUNCATE TABLE
TRUNCATE TABLE TABLE2;
INSERT INTO TABLE2 VALUES('AJAY', 'AJAY@COM', 22, 1);
SELECT * FROM TABLE2;
DROP TABLE TABLE2;

CREATE TABLE TAB1(SNO NUMBER, NAME VARCHAR2(90));
INSERT INTO TAB1 VALUES(1, 'XYA');
INSERT INTO TAB1 VALUES(2, 'XYB');
INSERT INTO TAB1 VALUES(3, 'XYC');
INSERT INTO TAB1 VALUES(4, 'XYD');
INSERT INTO TAB1 VALUES(5, 'XYE');
INSERT INTO TAB1 VALUES(6, 'XYF');
INSERT INTO TAB1(SNO) VALUES(7);
INSERT INTO TAB1(NAME) VALUES('XYH');
SELECT * FROM TAB1;

--NOT NULL CONSTRAINT
CREATE TABLE TAB2(SNO NUMBER NOT NULL, NAME VARCHAR2(90));
INSERT INTO TAB2 VALUES(1, 'XYA');
INSERT INTO TAB2 VALUES(2, 'XYA');
INSERT INTO TAB2(SNO) VALUES(3);
INSERT INTO TAB2(NAME) VALUES('XYA');
SELECT * FROM TAB2;
DROP TABLE TAB1;

CREATE TABLE TAB3(SNO NUMBER NOT NULL, NAME VARCHAR2(90) NOT NULL);
INSERT INTO TAB3 VALUES(1, 'XYA');
INSERT INTO TAB3 VALUES(2, 'XYB');
INSERT INTO TAB3(SNO) VALUES(3);
INSERT INTO TAB3(NAME) VALUES('XYD');
SELECT * FROM TAB3;
DROP TABLE TAB3;

CREATE TABLE TAB4(SNO NUMBER, NAME VARCHAR2(90));
INSERT INTO TAB4 VALUES(1, 'XYA');
INSERT INTO TAB4 VALUES(1, 'XYA');
INSERT INTO TAB4 VALUES(2, 'XYB');
INSERT INTO TAB4(SNO) VALUES(3);
INSERT INTO TAB4(NAME) VALUES('XYD');
SELECT * FROM TAB4;

--UNIQUE CONSTRAINT
CREATE TABLE TAB5(SNO NUMBER UNIQUE, NAME VARCHAR2(90));
INSERT INTO TAB5 VALUES(1, 'XYA');
INSERT INTO TAB5 VALUES(1, 'XYB');--UNIQUE CONSTRAINT VIOLATED
INSERT INTO TAB5 VALUES(2, 'XYC');
INSERT INTO TAB5(SNO) VALUES(3);
INSERT INTO TAB5(NAME) VALUES('XYE');
SELECT * FROM TAB5;

CREATE TABLE TAB6(SNO NUMBER UNIQUE NOT NULL, NAME VARCHAR2(90) UNIQUE NOT NULL);
INSERT INTO TAB6 VALUES(1, 'XYA');
INSERT INTO TAB6 VALUES(1, 'XYB');--UNIQUE CONSTRAINT VIOLATED
INSERT INTO TAB6 VALUES(2, 'XYC');
INSERT INTO TAB6(SNO) VALUES(3);
INSERT INTO TAB6(NAME) VALUES('XYE');
SELECT * FROM TAB6;
DROP TABLE TAB6;
DESC TAB6;

CREATE TABLE TAB7(SNO NUMBER, NAME VARCHAR2(90), CONSTRAINT TAB7_UQ1 UNIQUE(SNO));
INSERT INTO TAB7 VALUES(1, 'XYA');
INSERT INTO TAB7 VALUES(1, 'XYB');--UNIQUE CONSTRAINT VIOLATED
INSERT INTO TAB7 VALUES(3, 'XYA');
INSERT INTO TAB7 VALUES(4, 'XYC');
INSERT INTO TAB7(SNO) VALUES(5);
INSERT INTO TAB7(NAME) VALUES('XYE');
SELECT * FROM TAB7;
DROP TABLE TAB7;
DESC TAB7;

CREATE TABLE TAB8(SNO NUMBER, NAME VARCHAR2(90), CONSTRAINT TAB7_UQ1 UNIQUE(SNO), CONSTRAINT TAB8_UQNAME UNIQUE(NAME));
INSERT INTO TAB8 VALUES(1, 'XYA');
INSERT INTO TAB8 VALUES(1, 'XYB');--UNIQUE CONSTRAINT VIOLATED
INSERT INTO TAB8 VALUES(3, 'XYA');
INSERT INTO TAB8 VALUES(4, 'XYC');
INSERT INTO TAB8(SNO) VALUES(5);
INSERT INTO TAB8(NAME) VALUES('XYE');
INSERT INTO TAB8(NAME) VALUES('XYF');
INSERT INTO TAB8(NAME) VALUES('XYG');
SELECT * FROM TAB8;
DROP TABLE TAB9;
DESC TAB8;

--COMPOSITE UNIQUE
CREATE TABLE TAB9(SNO NUMBER, NAME VARCHAR2(90), CONSTRAINT TAB9_UQ UNIQUE(SNO, NAME));
INSERT INTO TAB9 VALUES(1, 'XYA');
INSERT INTO TAB9 VALUES(1, 'XYB');--UNIQUE CONSTRAINT VIOLATED
INSERT INTO TAB9 VALUES(3, 'XYA');
INSERT INTO TAB9 VALUES(4, 'XYC');
INSERT INTO TAB9(SNO) VALUES(5);
INSERT INTO TAB9(NAME) VALUES('XYE');
INSERT INTO TAB9(NAME) VALUES('XYF');
INSERT INTO TAB9(NAME) VALUES('XYG');
SELECT * FROM TAB9;

--PRIMARY KEY CONSTRAINT | NOT NULL | UNIQUE
CREATE TABLE TAB11 (SNO NUMBER, NAME VARCHAR2(90) PRIMARY KEY);
INSERT INTO TAB11 VALUES (1, 'XYA');
INSERT INTO TAB11 VALUES (2, 'XYA');
INSERT INTO TAB11 VALUES (3, 'XYA');
INSERT INTO TAB11 VALUES (4, 'XYD');
INSERT INTO TAB11 VALUES (5, 'XYE');
INSERT INTO TAB11 VALUES (6, 'XYF');
INSERT INTO TAB11 VALUES (7, 'XYG');
INSERT INTO TAB11(SNO) VALUES(8);
DROP TABLE TAB11;
CREATE TABLE TAB11(SNO NUMBER, NAME VARCHAR2(90), CONSTRAINT TAB11_UQ PRIMARY KEY(NAME));
INSERT INTO TAB11 VALUES (1, 'XYA');
INSERT INTO TAB11 VALUES (2, 'XYA');
INSERT INTO TAB11 VALUES (3, 'XYA');
INSERT INTO TAB11(SNO) VALUES(4);
CREATE TABLE TAB11(SNO NUMBER PRIMARY KEY, NAME VARCHAR2(90) PRIMARY KEY);
CREATE TABLE TAB11(SNO NUMBER, NAME VARCHAR2(90), CONSTRAINT TAB11_PK PRIMARY KEY(SNO), CONSTRAINT TAB11_PK PRIMARY KEY(NAME));
--COMPOSITE PRIMARY KEY
CREATE TABLE TAB11(SNO NUMBER, NAME VARCHAR2(90), CONSTRAINT TAB11_PK PRIMARY KEY(SNO, NAME));
INSERT INTO TAB11(SNO) VALUES(1);
INSERT INTO TAB11 VALUES(2, 'XYB');
INSERT INTO TAB11 VALUES(3, 'XYB');
INSERT INTO TAB11 VALUES(3, 'XYC');

--FOREIGN KEY CONSTRAINT | ONLY WITH CONSTRAINT KEYWORD
DROP TABLE PERSON;
DROP TABLE ADDRESS;
CREATE TABLE PERSON(ID NUMBER, NAME VARCHAR2(90), AGE NUMBER, CONSTRAINT PERSON_PK PRIMARY KEY(ID));
CREATE TABLE ADDRESS(HOUSE_NO VARCHAR2(90), STREET_NAME VARCHAR2(90), PERSON_ID NUMBER, CONSTRAINT ADDRESS_FK FOREIGN KEY(PERSON_ID) REFERENCES PERSON(ID));--ID - REFERENCE COLUMN
INSERT INTO PERSON VALUES(1, 'VIJAY', 22);
INSERT INTO PERSON VALUES(2, 'BHARATH', 24);
INSERT INTO PERSON VALUES(3, 'XYA', 27);
INSERT INTO PERSON VALUES(4, 'XYB', 29);

INSERT INTO ADDRESS VALUES('123/M', 'BTM-STAGE1', 1);
INSERT INTO ADDRESS VALUES('789/P', 'BTM-STAGE2', 2);
SELECT * FROM PERSON;
SELECT * FROM PERSON,ADDRESS;
SELECT * FROM ADDRESS,PERSON;

CREATE TABLE PERSON(SNO NUMBER UNIQUE, NAME VARCHAR2(90), AGE NUMBER);
CREATE TABLE ADDRESS(HOUSE_NO VARCHAR2(90), STREET_NAME VARCHAR2(90), P_ID NUMBER, CONSTRAINT A_FK FOREIGN KEY(P_ID) REFERENCES PERSON(SNO)); --1. FOREIGN KEY SHOULD BE EITHER UNIQUE OR PRIMARY
INSERT INTO PERSON VALUES(1, 'VIJAY' , 22);
INSERT INTO PERSON VALUES(2, 'BHARATH' , 24);
INSERT INTO PERSON VALUES(3, 'SWETHA' , 21);

INSERT INTO ADDRESS VALUES('12/A', 'BTM-1', 1);
INSERT INTO ADDRESS VALUES('12/B', 'BTM-2', 2);
INSERT INTO ADDRESS VALUES('12/C', 'BTM-1', 3);
UPDATE ADDRESS SET HOUSE_NO='13/A', STREET_NAME='BTM-1' WHERE P_ID=2;
UPDATE ADDRESS SET HOUSE_NO='23/A', STREET_NAME='BTM-2' WHERE P_ID=3;
SELECT * FROM ADDRESS;
SELECT * FROM PERSON;
INSERT INTO ADDRESS VALUES('43/A', 'JP NAGAR', 4);--2. FOREIGN KEY VALUE SHOULD BE ONE OF THE VALUE OF THE PRIMARY KEY IN THE PARENT TABLE.
INSERT INTO ADDRESS(HOUSE_NO, STREET_NAME) VALUES('43/A', 'JP NAGAR');
UPDATE ADDRESS SET P_ID=5 WHERE HOUSE_NO='43/A';
INSERT INTO PERSON VALUES(4, 'MURALI', 34);
UPDATE ADDRESS SET P_ID=4 WHERE HOUSE_NO='43/A';
DELETE FROM ADDRESS WHERE P_ID=3;
DELETE FROM PERSON WHERE SNO=3;--3. WE CANNOT REMOVE PARENT RECORD IF IT IS MAPPED TO CHILD RECORD
DROP TABLE ADDRESS;--4. PARENT TABLE CANNOT BE REMOVED IF CHILD TABLE IS PRESENT
DROP TABLE PERSON;--EVEN THOUGH ADDRESS IS EMPTY WITHOUT REMOVING CHILD PARENT CAN'T BE REMOVED

--MAPPING 
--ONE TO ONE - PARENT TABLE ONE RECORD MAPPING TO ONLY ONE RECORD IN THE CHILD TABLE
--ONE TO MANY - PARENT RECORD MAPPING TO MULTIPLE CHILD RECORDS | CHILD SHOULD NOT BELONG TO MULTIPLE PARENT
--MANY TO MANY - ONE PARENT RECORD MAPPING TO MANY CHILD AND ONE CHILD RECORD TO MANY PARENT

--REMOVING PARENT FORCEFULLY | CASCADE
DROP TABLE PERSON CASCADE CONSTRAINTS;
DROP TABLE PERSON;
CREATE TABLE PERSON(ID NUMBER UNIQUE, NAME VARCHAR2(90), AGE NUMBER);
CREATE TABLE ADDRESS(HOUSE_NO VARCHAR2(90), STREET_NAME VARCHAR2(90), P_ID NUMBER, CONSTRAINT A_FK FOREIGN KEY(P_ID) REFERENCES PERSON(ID));
INSERT INTO PERSON VALUES(1, 'VIJAY', 22);
INSERT INTO PERSON VALUES(2, 'MOHAN', 24);
INSERT INTO PERSON VALUES(3, 'MAHESH', 25);
INSERT INTO PERSON VALUES(4, 'SWETHA', 21);
INSERT INTO PERSON VALUES(5, 'RUPA', 28);
INSERT INTO PERSON VALUES(6, 'MAHESH', 25);
INSERT INTO PERSON VALUES(7, (SELECT NAME FROM PERSON WHERE ID = 6) , 45);
UPDATE PERSON SET NAME='MURALI' WHERE ID=6;
SELECT * FROM PERSON;
INSERT INTO ADDRESS VALUES('12/A', 'BTM1', 1);
INSERT INTO ADDRESS VALUES('12/B', 'BTM1', 2);
INSERT INTO ADDRESS VALUES('12/C', 'BTM1', 3);
INSERT INTO ADDRESS VALUES('12/D', 'BTM1', 4);
INSERT INTO ADDRESS VALUES('12/E', 'BTM1', 5);
INSERT INTO ADDRESS VALUES('12/F', 'BTM1', 5);
INSERT INTO ADDRESS VALUES('12/D', 'BTM1', 6);
INSERT INTO ADDRESS(HOUSE_NO, STREET_NAME) VALUES('12/F', 'BTM1');
UPDATE ADDRESS SET P_ID=3 WHERE P_ID=4;
UPDATE ADDRESS SET HOUSE_NO='12/E' WHERE P_ID=5;
SELECT * FROM ADDRESS;
SELECT * FROM PERSON;
SELECT * FROM ADDRESS WHERE P_ID=(SELECT ID FROM PERSON WHERE NAME = 'RUPA');
SELECT NAME FROM PERSON WHERE ID=(SELECT P_ID FROM ADDRESS WHERE HOUSE_NO='12/B');
SELECT * FROM PERSON;
--JOINTS  
--INNER JOIN
SELECT * FROM PERSON P,ADDRESS A WHERE P.ID = A.P_ID;
SELECT * FROM PERSON P INNER JOIN ADDRESS A ON P.ID = A.P_ID;

--OUTER JOIN | LEFT | OUTER | FULL
SELECT * FROM PERSON P LEFT OUTER JOIN ADDRESS A ON P.ID = A.P_ID;
SELECT * FROM PERSON P RIGHT OUTER JOIN ADDRESS A ON P.ID = A.P_ID;
SELECT * FROM PERSON P FULL OUTER JOIN ADDRESS A ON P.ID = A.P_ID;

DROP TABLE PERSON;
CREATE TABLE PERSON(ID NUMBER, NAME VARCHAR2(90), AGE NUMBER, CONSTRAINT P_PK PRIMARY KEY(ID));
CREATE TABLE MOBILE_NUMBER(MOBILE_NUMBER NUMBER, SERVICE_PROVIDER VARCHAR2(90), P_ID NUMBER, CONSTRAINT M_FK FOREIGN KEY(P_ID) REFERENCES PERSON(ID));
DESC PERSON;
DESC MOBILE_NUMBER;
INSERT INTO PERSON VALUES(1, 'VIJAY', 22);
INSERT INTO PERSON VALUES(2, 'RUPA', 24);
INSERT INTO PERSON VALUES(3, 'KUMAR', 26);
INSERT INTO MOBILE_NUMBER VALUES(9857564850, 'AIRTEL', 1);
INSERT INTO MOBILE_NUMBER VALUES(9857564851, 'JIO', 1);
INSERT INTO MOBILE_NUMBER VALUES(9857564852, 'AIRTEL', 1);
INSERT INTO MOBILE_NUMBER VALUES(9585743653, 'AIRTEL', 2);
INSERT INTO MOBILE_NUMBER VALUES(9585743654, 'JIO', 2);
INSERT INTO MOBILE_NUMBER(MOBILE_NUMBER, SERVICE_PROVIDER) VALUES(9474873755, 'JIO');
DELETE FROM MOBILE_NUMBER;
SELECT * FROM MOBILE_NUMBER;
SELECT * FROM PERSON;
SELECT MOBILE_NUMBER,SERVICE_PROVIDER FROM MOBILE_NUMBER WHERE P_ID=(SELECT ID FROM PERSON WHERE NAME='VIJAY');
SELECT NAME FROM PERSON WHERE ID=(SELECT P_ID FROM MOBILE_NUMBER WHERE MOBILE_NUMBER=9857564851);

SELECT * FROM PERSON P INNER JOIN MOBILE_NUMBER M ON P.ID = M.P_ID;
SELECT * FROM PERSON P LEFT OUTER JOIN MOBILE_NUMBER M ON P.ID=M.P_ID;
SELECT * FROM PERSON P RIGHT OUTER JOIN MOBILE_NUMBER M ON P.ID=M.P_ID;
SELECT * FROM PERSON P FULL OUTER JOIN MOBILE_NUMBER M ON P.ID=M.P_ID;

--MANY TO MANY REQUIRES MIN. 3 TABLES
DROP TABLE STUDENT;
CREATE TABLE STUDENT(S_ID NUMBER UNIQUE, NAME VARCHAR2(90), AGE NUMBER);
CREATE TABLE SKILL(S_ID NUMBER UNIQUE, NAME VARCHAR2(90));
CREATE TABLE STUDENT_SKILL(STUDENT_ID NUMBER, SKILL_ID NUMBER, CONSTRAINT SS_FK1 FOREIGN KEY(STUDENT_ID) REFERENCES STUDENT(S_ID), CONSTRAINT SS_FK2 FOREIGN KEY(SKILL_ID) REFERENCES SKILL(S_ID));--INTERMEDIATE TABLE - ONLY FOR MAPPING
INSERT INTO STUDENT VALUES(1, 'VIJAY', 22);
INSERT INTO STUDENT VALUES(2, 'RUPA', 21);
INSERT INTO STUDENT VALUES(3, 'MOHAN', 23);
INSERT INTO SKILL VALUES(1, 'C');
INSERT INTO SKILL VALUES(2, 'C++');
INSERT INTO SKILL VALUES(3, 'JAVA');
INSERT INTO SKILL VALUES(4, 'ORACLE');
INSERT INTO STUDENT_SKILL VALUES(1,1);
INSERT INTO STUDENT_SKILL VALUES(1,2);
INSERT INTO STUDENT_SKILL VALUES(1,3);
INSERT INTO STUDENT_SKILL VALUES(2,2);
INSERT INTO STUDENT_SKILL VALUES(2,3);
SELECT * FROM STUDENT;
SELECT * FROM SKILL;
SELECT * FROM STUDENT_SKILL;
SELECT NAME FROM SKILL WHERE S_ID IN (SELECT SKILL_ID FROM STUDENT_SKILL WHERE STUDENT_ID=(SELECT S_ID FROM STUDENT WHERE NAME='VIJAY'));
SELECT NAME FROM STUDENT WHERE S_ID IN (SELECT STUDENT_ID FROM STUDENT_SKILL WHERE SKILL_ID=(SELECT S_ID FROM SKILL WHERE NAME='JAVA'));

SELECT NAME FROM STUDENT WHERE S_ID IN (SELECT STUDENT_ID FROM STUDENT_SKILL WHERE SKILL_ID = (SELECT S_ID FROM SKILL WHERE NAME='C'));
SELECT * FROM STUDENT STD, STUDENT_SKILL SS, SKILL SK WHERE STD.S_ID = SS.STUDENT_ID AND SS.SKILL_ID = SK.S_ID;
SELECT * FROM STUDENT STD INNER JOIN STUDENT_SKILL SS ON STD.S_ID = SS.STUDENT_ID INNER JOIN SKILL SK ON SS.SKILL_ID = SK.S_ID;
SELECT * FROM STUDENT STD INNER JOIN STUDENT_SKILL SS ON STD.S_ID = SS.STUDENT_ID RIGHT OUTER JOIN SKILL SK ON SS.SKILL_ID = SK.S_ID;
SELECT * FROM STUDENT STD RIGHT OUTER JOIN STUDENT_SKILL SS ON STD.S_ID = SS.STUDENT_ID RIGHT OUTER JOIN SKILL SK ON SS.SKILL_ID = SK.S_ID;
SELECT * FROM STUDENT STD LEFT OUTER JOIN STUDENT_SKILL SS ON STD.S_ID = SS.STUDENT_ID LEFT OUTER JOIN SKILL SK ON SS.SKILL_ID = SK.S_ID;
SELECT * FROM STUDENT STD LEFT OUTER JOIN STUDENT_SKILL SS ON STD.S_ID = SS.STUDENT_ID RIGHT OUTER JOIN SKILL SK ON SS.SKILL_ID = SK.S_ID;
SELECT * FROM STUDENT STD LEFT OUTER JOIN STUDENT_SKILL SS ON STD.S_ID = SS.STUDENT_ID  FULL OUTER JOIN SKILL SK ON SS.SKILL_ID = SK.S_ID;
SELECT * FROM STUDENT STD FULL OUTER JOIN STUDENT_SKILL SS ON STD.S_ID = SS.STUDENT_ID  FULL OUTER JOIN SKILL SK ON SS.SKILL_ID = SK.S_ID;
SELECT * FROM STUDENT STD RIGHT OUTER JOIN STUDENT_SKILL SS ON STD.S_ID = SS.STUDENT_ID FULL OUTER JOIN SKILL SK ON SS.SKILL_ID = SK.S_ID;

DROP TABLE EMPLOYEE;
CREATE TABLE EMPLOYEE(NAME VARCHAR2(90), AGE NUMBER, SALARY NUMBER, DEPT VARCHAR2(90));
INSERT INTO EMPLOYEE VALUES('VIJAY', 22, 40000, 'SOFTWARE');
INSERT INTO EMPLOYEE VALUES('RAMU', 21, 50000, 'HARDWARE');
INSERT INTO EMPLOYEE VALUES('MOHAN', 28, 30000, 'SOFTWARE');
INSERT INTO EMPLOYEE VALUES('KIRAN', 24, 60000, 'SOFTWARE');
INSERT INTO EMPLOYEE VALUES('KUMAR', 32, 42000, 'SALES');
INSERT INTO EMPLOYEE VALUES('RUPA', 31, 32000, 'HARDWARE');
INSERT INTO EMPLOYEE VALUES('REVATHI', 40, 44000, 'SALES');
INSERT INTO EMPLOYEE VALUES('MURALI', 20, 55000, 'SALES');
INSERT INTO EMPLOYEE VALUES('RAVI', 34, 51000, 'HARDWARE');
INSERT INTO EMPLOYEE VALUES('SAM', 52, 99000, 'SOFTWARE');
INSERT INTO EMPLOYEE VALUES('JHON', 22, 88000, 'SOFTWARE');
SELECT * FROM EMPLOYEE;
SELECT MAX(SALARY) FROM EMPLOYEE;
SELECT MIN(AGE) FROM EMPLOYEE;
SELECT * FROM EMPLOYEE group by DEPT;
SELECT * FROM EMPLOYEE WHERE SALARY IN (SELECT MIN(SALARY),  FROM EMPLOYEE GROUP BY DEPT);

--DATE | YY-MM-DD
--TIMESTAMP | YY-MM-DD-HH24/12-MI-SS
DROP TABLE CUSTOMER;
CREATE TABLE CUSTOMER(SNO NUMBER, NAME VARCHAR2(90), AGE NUMBER, DOJ DATE, DOB TIMESTAMP);
INSERT INTO CUSTOMER VALUES(1, 'VIJAY', 22, '10-FEB-2022', '10-DEC-1998');
INSERT INTO CUSTOMER VALUES(2, 'RUPA', 21, TO_DATE('10-02-22','dd-MM-yy'),TO_DATE('10-06-98','dd-MM-yy'));
SELECT * FROM CUSTOMER;
INSERT INTO CUSTOMER VALUES(3,'SWETHA',24,TO_DATE('10.02.22:23', 'MM.DD.YY:HH24'),TO_DATE('10.06.1998:12','MM.DD.YYYY:HH24'));
INSERT INTO CUSTOMER VALUES(3,'MOHAN',24,TO_DATE('10.02.22:23:23','MM.dd.yy:HH24:MI'),TO_DATE('10/06/1998:12:34','MM/dd/yyyy:HH24:MI'));
INSERT INTO CUSTOMER VALUES(4,'RUPESH',21,TO_DATE('10-02-22:23:23:13','MM-dd-yyyy:HH24:MI:SS'),TO_DATE('10/06/1998:12:34','MM/dd/yyyy:HH24:MI'));
DROP TABLE CUSTOMER;
CREATE TABLE CUSTOMER(SNO NUMBER,NAME VARCHAR2(90),DOJ DATE);
INSERT INTO CUSTOMER VALUES(1,'SHIVAM','12-JAN-2020');--DEFAULT DATE FORMAT
INSERT INTO CUSTOMER VALUES(2,'SAGAR',TO_DATE('12-JAN-2020:21:35:59','DD-MON-YY:HH24:MI:SS'));
SELECT*FROM CUSTOMER;--IT IS NOT SHOWING ALL OTHER FORMATS.
SELECT NAME,TO_CHAR(DOJ, 'DD-MON--YY:HH24:MI:SS') DOJ FROM CUSTOMER;
INSERT INTO CUSTOMER VALUES(3,'MOHAN',TO_DATE('13-FEB-1999:14:33:55', 'DD-MON-YYYY:HH24:MI:SS'));
INSERT INTO CUSTOMER VALUES(4,'MURALI',TO_DATE('13-FEB-1999:14:33:55', 'DD-MONTH-YYYY:HH24:MI:SS'));
SELECT * FROM CUSTOMER;
SELECT TO_CHAR(DOJ, 'DD-MON-YY:HH24:MI:SS') FROM CUSTOMER; 

CREATE TABLE PRODUCT(NAME VARCHAR2(90), PURCHASE TIMESTAMP);
INSERT INTO PRODUCT(PURCHASE) VALUES(TO_TIMESTAMP('12-FEB-44', 'DD-MONTH-YY'));
INSERT INTO PRODUCT(PURCHASE) VALUES(TO_TIMESTAMP('13-FEB-44:13', 'DD-MONTH-YY:HH24'));
INSERT INTO PRODUCT(PURCHASE) VALUES(TO_TIMESTAMP('13-FEB-44:13:59', 'DD-MONTH-YY:HH24:MI'));
INSERT INTO PRODUCT(PURCHASE) VALUES(TO_TIMESTAMP('13-FEB-44:13:59:59', 'DD-MONTH-YY:HH24:MI:SS'));
SELECT PURCHASE,TO_CHAR(PURCHASE, 'DD-MON-YY:HH24') FROM PRODUCT;
--DIFFRENCE BETWEEN DATE AND TIME STAMP : DATE INITIALLY ONLY TAKES DAY-MONTH-YEAR YOU HAVE TO USE TO_CHAR TO SEE ALL,TIME TAKES ALL INITIALLY.

--DATABASE OBJECTS
--1. TABLE
--2. SEQUENCE
--3. VIEW
--4. INDEX

--SEQUENCE
DROP TABLE PRODUCT;
CREATE TABLE PRODUCT(ID NUMBER, NAME VARCHAR2(90));
CREATE SEQUENCE PRODUCT_SEQ START WITH 1 INCREMENT BY 1;
INSERT INTO PRODUCT VALUES(PRODUCT_SEQ.NEXTVAL, 'ABC');
INSERT INTO PRODUCT VALUES(PRODUCT_SEQ.NEXTVAL, 'EFG');
INSERT INTO PRODUCT VALUES(PRODUCT_SEQ.NEXTVAL,'VIJAY');
INSERT INTO PRODUCT VALUES(PRODUCT_SEQ.NEXTVAL,'SWETHA');
INSERT INTO PRODUCT VALUES(PRODUCT_SEQ.NEXTVAL,'RUPA');
INSERT INTO PRODUCT VALUES(PRODUCT_SEQ.NEXTVAL,'SHIVAM');
INSERT INTO PRODUCT VALUES(PRODUCT_SEQ.NEXTVAL,'MAHESH');
SELECT * FROM PRODUCT;

--VIEW
CREATE VIEW PRODUCT_VIEW AS SELECT * FROM PRODUCT WHERE ID>=5;
SELECT * FROM PRODUCT_VIEW;

--INDEX
--THERE ARE SEVERAL RECORDS WHICH ARE SAVED IN DIFFERENT RECORDS.
--BY CHOODING BLOCK NO.I CAN GO THROUGH ANY RECORD DIRECTLY.
--RECORD BY RECORD CHECKING IS LINEAR SEARCH.
--FOR PRImary and unique KEYS, indexES ARE automatically CREATED.
--DATABASE MANAGER AUTOMATICALLY STORING DATA IN DIFFERENT BLOCKS BASED ON BLOCK CAPACITY.
--FOR QUICK SEARCHING INDEX REQUIRED.
--U HAVE TO CREATE EXPLICITELY FOR NON-PRIMARY NON-UNIQUE ONLY.

CREATE INDEX PRODUCT_INDEX ON PRODUCT(ID);
--DATABASE WIIL AUTOMATICALLY MAKE USE OF INDEX INTERNALLY

--NORMAL FORMS :
--DESIGN DATABASE EFFICIENTLY | AVOID DATA REDUNDANCY
--1.1NF
--2.2NF
--3.3NF

--1.NF :
--ONLY ONE VALUE SHOULD BE INSERTED IN ONE COLUMN, NOT MULTIPLE
employee
--------
sno	name	age	skills
---	----	---	------
1	ramu	22	C, C++
2	manu	23	C, Java
3	mohan	25	C, C++, Java
4	pavan	77	C, Oracle
--THE ABOVE TABLE VOILATES 1NF AND CAN IMPLEMENTED AS FOLLOWS TO FOLLOW 1NF
employee
--------
sno	name	age	
---	----	---	
1	ramu	22	
2	manu	23	
3	mohan	25	
4	pavan	77
employee_skill
--------------
emp_sno		skill
-------		-----
1		C
1		C++
2		C
2		java
3		C
3		C++
3		java
4		C
4		oracle

--2. 2NF
--IT SHOULD FOLLOW 1NF
--EVERY COLUMN SHOULD HAVE A FUNCTIONAL DEPENDENCY
trainer
-------
t_id		Name		age		subject
----		----		---		-------
    1		manu		28		Maths
    1		manu		28		Physics
    2		Ramu		38		Maths
    2		Ramu		38		Physics
--IN THE ABOVE TABLE SUBJECT AND AGE COLUMN DOES NOT HAVE FULL FUNCTIONAL DEPENDENT BUT HAVE PARTIAL DEPENDENCY
TRAINER
-------
t_id	name	age
----	----	---
1	Manu	28
2	Ramu	38
TRAINER_SUBJECT
---------------
t_id	subject
----	-------
1	Maths
1	Physics
2	Maths
2	Physics
--THE ABOVE TABLE WAS MADE INTO TWO IN WHICH EVERY COLUMN IS FUNCTIONAL DEPENDENT

--3. 3NF :
--IT SHOULD FOLLOW 2NF
--NON-PRIMARY KEY COLUMN SHOULD NOT DEPEND NOT OTHER NON-PRIMARY COLUMN | AVOID TRANISIENT DEPEDENCY(NON-PRIMARY KEY COLUMN DEPENDS 0N OTHER NON-PRIMARY COLUMN)
CREATE TABLE CUSTOMERS(
   CUST_ID       NUMBER NOT NULL PRIMARY KEY,
   CUST_NAME     VARCHAR2 (20)      NOT NULL,
   DOB           DATE,
   EMAIL_ID      VARCHAR2(256),
   
   STREET        VARCHAR2(200),
   CITY          VARCHAR2(100),
   STATE         VARCHAR2(100),
   ZIP           VARCHAR2(12)
);
--IN THE ABOVE CODE DOB,NAME,EMAIL DEPENDING ON CUST_ID BUT STREET,CITY,STATE DEPENDING ON ZIP
CREATE TABLE ADDRESS(
   ZIP           VARCHAR2(12) PRIMARY KEY,
   STREET        VARCHAR2(200),
   CITY          VARCHAR2(100),
   STATE         VARCHAR2(100)
);
CREATE TABLE CUSTOMERS(
   CUST_ID       NUMBER              NOT NULL,
   CUST_NAME     VARCHAR2 (20)      NOT NULL,
   DOB           DATE,
   ZIP           VARCHAR2(12) UNIQUE,
   EMAIL_ID      VARCHAR2(256),
   CONSTRAINT CS_FK1 FOREIGN KEY (ZIP) REFERENCES ADDRESS(ZIP)
);
--TO MAKE THE ABOVE TABLE 3NF INTO TWO SO THAT TRANSIENT DEPENDENCY IS SOLVED
--AND INTRODUCE FOREIGN KEY TO MAKE THE TWO TABLE RELATED.


--PRACTICE | ****************************************************************************

--DROP 
DROP TABLE PRODUCT CASCADE CONSTRAINTS PURGE;--PURGE : TABLE CONNOT BE RECOVERED

--UPDATE VIEW 
--CREATE OR REPLACE IS USED TO MODIFY VIEW WITHOUT MODIFYING IT.
CREATE VIEW PRO_1 AS SELECT * FROM PRODUCT WHERE ID>=4;
SELECT * FROM PRO_1;
CREATE OR REPLACE VIEW PRO_1 AS SELECT * FROM PRODUCT WHERE ID>=3;

--HAVAING | HAVING CLAUSE IS USED WITH GROUP BY TO RESTRICT THE GROUP OF RETURNED ROWS.
DROP TABLE PERSON CASCADE CONSTRAINTS PURGE;
CREATE TABLE PERSON(NAME VARCHAR2(90), AGE NUMBER, SALARY NUMBER, STATE VARCHAR2(90));
INSERT INTO PERSON VALUES('DFS', 43, 10000, 'BIHAR');
INSERT INTO PERSON VALUES('DFS', 43, 20000, 'BIHAR');
INSERT INTO PERSON VALUES('DFS', 43, 30000, 'BIHAR');
INSERT INTO PERSON VALUES('DFS', 43, 90000, 'GOA');
INSERT INTO PERSON VALUES('DFS', 43, 10000, 'GOA');
INSERT INTO PERSON VALUES('DFS', 43, 30000, 'GOA');
INSERT INTO PERSON VALUES('DFS', 43, 40000, 'TAMIL');
INSERT INTO PERSON VALUES('DFS', 43, 60000, 'TAMIL');
INSERT INTO PERSON VALUES('DFS', 43, 10000, 'TAMIL');
INSERT INTO PERSON VALUES('DFS', 43, 10000, 'UP');
INSERT INTO PERSON VALUES('DFS', 43, 20000, 'UP');
SELECT STATE,COUNT(*) FROM PERSON WHERE SALARY = 10000 GROUP BY STATE HAVING COUNT(*) <= 2;--HAVING IS PERFORMED ON THE AGGREGATE FUNCTION OF THE GROUP BY COLUMN


