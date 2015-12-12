-- MySQL dump 10.13  Distrib 5.7.9, for osx10.9 (x86_64)
--
-- Host: 127.0.0.1    Database: roombooking
-- ------------------------------------------------------
-- Server version	5.7.9

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
-- Table structure for table `OtherType`
--

DROP TABLE IF EXISTS `OtherType`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `OtherType` (
  `other_type_id` int(11) NOT NULL DEFAULT '0',
  `other_type_name` varchar(45) NOT NULL,
  `base_price` float NOT NULL DEFAULT '0',
  PRIMARY KEY (`other_type_id`),
  UNIQUE KEY `other_type_id_UNIQUE` (`other_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `OtherType`
--

LOCK TABLES `OtherType` WRITE;
/*!40000 ALTER TABLE `OtherType` DISABLE KEYS */;
INSERT INTO `OtherType` VALUES (1,'Smoking',100),(2,'Non Smoking',150);
/*!40000 ALTER TABLE `OtherType` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Reservation`
--

DROP TABLE IF EXISTS `Reservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Reservation` (
  `reservation_id` int(11) NOT NULL AUTO_INCREMENT,
  `guest_id` int(11) DEFAULT NULL,
  `room_id` int(11) DEFAULT NULL,
  `reservation_date` datetime DEFAULT NULL,
  `check_in_date` datetime DEFAULT NULL,
  `check_out_date` datetime DEFAULT NULL,
  `adults` int(11) DEFAULT NULL,
  `children` int(11) DEFAULT NULL,
  `amenityTypeId` int(11) DEFAULT NULL,
  `rooms` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`reservation_id`),
  UNIQUE KEY `reservation_id_UNIQUE` (`reservation_id`),
  KEY `guest_id_idx` (`guest_id`),
  KEY `FK_daj24f8wuu2wla20a4b1iemry` (`room_id`),
  CONSTRAINT `FK_daj24f8wuu2wla20a4b1iemry` FOREIGN KEY (`room_id`) REFERENCES `Room` (`room_id`),
  CONSTRAINT `guest_id` FOREIGN KEY (`guest_id`) REFERENCES `Guest` (`guest_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `room_id` FOREIGN KEY (`guest_id`) REFERENCES `Guest` (`guest_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Reservation`
--

LOCK TABLES `Reservation` WRITE;
/*!40000 ALTER TABLE `Reservation` DISABLE KEYS */;
INSERT INTO `Reservation` VALUES (1,NULL,111,NULL,'2015-12-11 00:00:00','2015-12-13 00:00:00',1,1,1,0),(2,NULL,112,NULL,'2015-12-19 00:00:00','2015-12-20 00:00:00',1,1,1,0),(3,NULL,115,NULL,'2015-12-13 00:00:00','2015-12-14 00:00:00',1,1,1,0),(4,NULL,116,NULL,'2015-12-15 00:00:00','2015-12-16 00:00:00',1,1,1,0),(5,NULL,117,NULL,'2015-12-13 00:00:00','2015-12-15 00:00:00',1,1,1,0),(6,NULL,121,NULL,'2015-12-16 00:00:00','2015-12-18 00:00:00',1,1,1,0),(7,NULL,122,NULL,'2015-12-13 00:00:00','2015-12-18 00:00:00',1,1,1,0);
/*!40000 ALTER TABLE `Reservation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Room`
--

DROP TABLE IF EXISTS `Room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Room` (
  `room_id` int(4) NOT NULL AUTO_INCREMENT,
  `room_type_id` int(11) DEFAULT NULL,
  `other_type_id` int(11) DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`room_id`),
  UNIQUE KEY `room_id_UNIQUE` (`room_id`),
  KEY `room_type_id_idx` (`room_type_id`),
  KEY `other_type_id_idx` (`other_type_id`),
  KEY `status_id_idx` (`status_id`),
  CONSTRAINT `other_type_id` FOREIGN KEY (`other_type_id`) REFERENCES `OtherType` (`other_type_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `room_type_id` FOREIGN KEY (`room_type_id`) REFERENCES `RoomType` (`room_type_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `status_id` FOREIGN KEY (`status_id`) REFERENCES `RoomStatus` (`room_status_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=124 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Room`
--

LOCK TABLES `Room` WRITE;
/*!40000 ALTER TABLE `Room` DISABLE KEYS */;
INSERT INTO `Room` VALUES (111,1,1,2),(112,1,1,1),(115,1,1,3),(116,1,1,2),(117,1,1,3),(121,1,1,1),(122,1,2,1);
/*!40000 ALTER TABLE `Room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RoomStatus`
--

DROP TABLE IF EXISTS `RoomStatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RoomStatus` (
  `room_status_id` int(11) NOT NULL,
  `room_status_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`room_status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RoomStatus`
--

LOCK TABLES `RoomStatus` WRITE;
/*!40000 ALTER TABLE `RoomStatus` DISABLE KEYS */;
INSERT INTO `RoomStatus` VALUES (1,'Available'),(2,'Reserved'),(3,NULL);
/*!40000 ALTER TABLE `RoomStatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RoomType`
--

DROP TABLE IF EXISTS `RoomType`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RoomType` (
  `room_type_id` int(11) NOT NULL COMMENT '	',
  `room_type_name` varchar(45) NOT NULL,
  PRIMARY KEY (`room_type_id`),
  UNIQUE KEY `room_type_id_UNIQUE` (`room_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RoomType`
--

LOCK TABLES `RoomType` WRITE;
/*!40000 ALTER TABLE `RoomType` DISABLE KEYS */;
INSERT INTO `RoomType` VALUES (1,'1 Queen Bed'),(2,'2 King Beds');
/*!40000 ALTER TABLE `RoomType` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-08 18:59:33
