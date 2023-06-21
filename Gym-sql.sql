

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
INSERT INTO user (email, adharno, age, gender, mno, password, uname) VALUES
  ('john.doe@gmail.com', 123456789012, 25, 'Male', 9876543210, 'P@ssw0rd1', 'johndoe'),
  ('jane.smith@gmail.com', 234567890123, 30, 'Female', 8765432109, 'P@ssw0rd2', 'janesmith'),
  ('james.williams@gmail.com', 345678901234, 35, 'Male', 7654321098, 'P@ssw0rd3', 'jameswilliams'),
  ('mary.johnson@gmail.com', 456789012345, 40, 'Female', 6543210987, 'P@ssw0rd4', 'maryjohnson'),
  ('robert.jones@gmail.com', 567890123456, 45, 'Male', 5432109876, 'P@ssw0rd5', 'robertjones'),
  ('linda.davis@gmail.com', 678901234567, 50, 'Female', 4321098765, 'P@ssw0rd6', 'lindadavis'),
  ('michael.miller@gmail.com', 789012345678, 36, 'Male', 3210987654, 'P@ssw0rd7', 'michaelmiller'),
  ('sarah.anderson@gmail.com', 890123456789, 23, 'Female', 2109876543, 'P@ssw0rd8', 'sarahanderson'),
  ('william.wilson@gmail.com', 901234567890, 28, 'Male', 1098765432, 'P@ssw0rd9', 'williamwilson'),
  ('emily.thomas@gmail.com', 123456789010, 34, 'Female', 9876543210, 'P@ssw0rd10', 'emilythomas');





