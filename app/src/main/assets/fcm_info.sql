-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 26, 2016 at 04:18 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fcm_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `fcm_info`
--

CREATE TABLE `fcm_info` (
  `fcm_token` varchar(400) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fcm_info`
--

INSERT INTO `fcm_info` (`fcm_token`) VALUES
('dDYeXJgcHdM:APA91bG3GKKjoEAGxiuTvE7HK5uQZubJLr1q8JRWv3TcsrcqHrjpLpZ3iAxDYOgfXwedzYE8ILecHBVm022lFC7vs5fjMuUZkWak8WFlQBHaX50yqcF0HHCDYHGnpwFWBB79I2DAa--i'),
('dDYeXJgcHdM:APA91bG3GKKjoEAGxiuTvE7HK5uQZubJLr1q8JRWv3TcsrcqHrjpLpZ3iAxDYOgfXwedzYE8ILecHBVm022lFC7vs5fjMuUZkWak8WFlQBHaX50yqcF0HHCDYHGnpwFWBB79I2DAa--i'),
('dDYeXJgcHdM:APA91bG3GKKjoEAGxiuTvE7HK5uQZubJLr1q8JRWv3TcsrcqHrjpLpZ3iAxDYOgfXwedzYE8ILecHBVm022lFC7vs5fjMuUZkWak8WFlQBHaX50yqcF0HHCDYHGnpwFWBB79I2DAa--i');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
