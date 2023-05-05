--DROP 
/*
cascade constraints is used to drop the table forcefully,
if the table has child table somewhere.
*/
DROP TABLE PRODUCT CASCADE CONSTRAINTS PURGE;
--PURGE : TABLE CONNOT BE RECOVERED | A PERMANANT DELETE