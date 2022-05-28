DROP TABLE IF EXISTS education;

CREATE TABLE education (
  id int AUTO_INCREMENT PRIMARY KEY,
  username varchar(45) NOT NULL,
  school varchar(100) NOT NULL,
  degree varchar(100) NOT NULL
);

insert into education (username, school, degree)
values ('rezacomplete@gmail.com', 'Harvard', 'MBA');