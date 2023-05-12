--UNION
/*
IT IS USED TO COMBINE TWO OR MORE ORACLE SELECT STATEMENTS AND REMOVE THE DUPLICATE ROWS BETWEEN THEM.

ONE MUST THE COLUMN AND DATA TYPE FROM BOTH OR MORE SELECT QUERIES, IF NOT MATCH THEM USING TO_CHAR FUNCTION
*/
DROP TABLE EMPLOYEES;
CREATE TABLE EMPLOYEES(SNO NUMBER, NAME VARCHAR2(90), EMAIL VARCHAR2(90));
INSERT INTO EMPLOYEES VALUES(1, 'ABC', 'ABC@COM');
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
INSERT INTO CONTACT VALUES(1, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(2, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(1, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(1, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(1, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(3, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(3, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(3, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(4, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(4, 'ABC', 'ABC@COM');
INSERT INTO CONTACT VALUES(4, 'ABC', 'ABC@COM');
SELECT * FROM CONTACT;
UPDATE CONTACT SET NAME='XYZ',EMAIL='XYZ@COM' WHERE SNO=15;

SELECT SNO,NAME,'CONTACT' FROM CONTACT UNION SELECT SNO,NAME,'EMPLOYEE' FROM EMPLOYEES;

/*
UNION ALL - SAME AS UNION, COMBINES TWO OR MORE TABLES, EXCEPT IT DOES NOT REMOVE DUPLICATES.
*/
SELECT SNO,NAME,'CONTACT' FROM CONTACT UNION ALL SELECT SNO,NAME,'EMPLOYEE' FROM EMPLOYEES;