/*
 * Engine: H2DB
 * Version: 0.0.1
 * Description: Initial database structure
 */

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `id` bigint(20) PRIMARY KEY AUTO_INCREMENT,
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_modified_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `name` VARCHAR(128),
  `email` VARCHAR(128),
  `mobile_number` VARCHAR(128)
);