CREATE DATABASE IF NOT EXISTS ifsis DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE ifsis;

CREATE TABLE user (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(100) NOT NULL,
  email varchar(100) NOT NULL,
  password varchar(255) NOT NULL,
  creation_date datetime NOT NULL DEFAULT current_timestamp(),
  usergroup_id int(11),
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO user (name, email, password, creation_date) VALUES
('Emily Johnson', 'emily@example.com', CONCAT('X7y$', SUBSTRING(MD5(RAND()), 1, 8)), current_timestamp()),
('John Smith', 'john@example.com', CONCAT('K3z$', SUBSTRING(MD5(RAND()), 1, 8)), current_timestamp()),
('Anna Davis', 'anna@example.com', CONCAT('M9u$', SUBSTRING(MD5(RAND()), 1, 8)), current_timestamp());

COMMIT;

ALTER TABLE user
ADD COLUMN status int(1) NOT NULL DEFAULT 1;

CREATE TABLE usergroup (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(100) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE productcategory (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(100) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE product (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(100) NOT NULL,
  unitOfMeasure varchar(15),
  registrationDate datetime DEFAULT current_timestamp,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE client (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(100) NOT NULL,
  clientType int(1) NOT NULL,
  cpfcnpj varchar(15) NOT NULL,
  phone varchar(20),
  email varchar(100),
  observation varchar(255),
  registrationDate datetime DEFAULT current_timestamp,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


