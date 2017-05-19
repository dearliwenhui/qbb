/*
Navicat MySQL Data Transfer

Source Server         : mypro
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : qbbdemo0519

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2017-05-19 17:10:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('36', '123');
INSERT INTO `user` VALUES ('37', '1');
INSERT INTO `user` VALUES ('38', '2');
INSERT INTO `user` VALUES ('39', '3');
INSERT INTO `user` VALUES ('40', '4');
INSERT INTO `user` VALUES ('41', '5');
INSERT INTO `user` VALUES ('42', '5');
INSERT INTO `user` VALUES ('43', '6');
INSERT INTO `user` VALUES ('44', '7');
INSERT INTO `user` VALUES ('45', '1');
INSERT INTO `user` VALUES ('46', '2');
