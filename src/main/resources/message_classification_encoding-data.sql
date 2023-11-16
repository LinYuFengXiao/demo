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

 Date: 15/11/2023 11:31:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Records of message_classification_encoding
-- ----------------------------
BEGIN;
INSERT INTO `message_classification_encoding` (`message_classfication_encoding`, `description`, `file_classification_short_name`, `message_classfication_name`, `system_name`, `system_shortname`) VALUES ('drainagealarm', '排水量监测异常信息数据文件', 'PSLCDYC', '排水量监测异常信息', '排水量监测系统', 'psl'), ('drainagedefine', '排水量监测基础信息数据文件', 'PSLCDDY', '排水量监测基础信息', '排水量监测系统', 'psl'), ('drainagerealdata', '排水量监测实时信息数据文件', 'PSLCDSS', '排水量监测实时信息', '排水量监测系统', 'psl'), ('drainagestartstop', '水泵监测实时信息数据文件', 'SBCDSS', '水泵开停实时信息', '排水量监测系统', 'psl'), ('gushingdefine', '涌水量监测基础信息数据文件', 'YSLCDDY', '涌水量监测基础信息', '涌水量监测系统', 'ysl'), ('gushingrealdata', '涌水量监测实时信息数据文件', 'YSLCDSS', '涌水量监测实时信息', '涌水量监测系统', 'ysl'), ('holealarm', '长观孔监测异常信息数据文件', 'CGKCDYC', '长观监测孔异常信息', '长观孔监测系统', 'cgk'), ('holedefine', '长观孔监测基础信息数据文件', 'CGKCDDY', '长观孔监测基础信息', '长观孔监测系统', 'cgk'), ('holerealdata', '长观孔监测实时信息数据文件', 'CGKCDSS', '长观孔监测实时信息', '长观孔监测系统', 'cgk'), ('pumpdefine', '疏(放)水监测基础信息数据文件', 'SFSCDDY', '疏(放)水监测基础信息', '疏(放)水监测系统', 'sfs'), ('pumprealdata', '疏(放)水监测实时信息数据文件', 'SFSCDSS', '疏(放)水监测实时信息', '疏(放)水监测系统', 'sfs'), ('quakedefine', '微震监测基础信息数据文件', 'WZCDDY', '微震监测基础信息', '微震监测系统', 'wz'), ('quakerealdata', '微震监测实时信息数据文件', 'WZCDSS', '微震监测实时信息', '微震监测系统', 'wz'), ('raindefine', '降水量监测基础信息数据文件', 'JSLCDDY', '降水量监测基础信息', '降水量监测系统', 'jsl'), ('rainrealdata', '降水量监测实时信息数据文件', 'JSLCDSS', '降水量监测实时信息', '降水量监测系统', 'jsl'), ('sinkdefine', '地表沉陷监测基础信息数据文件', 'DBCXCDDY', '地表沉陷监测基础信息', '地表沉陷监测系统', 'dbex'), ('sinkrealdata', '地表沉陷监测实时信息数据文件', 'DBCXCDSS', '地表沉陷监测实时信息', '地表沉陷监测系统', 'dbex'), ('surfacedefine', '地表水监测基础信息数据文件', 'DBSCDDY', '地表水监测基础信息', '地表水监测系统', 'dbs'), ('surfacerealdata', '地表水监测实时信息数据文件', 'DBSCDSS', '地表水监测实时信息', '地表水监测系统', 'dbs');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
