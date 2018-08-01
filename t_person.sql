/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2018-08-01 17:23:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_person
-- ----------------------------
DROP TABLE IF EXISTS `t_person`;
CREATE TABLE `t_person` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(18) DEFAULT NULL,
  `skill` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_person
-- ----------------------------
INSERT INTO `t_person` VALUES ('1', '嘻嘻1', '嗯嗯1');
INSERT INTO `t_person` VALUES ('3', '嘻嘻3', '嗯嗯3');
INSERT INTO `t_person` VALUES ('4', '嘻嘻4', '嗯嗯4');
INSERT INTO `t_person` VALUES ('5', '嘻嘻5', '嗯嗯5');
INSERT INTO `t_person` VALUES ('6', '嘻嘻6', '嗯嗯6');
INSERT INTO `t_person` VALUES ('7', '啊啊dd', 'aa');
INSERT INTO `t_person` VALUES ('8', '安安', '安安');
INSERT INTO `t_person` VALUES ('9', '922', '922');
INSERT INTO `t_person` VALUES ('15', '公共', '断电');
