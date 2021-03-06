/*
 * Engine: H2DB
 * Version: 0.0.1
 * Description: Initial database structure
 */

--
-- Table structure for table `address`
--

CREATE TABLE `address` (
  `id` bigint(20) PRIMARY KEY AUTO_INCREMENT,
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_modified_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `city` varchar(255),
  `zipcode` varchar(255)
);

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `id` bigint(20) PRIMARY KEY AUTO_INCREMENT,
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_modified_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `name` VARCHAR(128),
  `email` VARCHAR(128),
  `mobile_number` VARCHAR(128),
  `address_id` bigint(20)
);

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `id` bigint(20) PRIMARY KEY AUTO_INCREMENT,
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_modified_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `title` varchar(255) NOT NULL,
  `person_id` bigint(20) DEFAULT NULL,
  KEY `FK5w75tx731o2t3abhgesnobgih` (`person_id`),
  CONSTRAINT `FK5w75tx731o2t3abhgesnobgih` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`)
);







