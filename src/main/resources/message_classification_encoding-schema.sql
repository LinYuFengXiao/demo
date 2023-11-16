/*
 Navicat Premium Data Transfer

 Source Server         : 172.18.70.151
 Source Server Type    : MySQL
 Source Server Version : 80200
 Source Host           : 172.18.70.151:3306
 Source Schema         : pmcc-flood-prevent

 Target Server Type    : MySQL
 Target Server Version : 80200
 File Encoding         : 65001

 Date: 15/11/2023 11:32:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for message_classification_encoding
-- ----------------------------
DROP TABLE IF EXISTS `message_classification_encoding`;
CREATE TABLE `message_classification_encoding`  (
  `message_classfication_encoding` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '消息分类编码',
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '说明',
  `file_classification_short_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '文件分类简称',
  `message_classfication_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '消息分类名称',
  `system_name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '系统名称',
  `system_shortname` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '系统简称',
  PRIMARY KEY (`message_classfication_encoding`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '基础信息表-消息分类编码表 参考 MT/T 1201.4-2023：表21 系统简称和消息分类编码表、表22 文件命名系统名称及简称对照表。数据在项目启动时进行初始化。';

SET FOREIGN_KEY_CHECKS = 1;
