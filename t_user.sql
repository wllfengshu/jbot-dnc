/*
Navicat MySQL Data Transfer

Source Server         : localhost5.5(无密码)
Source Server Version : 50506
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50506
File Encoding         : 65001

Date: 2019-03-19 17:59:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(64) NOT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delete_time` datetime DEFAULT NULL,
  `is_delete` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`,`username`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '天地炫舞', 'Aa123456', '2019-03-15 17:03:02', null, null, '0');
