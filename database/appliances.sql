-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 20, 2022 at 06:40 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `appliances`
--

-- --------------------------------------------------------

--
-- Table structure for table `appliancedetails`
--

CREATE TABLE `appliancedetails` (
  `id` int(11) NOT NULL,
  `companyname` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `dprice` varchar(255) DEFAULT NULL,
  `manufacturerid` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `productcode` varchar(255) DEFAULT NULL,
  `stockavailable` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `appliancedetails`
--

INSERT INTO `appliancedetails` (`id`, `companyname`, `description`, `dprice`, `manufacturerid`, `name`, `price`, `productcode`, `stockavailable`, `type`) VALUES
(3, 'sAMSUNG', '12 GB RAM 256 ROM QUALCOMM SNAPDRAGON 778G', '10999', 'MG12HNM', 'Samsung', '12999', '12SY9876', '100', 'Smartphone'),
(4, 'Nothing', '12 GB RAM 256 ROM QUALCOMM SNAPDRAGON 778G', '30999', 'MG12HNM', 'Nothing Phone1', '36999', '79NG456', '100', 'SMARTPHONE');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appliancedetails`
--
ALTER TABLE `appliancedetails`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `appliancedetails`
--
ALTER TABLE `appliancedetails`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
