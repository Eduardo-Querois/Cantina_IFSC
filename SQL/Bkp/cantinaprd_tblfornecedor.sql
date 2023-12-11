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
-- Table structure for table `tblfornecedor`
--

DROP TABLE IF EXISTS `tblfornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblfornecedor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) DEFAULT NULL,
  `fone1` varchar(20) DEFAULT NULL,
  `fone2` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `status` varchar(7) DEFAULT NULL,
  `complementoEndereco` varchar(100) DEFAULT NULL,
  `cnpj` varchar(20) DEFAULT NULL,
  `inscricaoEstadual` varchar(14) DEFAULT NULL,
  `razaoSocial` varchar(100) DEFAULT NULL,
  `TBLENDERECO_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_TBLFORNECEDOR_TBLENDERECO1_idx` (`TBLENDERECO_id`),
  CONSTRAINT `fk_TBLFORNECEDOR_TBLENDERECO1` FOREIGN KEY (`TBLENDERECO_id`) REFERENCES `tblendereco` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblfornecedor`
--

LOCK TABLES `tblfornecedor` WRITE;
/*!40000 ALTER TABLE `tblfornecedor` DISABLE KEYS */;
INSERT INTO `tblfornecedor` VALUES (1,'Nicolas','(12)22222-2222','(44) 44444-4444','email@teste2.com','Ativo','apto','93.333.333/3333-33','inscricao','razao',2),(2,'Roberval','(88)88888-8888','(88) 88888-8888','email10@teste10.com','Ativo','apto','22.222.222/2222-22','631','social',1),(3,'aa','(22)22222-2222','(22) 22222-2222','11','Ativo','casa','11.111.111/1111-11','1111111','222',4),(4,'2353141','(11)11111-1111','(11) 11111-1111','314121','Ativo','casa','11.111.111/1111-11','1111','111',1);
/*!40000 ALTER TABLE `tblfornecedor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-10 23:02:58
