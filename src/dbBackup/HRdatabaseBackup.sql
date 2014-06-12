-- MySQL dump 10.13  Distrib 5.5.37, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: HRdatabase
-- ------------------------------------------------------
-- Server version	5.5.37-0ubuntu0.14.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_stdEmployee`
--

DROP TABLE IF EXISTS `tbl_stdEmployee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_stdEmployee` (
  `std_ID` int(11) NOT NULL AUTO_INCREMENT,
  `std_FNAME` varchar(20) NOT NULL,
  `std_LNAME` varchar(20) NOT NULL,
  `std_DOB` date NOT NULL,
  `std_SALARY` int(11) NOT NULL,
  PRIMARY KEY (`std_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_stdEmployee`
--

LOCK TABLES `tbl_stdEmployee` WRITE;
/*!40000 ALTER TABLE `tbl_stdEmployee` DISABLE KEYS */;
INSERT INTO `tbl_stdEmployee` VALUES (1,'John','ONeill','1993-09-15',150000),(3,'Jeremy','Symth','1970-10-27',200000),(4,'Sophie','McBride','1979-03-13',20000),(5,'Ellen','Rooney','1987-03-03',35000),(6,'Jack','Pagan','1992-01-16',18000),(7,'Rick','Astley','1973-02-05',23000),(8,'Jimmy','Carr','1976-12-12',31000),(9,'Fiona','Trimble','1982-12-06',17500),(10,'Julie','Kerr','1986-08-06',34000);
/*!40000 ALTER TABLE `tbl_stdEmployee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-06-12 14:34:36
