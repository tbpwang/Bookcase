DROP DATABASE IF EXISTS db_bookcase;
CREATE DATABASE db_bookcase;

DROP TABLE IF EXISTS db_bookcase.user;
CREATE TABLE db_bookcase.user (
  id       INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255)
);

DROP TABLE IF EXISTS db_bookcase.book;
CREATE TABLE db_bookcase.book (
  id        INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  title     VARCHAR(255) NOT NULL,
  author    VARCHAR(255),
  printDate DATE,
  price     DECIMAL,
  amount    INT
);
SELECT *
FROM db_bookcase.book;

INSERT INTO db_bookcase.user (username, password) VALUES ("tester", "test");
SELECT *
FROM db_bookcase.user;