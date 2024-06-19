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
-- Table structure for table `event_list`
--

CREATE TABLE `event_list` (
  `Id` int(200) NOT NULL,
  `Customer_Name` varchar(100) NOT NULL,
  `Contact` int(100) NOT NULL,
  `Event_Name` varchar(200) NOT NULL,
  `Venue` varchar(200) NOT NULL,
  `Date` varchar(200) NOT NULL,
  `Time` varchar(200) NOT NULL,
  `Event_Type` varchar(200) NOT NULL,
  `Amount` varchar(100) NOT NULL,
  `status` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `event_list`
--

INSERT INTO `event_list` (`Id`, `Customer_Name`, `Contact`, `Event_Name`, `Venue`, `Date`, `Time`, `Event_Type`, `Amount`, `status`) VALUES
(11, 'testing name', 1233534515, 'party', 'complex', '12/12/12', '1:00', 'Kids Party', '600,000', 'Completed'),
(12, 'testing', 123456, 'testing', 'complex', '12/11/12', '1:00 AM', 'Seminar', '200', 'Booked'),
(13, 'asd', 1230124, 'asd', 'asd', '12/12/20', '1:00', 'Conference', '12', 'Booked'),
(14, 'asd', 123414, 'asd', 'asd', '12/12/2024', '01:30 PM', 'Conference', '123', 'Booked'),
(15, 'asd', 123, 'asd', 'asd', '12/12/12', '1:00 PM', 'Conference', '123', 'Booked');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `event_list`
--
ALTER TABLE `event_list`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `event_list`
--
ALTER TABLE `event_list`
  MODIFY `Id` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
