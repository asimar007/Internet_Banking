CREATE DATABASE  IF NOT EXISTS `admin` 
USE `admin`;
-- Table structure for table `info`

DROP TABLE IF EXISTS `info`;

CREATE TABLE `info` (
  `name` varchar(100) DEFAULT NULL,
  `pass` varchar(45) NOT NULL,
  PRIMARY KEY (`pass`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table `info`

LOCK TABLES `info` WRITE;

INSERT INTO `info` VALUES ('Hello','hello2021'),('Shivani','shivani2001');

UNLOCK TABLES;

CREATE DATABASE  IF NOT EXISTS `banking`
USE `banking`;

-- Table structure for table `account`

DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `balance` varchar(50) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `phoneno` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table `account`

LOCK TABLES `account` WRITE;

INSERT INTO `account` VALUES (2,'Radha Devi','100000','Thane','0987654321'),(2001,'Hello','77400','Pune','1234567890'),(23112001,'Dipika','100000','Kharghar','5656565656'),(31102001,'Priyanka','502000','Ghansoli','4545454545');

UNLOCK TABLES;

-- Table structure for table `login`

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `name` varchar(50) NOT NULL,
  `pass` varchar(45) DEFAULT NULL,
  `mno` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table `login`

LOCK TABLES `login` WRITE;

INSERT INTO `login` VALUES ('Dipika','dipika','5656565656'),('Hello','hello','1234567890'),('Niharika','niharika','5214789635'),('Priyanka','priyanka','4545454545'),('shivani','shivani','123456789');

UNLOCK TABLES;
