
/* Drop Tables */

DROP TABLE Apply CASCADE CONSTRAINTS;
DROP TABLE Teacher CASCADE CONSTRAINTS;
DROP TABLE Genre CASCADE CONSTRAINTS;
DROP TABLE tb_member CASCADE CONSTRAINTS;
DROP TABLE Grade CASCADE CONSTRAINTS;
DROP TABLE Team CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE sql_dance;




/* Create Sequences */

CREATE SEQUENCE sql_dance;



/* Create Tables */

CREATE TABLE Apply
(
	tb_memberid varchar2(20) NOT NULL,
	teamid number NOT NULL,
	genre1 number NOT NULL,
	genre2 number,
	genre3 number,
	PRIMARY KEY (tb_memberid, teamid)
);


CREATE TABLE Genre
(
	genreid number NOT NULL,
	gname varchar2(50) NOT NULL,
	PRIMARY KEY (genreid)
);


CREATE TABLE Grade
(
	gradeid number NOT NULL,
	gardename varchar2(11) NOT NULL,
	PRIMARY KEY (gradeid)
);


CREATE TABLE Teacher
(
	tname varchar2(50) NOT NULL,
	genreid number NOT NULL,
	teamid number NOT NULL,
	PRIMARY KEY (genreid, teamid)
);


CREATE TABLE Team
(
	teamid number NOT NULL,
	teamname varchar2(50) NOT NULL,
	PRIMARY KEY (teamid)
);


CREATE TABLE tb_member
(
	tb_memberid varchar2(20) NOT NULL,
	tb_memberpwd varchar2(20) NOT NULL,
	name varchar2(30) NOT NULL,
	birthday date NOT NULL,
	gender varchar2(5) NOT NULL,
	email varchar2(50) NOT NULL,
	phone varchar2(12) NOT NULL,
	gradeid number NOT NULL,
	PRIMARY KEY (tb_memberid)
);



/* Create Foreign Keys */

ALTER TABLE Apply
	ADD FOREIGN KEY (genre3)
	REFERENCES Genre (genreid)
;


ALTER TABLE Apply
	ADD FOREIGN KEY (genre1)
	REFERENCES Genre (genreid)
;


ALTER TABLE Apply
	ADD FOREIGN KEY (genre2)
	REFERENCES Genre (genreid)
;


ALTER TABLE Teacher
	ADD FOREIGN KEY (genreid)
	REFERENCES Genre (genreid)
;


ALTER TABLE tb_member
	ADD FOREIGN KEY (gradeid)
	REFERENCES Grade (gradeid)
;


ALTER TABLE Apply
	ADD FOREIGN KEY (teamid)
	REFERENCES Team (teamid)
;


ALTER TABLE Teacher
	ADD FOREIGN KEY (teamid)
	REFERENCES Team (teamid)
;


ALTER TABLE Apply
	ADD FOREIGN KEY (tb_memberid)
	REFERENCES tb_member (tb_memberid)
;


select * from tb_member;


INSERT INTO tb_member(tb_memberid, tb_memberpwd, name, birthday, gender, email, phone, gradeid)
VALUES('jckmm' , '1234' , 'ko' , '19920611' , '1' , 'jckmm' , '01011111111', '1');
