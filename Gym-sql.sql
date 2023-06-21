

create database gymdata1;
use gymdata1;
CREATE TABLE user (
  email VARCHAR(20),
  adharno INTEGER(12) UNIQUE,
  age INTEGER(2),
  gender VARCHAR(7),
  mno INTEGER(10),
  password VARCHAR(15) UNIQUE,
  uname VARCHAR(10) PRIMARY KEY
);


select * from user;
