--
-- Table structure for table `Rest_Controller_Response`
--

CREATE TABLE `rest_controller_response` (
  `id` bigint(20) PRIMARY KEY AUTO_INCREMENT,
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_modified_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `verb` varchar(255) NOT NULL,
  `content` varchar(255) NOT NULL
);