CREATE DATABASE IF NOT EXISTS homebudget;

ALTER DATABASE homebudget
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;

GRANT ALL PRIVILEGES ON homebudget.* TO root@localhost IDENTIFIED BY 'root';

USE homebudget;


CREATE TABLE IF NOT EXISTS entries (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  user_id INT(4) UNSIGNED NOT NULL,
  type VARCHAR(30),
  description VARCHAR(256),
  value DECIMAL,
  date DATE,
  FOREIGN KEY (user_id) REFERENCES users(id)
) engine=InnoDB;
