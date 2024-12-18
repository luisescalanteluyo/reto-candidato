CREATE TABLE IF NOT EXISTS `candidatos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;