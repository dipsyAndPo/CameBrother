/*
 Navicat Premium Data Transfer

 Source Server         : 点一下玩一年
 Source Server Type    : MySQL
 Source Server Version : 50515
 Source Host           : localhost:3306
 Source Schema         : camebrother

 Target Server Type    : MySQL
 Target Server Version : 50515
 File Encoding         : 65001

 Date: 19/12/2018 08:31:05
*/
SET sql_mode='NO_AUTO_VALUE_ON_ZERO';
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for mould
-- ----------------------------
DROP TABLE IF EXISTS `mould`;
CREATE TABLE `mould`  (
  `mId` int(11) NOT NULL AUTO_INCREMENT COMMENT '模板id',
  `mName` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '模板名称',
  `tId` int(11) NULL DEFAULT NULL COMMENT '分类id(外键)',
  `label` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标签',
  `praise` int(11) NULL DEFAULT NULL COMMENT '点赞数',
  `tread` int(11) NULL DEFAULT NULL COMMENT '踩数量',
  `img` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `logo` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'logo',
  `preview` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '预览地址',
  `download` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下载链接',
  PRIMARY KEY (`mId`) USING BTREE,
  INDEX `tId`(`tId`) USING BTREE,
  CONSTRAINT `tId` FOREIGN KEY (`tId`) REFERENCES `tarde` (`tId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER  SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice`  (
  `nId` int(11) NOT NULL AUTO_INCREMENT COMMENT '公告id',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公告标题',
  `context` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公告内容',
  `dateLine` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '公告发布时间',
  `img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公告的首图',
  PRIMARY KEY (`nId`) USING BTREE
) ENGINE = InnoDB CHARACTER  SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for star
-- ----------------------------
DROP TABLE IF EXISTS `star`;
CREATE TABLE `star`  (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '收藏id',
  `uId` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `mId` int(11) NULL DEFAULT NULL COMMENT '模板id',
  PRIMARY KEY (`sid`) USING BTREE,
  INDEX `uId`(`uId`) USING BTREE,
  INDEX `mid`(`mId`) USING BTREE,
  CONSTRAINT `mid` FOREIGN KEY (`mId`) REFERENCES `mould` (`mId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `uId` FOREIGN KEY (`uId`) REFERENCES `users` (`uId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER  SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tagcloud
-- ----------------------------
DROP TABLE IF EXISTS `tagcloud`;
CREATE TABLE `tagcloud`  (
  `tId` int(11) NOT NULL AUTO_INCREMENT COMMENT '标签云id',
  `tName` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标签云名称',
  `amount` int(11) NULL DEFAULT NULL COMMENT '标签云下的数量',
  PRIMARY KEY (`tId`) USING BTREE
) ENGINE = InnoDB CHARACTER  SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tarde
-- ----------------------------
DROP TABLE IF EXISTS `tarde`;
CREATE TABLE `tarde`  (
  `tId` int(11) NOT NULL AUTO_INCREMENT COMMENT '行业id',
  `tName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '行业名称',
  PRIMARY KEY (`tId`) USING BTREE
) ENGINE = InnoDB CHARACTER  SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `uId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `uName` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名称',
  `uPwd` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户密码',
  PRIMARY KEY (`uId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER  SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'ddd', 'bbb');
INSERT INTO `users` VALUES (2, 'yyt', 'yyt');

SET FOREIGN_KEY_CHECKS = 1;
