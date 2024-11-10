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
-- Table structure for table `coches`
--

DROP TABLE IF EXISTS `coches`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `coches` (
  `coche_id` int NOT NULL AUTO_INCREMENT,
  `marca` varchar(50) DEFAULT NULL,
  `modelo` varchar(50) DEFAULT NULL,
  `anio_fabricacion` int DEFAULT NULL,
  `precio` int DEFAULT NULL,
  `descripcion` text,
  `estado` varchar(50) DEFAULT NULL,
  `foto` varchar(300) DEFAULT NULL,
  `vendido` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`coche_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coches`
--

LOCK TABLES `coches` WRITE;
/*!40000 ALTER TABLE `coches` DISABLE KEYS */;
INSERT INTO `coches` VALUES (1,'Toyota','Camry',2022,60000,'Familiar, espacioso','Nuevo','https://i.imgur.com/Wnv6gsY.png',1),(2,'Ford','Mustang',2021,45000,'Sports car, powerful engine','Nuevo','https://i.imgur.com/O1lseWd.jpeg',0),(3,'Honda','Civic',2020,20000,'Compact car, reliable','Nuevo','https://i.imgur.com/Gevjdya.jpeg',0),(4,'Chevrolet','Silverado',2023,35000,'Pickup truck, spacious','Nuevo','https://i.imgur.com/aZqLHdV.jpeg',0),(5,'Volkswagen','Golf',2019,18000,'Hatchback, compact','Usado','https://i.imgur.com/WvahINU.jpeg',0),(6,'Toyota','Corolla',2022,20000,'Hibrido,Encufable','Nuevo','https://i.imgur.com/8gZl4I8.jpeg',0),(7,'Toyota','Corolla',2022,25000,'Sedán compacto','Nuevo','https://i.imgur.com/Uk73BSm.jpeg',0),(8,'Ford','Mustang',2021,45000,'Deportivo','Usado','https://i.imgur.com/T8SWf75.jpeg',0),(9,'Honda','Civic',2020,22000,'Sedán','Usado','https://i.imgur.com/rleNLMM.jpeg',0),(10,'Chevrolet','Cruze',2022,26000,'Sedán','Nuevo','https://i.imgur.com/juEAgGa.jpeg',0),(11,'Volkswagen','Golf',2019,20000,'Hatchback','Usado','https://i.imgur.com/647DX48.jpeg',1),(12,'Nissan','Altima',2021,28000,'Sedán','Nuevo','https://i.imgur.com/ILZORP2.jpeg',0),(13,'BMW','X5',2023,60000,'SUV de lujo','Nuevo','https://i.imgur.com/tWzqICw.jpeg',0),(16,'Chevrolet','Camaro',2020,70000,'deportivo, de 0 a 100 en 5s ','Nuevo','https://i.imgur.com/Ze6bkc3.jpg',0),(17,'Nissan','Juke',2019,90000,'familiar 5 puertas','Usado','https://i.imgur.com/xbrKslH.jpeg',1);
/*!40000 ALTER TABLE `coches` ENABLE KEYS */;
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
