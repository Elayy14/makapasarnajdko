-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 19, 2024 at 12:21 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `event`
--

-- --------------------------------------------------------

--
-- Table structure for table `staff_table`
--

CREATE TABLE `staff_table` (
  `Id` int(200) NOT NULL,
  `First_Name` varchar(200) NOT NULL,
  `Last_Name` varchar(200) NOT NULL,
  `Email` varchar(200) NOT NULL,
  `User_name` varchar(200) NOT NULL,
  `Password` varchar(200) NOT NULL,
  `Contact` varchar(200) NOT NULL,
  `Age` varchar(200) NOT NULL,
  `Sex` varchar(200) NOT NULL,
  `Address` varchar(200) NOT NULL,
  `type` varchar(200) NOT NULL,
  `status` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `staff_table`
--

INSERT INTO `staff_table` (`Id`, `First_Name`, `Last_Name`, `Email`, `User_name`, `Password`, `Contact`, `Age`, `Sex`, `Address`, `type`, `status`) VALUES
(6, 'testing5', 'testing5', 'email.com', 'user', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', '12345678', '12', 'female', 'adress testing', 'Admin', 'Active'),
(10, 'testing', 'testring', 'alice@email.com', 'alice', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', '12345678', '12', 'Female', 'asfasdgasfd', 'User', 'Active'),
(11, 'testing', 'testing', 'testing@email.com', 'testing', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', '1234567', '12', 'Male', 'testing', 'User', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `staff_table`
--
ALTER TABLE `staff_table`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `staff_table`
--
ALTER TABLE `staff_table`
  MODIFY `Id` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
