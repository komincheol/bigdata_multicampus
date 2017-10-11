
/* Drop Tables */

DROP TABLE TB_Account CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE seq_account;




/* Create Sequences */

CREATE SEQUENCE seq_account;



/* Create Tables */

CREATE TABLE TB_Account
(
	id number NOT NULL,
	firstname varchar2(20) NOT NULL,
	lastname varchar2(20) NOT NULL,
	emailaddress varchar2(20) NOT NULL,
	PRIMARY KEY (id)
);



select * from tb_account;
