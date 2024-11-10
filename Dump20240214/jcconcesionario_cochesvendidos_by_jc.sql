-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: jcconcesionario
-- ------------------------------------------------------
-- Server version	8.1.0

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
-- Table structure for table `cochesvendidos_by_jc`
--

DROP TABLE IF EXISTS `cochesvendidos_by_jc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cochesvendidos_by_jc` (
  `venta_id` int NOT NULL AUTO_INCREMENT,
  `coche_id` int DEFAULT NULL,
  `comprador_id` int DEFAULT NULL,
  `precio_venta` int DEFAULT NULL,
  `fecha_venta` datetime DEFAULT NULL,
  PRIMARY KEY (`venta_id`),
  KEY `coche_id` (`coche_id`),
  KEY `comprador_id` (`comprador_id`),
  CONSTRAINT `cochesvendidos_by_jc_ibfk_1` FOREIGN KEY (`coche_id`) REFERENCES `coches` (`coche_id`),
  CONSTRAINT `cochesvendidos_by_jc_ibfk_2` FOREIGN KEY (`comprador_id`) REFERENCES `usuarios` (`usuario_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cochesvendidos_by_jc`
--

LOCK TABLES `cochesvendidos_by_jc` WRITE;
/*!40000 ALTER TABLE `cochesvendidos_by_jc` DISABLE KEYS */;
INSERT INTO `cochesvendidos_by_jc` VALUES (9,1,9,60000,'2024-02-12 14:41:18'),(10,17,16,90000,'2024-02-13 19:09:29'),(11,11,9,20000,'2024-02-13 22:13:35');
/*!40000 ALTER TABLE `cochesvendidos_by_jc` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-14 19:36:30
