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
-- Table structure for table `tblcliente`
--

DROP TABLE IF EXISTS `tblcliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblcliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) DEFAULT NULL,
  `fone1` varchar(20) DEFAULT NULL,
  `fone2` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `status` varchar(7) DEFAULT NULL,
  `complementoEndereco` varchar(100) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `rg` varchar(14) DEFAULT NULL,
  `matricula` varchar(14) DEFAULT NULL,
  `dataNascimento` varchar(10) DEFAULT NULL,
  `TBLENDERECO_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_TBLCLIENTE_TBLENDERECO1_idx` (`TBLENDERECO_id`),
  CONSTRAINT `fk_TBLCLIENTE_TBLENDERECO1` FOREIGN KEY (`TBLENDERECO_id`) REFERENCES `tblendereco` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblcliente`
--

LOCK TABLES `tblcliente` WRITE;
/*!40000 ALTER TABLE `tblcliente` DISABLE KEYS */;
INSERT INTO `tblcliente` VALUES (1,'João PedroSSSSSSS','(22)22222-2222','(99) 99999-9999','email@teste.com   ','Ativo','apto','412.331.232-35','84-344.131.312','42314','23/07/2023',3),(2,'Nicolas Kfunner','(99)99999-9999','(11) 94002-8922','email@teste.com','Ativo','casa','444.444.444-44','22-222.222.222','2323','11/11/1111',2),(3,'sexo','(22)22222-2222','(22) 22222-2222','jdekjdn ','Inativo','a','777.777.777-77','88-888.888.888','jnkj','99/99/9999',1),(4,'Natasha','(48)99975-8514','(48) 99975-8514','natasha.aragoni@wmw.com.br','Ativo','casa','341.693.148-32','55-555.555.555','ppp','09/07/1986',1),(5,'Natasha','(48)99975-8514','(48) 99975-8514','natasha.aragoni@wmw.com.br','Ativo','casa','341.693.148-32','55-555.555.555','ppp','09/07/1986',1),(6,'Natasha','(48)99975-8514','(48) 99975-8514','natasha.aragoni@wmw.com.br','Ativo','casa','341.693.148-32','55-555.555.555','ppp','09/07/1986',1),(7,'a','(11)11111-1111','(11) 11111-1111','a','Ativo','casa','111.111.111-11','11-111.111.111','11111','11/11/1111',5);
/*!40000 ALTER TABLE `tblcliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-10 23:02:59
