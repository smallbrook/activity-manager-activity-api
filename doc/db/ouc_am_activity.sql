/*
Navicat MySQL Data Transfer

Source Server         : local_mysql
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : ouc_am_activity

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-11-28 17:32:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_activity
-- ----------------------------
DROP TABLE IF EXISTS `t_activity`;
CREATE TABLE `t_activity` (
  `activityID` bigint(20) NOT NULL AUTO_INCREMENT,
  `activityName` varchar(255) DEFAULT NULL,
  `activityStartTime` datetime DEFAULT NULL,
  `activityEndTime` datetime DEFAULT NULL,
  PRIMARY KEY (`activityID`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_activity
-- ----------------------------
INSERT INTO `t_activity` VALUES ('1', '测试活动0', '2017-11-01 09:00:00', '2017-11-10 18:00:00');
INSERT INTO `t_activity` VALUES ('2', '测试活动1', '2017-11-13 09:00:00', '2017-11-30 19:57:13');
INSERT INTO `t_activity` VALUES ('3', '测试活动2', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('4', '测试活动20171115', '2017-11-15 11:00:00', '2017-12-15 11:00:00');
INSERT INTO `t_activity` VALUES ('7', '测试活动3', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('8', '活动名称20171115001', '2017-11-15 12:00:00', '2017-11-15 12:00:00');
INSERT INTO `t_activity` VALUES ('9', 'hdmc', '2017-11-17 08:00:00', '2017-11-17 08:00:00');
INSERT INTO `t_activity` VALUES ('20', '少时诵诗书所所', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('21', '爽歪歪完成财务处', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('22', '的是非得失多福多寿v', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('23', '额额额额额', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('24', '饭店是似懂非懂扫地僧', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('25', '服务费挖服务', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('26', '风飒飒大', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('27', '点点滴滴', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('28', '得得得得得得', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('29', '是否胜多负少', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('30', '都是对的所多多所', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('31', '得得得得得得反反复复', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('32', 'bbbbb', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('33', 'ddswwww', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('34', 'nnnnncccc', '2017-11-13 09:00:00', '2017-11-30 10:00:00');
INSERT INTO `t_activity` VALUES ('35', '学生评优001', '2017-11-24 13:00:00', '2017-11-24 13:00:00');
INSERT INTO `t_activity` VALUES ('36', '学生评优002', '2017-11-24 13:10:00', '2017-11-24 13:10:00');

-- ----------------------------
-- Table structure for t_activity_intro
-- ----------------------------
DROP TABLE IF EXISTS `t_activity_intro`;
CREATE TABLE `t_activity_intro` (
  `activityIntroID` bigint(20) DEFAULT NULL,
  `activityID` bigint(20) DEFAULT NULL,
  `activityIntro` longtext
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_activity_intro
-- ----------------------------

-- ----------------------------
-- Table structure for t_activity_professors
-- ----------------------------
DROP TABLE IF EXISTS `t_activity_professors`;
CREATE TABLE `t_activity_professors` (
  `activityProfessorsID` bigint(20) DEFAULT NULL,
  `activityID` bigint(20) DEFAULT NULL,
  `professorsID` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_activity_professors
-- ----------------------------
