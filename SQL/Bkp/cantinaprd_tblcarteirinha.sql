-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cantinaprd
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tblcarteirinha`
--

DROP TABLE IF EXISTS `tblcarteirinha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblcarteirinha` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigoBarra` varchar(45) DEFAULT NULL,
  `dataGeracao` varchar(14) DEFAULT NULL,
  `dataCancelamento` varchar(14) DEFAULT NULL,
  `TBLCLIENTE_id` int(11) NOT NULL,
  `STATUS` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_TBLCARTEIRINHA_TBLCLIENTE1_idx` (`TBLCLIENTE_id`),
  CONSTRAINT `fk_TBLCARTEIRINHA_TBLCLIENTE1` FOREIGN KEY (`TBLCLIENTE_id`) REFERENCES `tblcliente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblcarteirinha`
--

LOCK TABLES `tblcarteirinha` WRITE;
/*!40000 ALTER TABLE `tblcarteirinha` DISABLE KEYS */;
INSERT INTO `tblcarteirinha` VALUES (1,'1111111111111','11/11/1111','12/22/2222',2,'Ativo'),(2,'54321','  /  /    ','12/33/3333',1,'Ativo'),(3,'111111111111111223','11/11/1111','22/22/2222',2,'Ativo'),(4,'11111','12/22/2222','12/22/2222',2,'Ativo'),(5,'1241352','22/22/2222','11/11/1111',1,'Ativo'),(6,'1234567890','00/00/0000','99/99/9999',1,'Ativo'),(7,'1234534212345','  /  /    ','  /  /    ',1,'Ativo'),(8,'1','  /  /    ','  /  /    ',1,'Ativo'),(9,'12345678','  /  /    ','  /  /    ',2,'Ativo'),(10,'213455','  /  /    ','  /  /    ',2,'Ativo'),(11,'1111','11/11/1111','11/11/1111',1,'Ativo'),(12,'12','11/11/1111','11/11/1111',1,'Inativo'),(13,'2222222222222222222','11/11/1111','11/11/1111',3,'Ativo'),(14,'1234','  /  /    ','12/02/2023',2,'Ativo');
/*!40000 ALTER TABLE `tblcarteirinha` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-10 23:03:00
