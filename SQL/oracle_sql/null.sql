--NULL IS MARKER FOR MISSING INFORMATION OR THE INFORMATION IS NOT APPLICABLE
--NULL IS NOT LIKE ANYOTHER VALUE LIKE NUMBER OR CHARACTER STRING, IT CANNOT BE COMPARED TO '0' OR ''.
--GENERALLY NULL IS NOT EQUAL TO NULL.

CREATE TABLE NULL_TAB (ID NUMBER,NAME VARCHAR2(90));
CREATE SEQUENCE NULL_TAB_S START WITH 1 INCREMENT BY 1;
INSERT INTO NULL_TAB VALUES(NULL_TAB_S.NEXTVAL, NULL);
INSERT INTO NULL_TAB VALUES(NULL_TAB_S.NEXTVAL, NULL);
INSERT INTO NULL_TAB VALUES(NULL_TAB_S.NEXTVAL, NULL);
INSERT INTO NULL_TAB VALUES(NULL_TAB_S.NEXTVAL, NULL);
INSERT INTO NULL_TAB VALUES(NULL_TAB_S.NEXTVAL, 'RUPESH');
SELECT * FROM NULL_TAB;

--IS NULL
SELECT * FROM NULL_TAB WHERE NAME IS NULL;

--IS NOT NULL
SELECT * FROM NULL_TAB WHERE NAME IS NOT NULL;
