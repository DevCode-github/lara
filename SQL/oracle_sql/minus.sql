
--COMPARES TWO QUERIES AND RETURN DISTINCT ROWS FROM FIRST QUERRY THAT ARE IN THE OUPUT OF THE SECOND QUERRY.

DROP TABLE EMPLOYEES;
CREATE TABLE EMPLOYEES(SNO NUMBER, NAME VARCHAR2(90), EMAIL VARCHAR2(90));
INSERT INTO EMPLOYEES VALUES(1, 'ABC', 'ABC@COM');--DISTINCT ROW
INSERT INTO EMPLOYEES VALUES(2, 'ABC', 'ABC@COM');
INSERT INTO EMPLOYEES VALUES(3, 'ABC', 'ABC@COM');
INSERT INTO EMPLOYEES VALUES(4, 'ABC', 'ABC@COM');
INSERT INTO EMPLOYEES VALUES(4, 'ABC', 'ABC@COM');
INSERT INTO EMPLOYEES VALUES(4, 'ABC', 'ABC@COM');
INSERT INTO EMPLOYEES VALUES(4, 'ABC', 'ABC@COM');
INSERT INTO EMPLOYEES VALUES(3, 'ABC', 'ABC@COM');
INSERT INTO EMPLOYEES VALUES(3, 'ABC', 'ABC@COM');
INSERT INTO EMPLOYEES VALUES(2, 'ABC', 'ABC@COM');
SELECT * FROM EMPLOYEES;
UPDATE EMPLOYEES SET NAME='XYZ',EMAIL='XYZ@COM' WHERE SNO=15;

DROP TABLE CONTACT;
CREATE TABLE CONTACT(SNO NUMBER, NAME VARCHAR2(90), EMAIL VARCHAR2(90));
INSERT INTO CONTACT VALUES(2, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(2, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(2, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(3, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(4, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(3, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(3, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(3, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(4, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(4, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(4, 'ABC', 'ABC@COM');
SELECT * FROM CONTACT;
UPDATE CONTACT SET NAME='XYZ',EMAIL='XYZ@COM' WHERE SNO=15;

SELECT * FROM EMPLOYEES MINUS SELECT * FROM CONTACT;