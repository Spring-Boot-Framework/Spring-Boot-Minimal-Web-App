--
-- Table structure for table `Rest_Controller_Response`
--

CREATE TABLE `rest_controller_response` (
  `id` bigint(20) PRIMARY KEY AUTO_INCREMENT,
  `verb` varchar(255) NOT NULL,
  `content` varchar(255) NOT NULL
);