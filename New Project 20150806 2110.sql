-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.73-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema mydb
--

CREATE DATABASE IF NOT EXISTS mydb;
USE mydb;

--
-- Definition of table `add_machine`
--

DROP TABLE IF EXISTS `add_machine`;
CREATE TABLE `add_machine` (
  `Machine_no` varchar(45) NOT NULL,
  `Machine_name` varchar(45) DEFAULT NULL,
  `Date_of_addition` date DEFAULT NULL,
  `Store_keeper_job_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Machine_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_machine`
--

/*!40000 ALTER TABLE `add_machine` DISABLE KEYS */;
/*!40000 ALTER TABLE `add_machine` ENABLE KEYS */;


--
-- Definition of table `add_meterial`
--

DROP TABLE IF EXISTS `add_meterial`;
CREATE TABLE `add_meterial` (
  `material_no` varchar(45) NOT NULL,
  `Mat_sub_cat` varchar(45) NOT NULL,
  `Mat_Name` varchar(45) DEFAULT NULL,
  `Rack_no` int(11) DEFAULT NULL,
  `Date_of_Addition` date DEFAULT NULL,
  `quant` int(11) DEFAULT NULL,
  `unit_price` float DEFAULT NULL,
  PRIMARY KEY (`Mat_sub_cat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_meterial`
--

/*!40000 ALTER TABLE `add_meterial` DISABLE KEYS */;
/*!40000 ALTER TABLE `add_meterial` ENABLE KEYS */;


--
-- Definition of table `application`
--

DROP TABLE IF EXISTS `application`;
CREATE TABLE `application` (
  `Application_id` varchar(45) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Application_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `application`
--

/*!40000 ALTER TABLE `application` DISABLE KEYS */;
/*!40000 ALTER TABLE `application` ENABLE KEYS */;


--
-- Definition of table `approved_leaves`
--

DROP TABLE IF EXISTS `approved_leaves`;
CREATE TABLE `approved_leaves` (
  `id_app` int(11) NOT NULL,
  `Customer` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_app`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `approved_leaves`
--

/*!40000 ALTER TABLE `approved_leaves` DISABLE KEYS */;
/*!40000 ALTER TABLE `approved_leaves` ENABLE KEYS */;


--
-- Definition of table `attendence`
--

DROP TABLE IF EXISTS `attendence`;
CREATE TABLE `attendence` (
  `idattendence` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `currentA` int(10) unsigned DEFAULT NULL,
  `currentTL` int(10) unsigned DEFAULT NULL,
  `remainL` int(10) unsigned DEFAULT NULL,
  `CSLeaves` int(10) unsigned DEFAULT NULL,
  `ESLeaves` int(10) unsigned DEFAULT NULL,
  `timeout` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `timein` varchar(45) DEFAULT NULL,
  `checkatt` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idattendence`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendence`
--

/*!40000 ALTER TABLE `attendence` DISABLE KEYS */;
/*!40000 ALTER TABLE `attendence` ENABLE KEYS */;


--
-- Definition of table `boq`
--

DROP TABLE IF EXISTS `boq`;
CREATE TABLE `boq` (
  `BOQ_id` int(11) NOT NULL AUTO_INCREMENT,
  `Project_name` varchar(45) DEFAULT NULL,
  `Job_code` varchar(45) DEFAULT NULL,
  `Job_num` varchar(45) DEFAULT NULL,
  `BOQ_type` varchar(45) DEFAULT NULL,
  `Create_date` date DEFAULT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `Calc Date` date DEFAULT NULL,
  `Total_amount` double DEFAULT NULL,
  `Profit` double DEFAULT NULL,
  `Tax` double DEFAULT NULL,
  `Expenses` double DEFAULT NULL,
  PRIMARY KEY (`BOQ_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `boq`
--

/*!40000 ALTER TABLE `boq` DISABLE KEYS */;
/*!40000 ALTER TABLE `boq` ENABLE KEYS */;


--
-- Definition of table `boq items`
--

DROP TABLE IF EXISTS `boq items`;
CREATE TABLE `boq items` (
  `code` int(11) NOT NULL,
  `levid` int(11) DEFAULT NULL,
  `secid` int(11) DEFAULT NULL,
  `retyid` int(11) DEFAULT NULL,
  `matid` int(11) DEFAULT NULL,
  `appid` int(11) DEFAULT NULL,
  `qun` int(11) DEFAULT NULL,
  `unit` varchar(45) DEFAULT NULL,
  `rate` int(11) DEFAULT NULL,
  `markup` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `boq items`
--

/*!40000 ALTER TABLE `boq items` DISABLE KEYS */;
/*!40000 ALTER TABLE `boq items` ENABLE KEYS */;


--
-- Definition of table `boq type`
--

DROP TABLE IF EXISTS `boq type`;
CREATE TABLE `boq type` (
  `idBOQ type` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idBOQ type`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `boq type`
--

/*!40000 ALTER TABLE `boq type` DISABLE KEYS */;
/*!40000 ALTER TABLE `boq type` ENABLE KEYS */;


--
-- Definition of table `boq_materials`
--

DROP TABLE IF EXISTS `boq_materials`;
CREATE TABLE `boq_materials` (
  `matid` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `unit` varchar(5) DEFAULT NULL,
  `rate` double DEFAULT NULL,
  `markup` double DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`matid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `boq_materials`
--

/*!40000 ALTER TABLE `boq_materials` DISABLE KEYS */;
/*!40000 ALTER TABLE `boq_materials` ENABLE KEYS */;


--
-- Definition of table `cus_payment`
--

DROP TABLE IF EXISTS `cus_payment`;
CREATE TABLE `cus_payment` (
  `idCus_payment` int(11) NOT NULL AUTO_INCREMENT,
  `Cust_no` varchar(45) DEFAULT NULL,
  `Project_id` varchar(45) DEFAULT NULL,
  `Project_status` varchar(45) DEFAULT NULL,
  `Project_level` varchar(45) DEFAULT NULL,
  `Amount` double DEFAULT NULL,
  PRIMARY KEY (`idCus_payment`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cus_payment`
--

/*!40000 ALTER TABLE `cus_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `cus_payment` ENABLE KEYS */;


--
-- Definition of table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `Cust_id` int(11) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Cust_type` varchar(45) DEFAULT NULL,
  `Company_type` varchar(45) DEFAULT NULL,
  `Cus_nic_Comp_no` varchar(45) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Telephone` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;


--
-- Definition of table `customer_invoice`
--

DROP TABLE IF EXISTS `customer_invoice`;
CREATE TABLE `customer_invoice` (
  `id` int(11) NOT NULL,
  `Cust_id` varchar(45) DEFAULT NULL,
  `invoice_date` date DEFAULT NULL,
  `invoice_from` date DEFAULT NULL,
  `invoice_to` date DEFAULT NULL,
  `levels` varchar(45) DEFAULT NULL,
  `Due_date` date DEFAULT NULL,
  `Description` varchar(200) DEFAULT NULL,
  `payment_mode` varchar(45) DEFAULT NULL,
  `Total_payable` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer_invoice`
--

/*!40000 ALTER TABLE `customer_invoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer_invoice` ENABLE KEYS */;


--
-- Definition of table `daily status`
--

DROP TABLE IF EXISTS `daily status`;
CREATE TABLE `daily status` (
  `Material No` int(11) NOT NULL,
  `Material_sub_cat_no` varchar(45) NOT NULL,
  `Current_date` date DEFAULT NULL,
  `store keeper Job_id` varchar(45) DEFAULT NULL,
  `unit_price` float DEFAULT NULL,
  `Grn_note_no` int(11) DEFAULT NULL,
  `R_qty` int(11) DEFAULT NULL,
  `G_req_note_no` int(11) DEFAULT NULL,
  `issued_qty` int(11) DEFAULT NULL,
  `Return_req_level` int(11) DEFAULT NULL,
  `max_stock_level` int(11) DEFAULT NULL,
  `min_stock_level` int(11) DEFAULT NULL,
  PRIMARY KEY (`Material_sub_cat_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='\n\n\n';

--
-- Dumping data for table `daily status`
--

/*!40000 ALTER TABLE `daily status` DISABLE KEYS */;
/*!40000 ALTER TABLE `daily status` ENABLE KEYS */;


--
-- Definition of table `daily_machine_status`
--

DROP TABLE IF EXISTS `daily_machine_status`;
CREATE TABLE `daily_machine_status` (
  `Machine_no` varchar(45) NOT NULL,
  `Machine_name` varchar(45) DEFAULT NULL,
  `Receive_date` date DEFAULT NULL,
  `Delivered_date` date DEFAULT NULL,
  `No_of_machine_received` int(11) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `Store_keeper_job_id` varchar(45) DEFAULT NULL,
  `No_of_machine_delivered` int(11) DEFAULT NULL,
  PRIMARY KEY (`Machine_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `daily_machine_status`
--

/*!40000 ALTER TABLE `daily_machine_status` DISABLE KEYS */;
/*!40000 ALTER TABLE `daily_machine_status` ENABLE KEYS */;


--
-- Definition of table `daily_progress`
--

DROP TABLE IF EXISTS `daily_progress`;
CREATE TABLE `daily_progress` (
  `Progress_id` int(11) NOT NULL AUTO_INCREMENT,
  `Date` varchar(45) DEFAULT NULL,
  `SC id` varchar(45) DEFAULT NULL,
  `Specialization` varchar(45) DEFAULT NULL,
  `Site_name` varchar(45) DEFAULT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `Images` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Progress_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `daily_progress`
--

/*!40000 ALTER TABLE `daily_progress` DISABLE KEYS */;
/*!40000 ALTER TABLE `daily_progress` ENABLE KEYS */;


--
-- Definition of table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `idemployee` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `occupation` varchar(45) DEFAULT NULL,
  `contactno` int(10) unsigned DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `empimage` varchar(345) DEFAULT NULL,
  `cvimage` varchar(345) DEFAULT NULL,
  PRIMARY KEY (`idemployee`)
) ENGINE=InnoDB AUTO_INCREMENT=385456717 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;


--
-- Definition of table `employee_leave_req`
--

DROP TABLE IF EXISTS `employee_leave_req`;
CREATE TABLE `employee_leave_req` (
  `id_req` int(11) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Occupation` varchar(45) DEFAULT NULL,
  `Reason` varchar(45) DEFAULT NULL,
  `Leave_type` varchar(45) DEFAULT NULL,
  `Dates` int(11) DEFAULT NULL,
  `Send` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_req`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee_leave_req`
--

/*!40000 ALTER TABLE `employee_leave_req` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_leave_req` ENABLE KEYS */;


--
-- Definition of table `exp_payment`
--

DROP TABLE IF EXISTS `exp_payment`;
CREATE TABLE `exp_payment` (
  `pay_id` int(11) NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `cheque_no` int(45) DEFAULT NULL,
  `Other_exp_exp_id` int(11) NOT NULL,
  PRIMARY KEY (`pay_id`,`Other_exp_exp_id`),
  KEY `fk_exp_payment_Other_exp1` (`Other_exp_exp_id`),
  CONSTRAINT `fk_exp_payment_Other_exp1` FOREIGN KEY (`Other_exp_exp_id`) REFERENCES `other_exp` (`exp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `exp_payment`
--

/*!40000 ALTER TABLE `exp_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `exp_payment` ENABLE KEYS */;


--
-- Definition of table `levels`
--

DROP TABLE IF EXISTS `levels`;
CREATE TABLE `levels` (
  `Level_id` int(11) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Level_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `levels`
--

/*!40000 ALTER TABLE `levels` DISABLE KEYS */;
/*!40000 ALTER TABLE `levels` ENABLE KEYS */;


--
-- Definition of table `material_request_note`
--

DROP TABLE IF EXISTS `material_request_note`;
CREATE TABLE `material_request_note` (
  `Mat_no` varchar(45) NOT NULL,
  `Mat_sub_cat_no` varchar(45) NOT NULL,
  `Mat_name` varchar(45) DEFAULT NULL,
  `Unit_amount` int(11) DEFAULT NULL,
  `Current_date` date DEFAULT NULL,
  `require_date` date DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `store_keeper_job_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Mat_sub_cat_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `material_request_note`
--

/*!40000 ALTER TABLE `material_request_note` DISABLE KEYS */;
/*!40000 ALTER TABLE `material_request_note` ENABLE KEYS */;


--
-- Definition of table `other_exp`
--

DROP TABLE IF EXISTS `other_exp`;
CREATE TABLE `other_exp` (
  `exp_id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `time` time DEFAULT NULL,
  `Amount` double DEFAULT NULL,
  PRIMARY KEY (`exp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `other_exp`
--

/*!40000 ALTER TABLE `other_exp` DISABLE KEYS */;
/*!40000 ALTER TABLE `other_exp` ENABLE KEYS */;


--
-- Definition of table `project_images`
--

DROP TABLE IF EXISTS `project_images`;
CREATE TABLE `project_images` (
  `idProject_images` int(11) NOT NULL,
  `Img_name` varchar(45) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  PRIMARY KEY (`idProject_images`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project_images`
--

/*!40000 ALTER TABLE `project_images` DISABLE KEYS */;
/*!40000 ALTER TABLE `project_images` ENABLE KEYS */;


--
-- Definition of table `projects`
--

DROP TABLE IF EXISTS `projects`;
CREATE TABLE `projects` (
  `Proj_id` int(11) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Est_cost` varchar(45) DEFAULT NULL,
  `Pro_status` varchar(45) DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `Duration` varchar(45) DEFAULT NULL,
  `Const_type` varchar(45) DEFAULT NULL,
  `Const_mode` varchar(45) DEFAULT NULL,
  `Levels` int(11) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `Proj_img` varchar(45) DEFAULT NULL,
  `CAD_img` varchar(45) DEFAULT NULL,
  `Curr_img` varchar(45) DEFAULT NULL,
  `Remarks` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Proj_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `projects`
--

/*!40000 ALTER TABLE `projects` DISABLE KEYS */;
/*!40000 ALTER TABLE `projects` ENABLE KEYS */;


--
-- Definition of table `requestleave`
--

DROP TABLE IF EXISTS `requestleave`;
CREATE TABLE `requestleave` (
  `idrequestLeave` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `reason` varchar(45) DEFAULT NULL,
  `leavetype` varchar(45) CHARACTER SET latin1 COLLATE latin1_bin DEFAULT NULL,
  `medical` varchar(45) DEFAULT NULL,
  `no_ofleaves` varchar(45) DEFAULT NULL,
  `paymenttype` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idrequestLeave`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `requestleave`
--

/*!40000 ALTER TABLE `requestleave` DISABLE KEYS */;
/*!40000 ALTER TABLE `requestleave` ENABLE KEYS */;


--
-- Definition of table `resource_type`
--

DROP TABLE IF EXISTS `resource_type`;
CREATE TABLE `resource_type` (
  `Resource_type_id` int(11) NOT NULL,
  `Resource_name` varchar(45) DEFAULT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `Section_Sec_id` int(11) NOT NULL,
  PRIMARY KEY (`Resource_type_id`,`Section_Sec_id`),
  KEY `fk_Resource_type_Section1` (`Section_Sec_id`),
  CONSTRAINT `fk_Resource_type_Section1` FOREIGN KEY (`Section_Sec_id`) REFERENCES `section` (`Sec_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `resource_type`
--

/*!40000 ALTER TABLE `resource_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `resource_type` ENABLE KEYS */;


--
-- Definition of table `section`
--

DROP TABLE IF EXISTS `section`;
CREATE TABLE `section` (
  `Sec_id` int(11) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Descripion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Sec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `section`
--

/*!40000 ALTER TABLE `section` DISABLE KEYS */;
/*!40000 ALTER TABLE `section` ENABLE KEYS */;


--
-- Definition of table `specilizat_sub_cont`
--

DROP TABLE IF EXISTS `specilizat_sub_cont`;
CREATE TABLE `specilizat_sub_cont` (
  `idSpecilizat_sub_cont` int(11) NOT NULL AUTO_INCREMENT,
  `Sub_contract_id` int(11) DEFAULT NULL,
  `Options` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idSpecilizat_sub_cont`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `specilizat_sub_cont`
--

/*!40000 ALTER TABLE `specilizat_sub_cont` DISABLE KEYS */;
/*!40000 ALTER TABLE `specilizat_sub_cont` ENABLE KEYS */;


--
-- Definition of table `sub_contract_register`
--

DROP TABLE IF EXISTS `sub_contract_register`;
CREATE TABLE `sub_contract_register` (
  `Sub_contr_reg` int(11) NOT NULL,
  `First_name` varchar(45) DEFAULT NULL,
  `Last_name` varchar(45) DEFAULT NULL,
  `Address` varchar(145) DEFAULT NULL,
  `Nic` int(25) DEFAULT NULL,
  `Phone_no` int(11) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Account_no` int(11) DEFAULT NULL,
  `Qualification` varchar(45) DEFAULT NULL,
  `No_of_labours` int(11) DEFAULT NULL,
  PRIMARY KEY (`Sub_contr_reg`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sub_contract_register`
--

/*!40000 ALTER TABLE `sub_contract_register` DISABLE KEYS */;
/*!40000 ALTER TABLE `sub_contract_register` ENABLE KEYS */;


--
-- Definition of table `sub_contractor_agreement`
--

DROP TABLE IF EXISTS `sub_contractor_agreement`;
CREATE TABLE `sub_contractor_agreement` (
  `Id_sub` int(11) NOT NULL,
  `Est_settelment` varchar(45) DEFAULT NULL,
  `Contract_date` varchar(45) DEFAULT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Sub_cont_id` varchar(45) DEFAULT NULL,
  `conatract_sighn` tinyint(1) DEFAULT NULL,
  `Base_price` double DEFAULT NULL,
  PRIMARY KEY (`Id_sub`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sub_contractor_agreement`
--

/*!40000 ALTER TABLE `sub_contractor_agreement` DISABLE KEYS */;
/*!40000 ALTER TABLE `sub_contractor_agreement` ENABLE KEYS */;


--
-- Definition of table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `Supply_id` int(11) NOT NULL AUTO_INCREMENT,
  `Supplier_id` varchar(45) DEFAULT NULL,
  `Name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Supply_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;


--
-- Definition of table `task_allocate`
--

DROP TABLE IF EXISTS `task_allocate`;
CREATE TABLE `task_allocate` (
  `task_id` int(11) NOT NULL,
  `Allocated_task` varchar(45) DEFAULT NULL,
  `Allocation_type` varchar(45) DEFAULT NULL,
  `Start_date` date DEFAULT NULL,
  `Due_date` date DEFAULT NULL,
  `Payment_method` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `task_allocate`
--

/*!40000 ALTER TABLE `task_allocate` DISABLE KEYS */;
/*!40000 ALTER TABLE `task_allocate` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
