/*
 * Engine: MySQL
 * Version: 0.0.1
 * Description: Initial database structure
 */

/*
-- create schema
CREATE SCHEMA sbmwa;

-- use schema
USE sbmwa;

-- Create user 
create user 'sbmwa'@'localhost' identified by 'sbmwa';

-- Grant privileges to user
grant all privileges on *.* to 'sbmwa'@'localhost' with grant option;
 */

--
-- Table structure for table `Rest_Controller_Response`
--

CREATE TABLE `rest_controller_response` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_modified_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `content` varchar(255) DEFAULT NULL,
  `verb` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;