-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Apr 06, 2024 at 09:59 PM
-- Server version: 8.2.0
-- PHP Version: 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `users`
--

-- --------------------------------------------------------

--
-- Table structure for table `personel`
--

DROP TABLE IF EXISTS `personel`;
CREATE TABLE IF NOT EXISTS `personel` (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `fullname` char(65) COLLATE utf8mb4_unicode_ci NOT NULL,
  `username` char(65) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` char(65) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `personel`
--

INSERT INTO `personel` (`id`, `fullname`, `username`, `password`) VALUES
(1, 'John Butler', 'John1234', '123456'),
(2, 'jawishh', 'jawish0', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `salaryinfo`
--

DROP TABLE IF EXISTS `salaryinfo`;
CREATE TABLE IF NOT EXISTS `salaryinfo` (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `p_fullname` char(65) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `p_staff` char(65) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `w_hours` decimal(10,0) UNSIGNED NOT NULL,
  `h_wage` decimal(10,0) UNSIGNED NOT NULL,
  `overtime_wage` decimal(10,0) UNSIGNED DEFAULT NULL,
  `gross_pay` decimal(10,0) UNSIGNED NOT NULL,
  `national_ins` decimal(10,0) UNSIGNED NOT NULL,
  `pension_cont` decimal(10,0) UNSIGNED NOT NULL,
  `tax_pay` decimal(10,0) UNSIGNED DEFAULT NULL,
  `net_pay` decimal(10,0) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `salaryinfo`
--

INSERT INTO `salaryinfo` (`id`, `p_fullname`, `p_staff`, `w_hours`, `h_wage`, `overtime_wage`, `gross_pay`, `national_ins`, `pension_cont`, `tax_pay`, `net_pay`) VALUES
(1, 'Emily Watson', 'Teaching Staff (Category L)', 40, 85, 510, 14280, 1370, 1428, 2856, 8625),
(6, 'Richard Timbley', 'Administrative Staff (Category A)', 45, 200, 1500, 38000, 3651, 3800, 7600, 22952),
(7, 'Robert Water', 'Teaching Staff (Category L)', 40, 53, 3150, 88200, 8467, 8820, 26460, 44452);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
