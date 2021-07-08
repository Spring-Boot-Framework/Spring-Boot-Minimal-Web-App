/*
 * Engine: H2DB
 * Version: 0.0.1
 * Description: Sample Data
 */

--
-- Data for table `Rest_Controller_Response`
--

INSERT INTO `rest_controller_response` (`verb`,`content`) VALUES ('GET','GET method handled');
INSERT INTO `rest_controller_response` (`verb`,`content`) VALUES ('PUT','PUT method handled');
INSERT INTO `rest_controller_response` (`verb`,`content`) VALUES ('POST','POST method handled');
INSERT INTO `rest_controller_response` (`verb`,`content`) VALUES ('DELETE','DELETE method handled');

--
-- Data for table `person

INSERT INTO `person` (`name`,`email`,`mobile_number`) VALUES ('John','example1@domain.com','1234567890');
INSERT INTO `person` (`name`,`email`,`mobile_number`) VALUES ('Jane','example2@domain.com','1234567891');
