/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 30/07/2019 18:04:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_score
-- ----------------------------
DROP TABLE IF EXISTS `t_score`;
CREATE TABLE `t_score`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `USER_ID` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `SUBJECT` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程',
  `SCORE` int(11) NULL DEFAULT NULL COMMENT '分数',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_score
-- ----------------------------
INSERT INTO `t_score` VALUES (1, 1, '语文', 90);
INSERT INTO `t_score` VALUES (2, 1, '数学', 98);
INSERT INTO `t_score` VALUES (3, 1, '英语', 95);
INSERT INTO `t_score` VALUES (4, 2, '语文', 95);
INSERT INTO `t_score` VALUES (5, 2, '数学', 99);
INSERT INTO `t_score` VALUES (6, 2, '英语', 97);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `USERNAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `PASSWORD` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '密码',
  `AGE` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `SEX` int(1) NULL DEFAULT NULL COMMENT '性别:1男，0女',
  `BIRTHDAY` date NULL DEFAULT NULL COMMENT '出生日期',
  `CREATE_TIME` datetime NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'zhangsan', '123456', 18, 1, '2001-03-26', '2019-07-26 16:21:48');
INSERT INTO `t_user` VALUES (2, 'lisi', '123456', 17, 0, '2002-07-26', '2019-07-26 16:22:17');
INSERT INTO `t_user` VALUES (4, 'zhaoliu', NULL, NULL, NULL, NULL, '2019-07-29 08:02:13');
INSERT INTO `t_user` VALUES (5, 'tianqi', NULL, NULL, NULL, NULL, '2019-07-29 16:13:06');

SET FOREIGN_KEY_CHECKS = 1;
