/*
 Navicat Premium Data Transfer

 Source Server         : Waylon
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : rbac

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 29/11/2022 21:59:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sn` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (1, '干饭部', 'Have meal');
INSERT INTO `department` VALUES (2, '人力资源部', 'Human Resources Department');
INSERT INTO `department` VALUES (3, '采购部', 'Order Department');
INSERT INTO `department` VALUES (4, '仓储部', 'Warehousing Department');
INSERT INTO `department` VALUES (5, '财务部', 'Finance Department');
INSERT INTO `department` VALUES (6, '技术部', 'Technolog Department ');
INSERT INTO `department` VALUES (7, 'Waylon', 'flag');
INSERT INTO `department` VALUES (9, '小花部', '911');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(0) NULL DEFAULT NULL,
  `admin` bit(1) NULL DEFAULT NULL,
  `dept_id` bigint(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1, 'admin', '1', 'admin@abc.com', 20, b'1', 2);
INSERT INTO `employee` VALUES (3, '赵一明', 'c4ca4238a0b923820dcc509a6f75849b', 'zhaoym@wolfcode.cn', 25, b'0', 1);
INSERT INTO `employee` VALUES (4, '钱总', 'c4ca4238a0b923820dcc509a6f75849b', 'qianz@wolfcode.cn', 35, b'0', 2);
INSERT INTO `employee` VALUES (5, '钱二明', 'c4ca4238a0b923820dcc509a6f75849b', 'qianem@wolfcode.cn', 25, b'0', 2);
INSERT INTO `employee` VALUES (6, '孙总', 'c4ca4238a0b923820dcc509a6f75849b', 'sunz@wolfcode.cn', 35, b'0', 3);
INSERT INTO `employee` VALUES (7, '孙三明', 'c4ca4238a0b923820dcc509a6f75849b', 'sunsm@wolfcode.cn', 25, b'0', 3);
INSERT INTO `employee` VALUES (8, '李总', 'c4ca4238a0b923820dcc509a6f75849b', 'liz@wolfcode.cn', 35, b'0', 4);
INSERT INTO `employee` VALUES (9, '李四明', 'c4ca4238a0b923820dcc509a6f75849b', 'lism@wolfcode.cn', 25, b'0', 4);
INSERT INTO `employee` VALUES (10, '李六明', 'c4ca4238a0b923820dcc509a6f75849b', 'lilm@wolfcode.cn', 25, b'0', 7);
INSERT INTO `employee` VALUES (20, 'Waylon', NULL, '205218290@qq.com', 20, NULL, 1);
INSERT INTO `employee` VALUES (21, '小花', NULL, 'xiaohua@qq.com', 91, NULL, 9);

-- ----------------------------
-- Table structure for employee_role
-- ----------------------------
DROP TABLE IF EXISTS `employee_role`;
CREATE TABLE `employee_role`  (
  `employee_id` bigint(0) NULL DEFAULT NULL,
  `role_id` bigint(0) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee_role
-- ----------------------------
INSERT INTO `employee_role` VALUES (3, 5);
INSERT INTO `employee_role` VALUES (4, 3);
INSERT INTO `employee_role` VALUES (6, 2);
INSERT INTO `employee_role` VALUES (7, 3);
INSERT INTO `employee_role` VALUES (1, 4);
INSERT INTO `employee_role` VALUES (1, 6);
INSERT INTO `employee_role` VALUES (8, 7);
INSERT INTO `employee_role` VALUES (9, 3);
INSERT INTO `employee_role` VALUES (5, 4);
INSERT INTO `employee_role` VALUES (5, 3);
INSERT INTO `employee_role` VALUES (5, 5);
INSERT INTO `employee_role` VALUES (21, 6);
INSERT INTO `employee_role` VALUES (21, 7);

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `expression` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES (1, '部门删除', 'department:delete');
INSERT INTO `permission` VALUES (2, '部门列表', 'department:list');
INSERT INTO `permission` VALUES (3, '部门编辑', 'department:input');
INSERT INTO `permission` VALUES (4, '部门保存或更新', 'department:saveOrUpdate');
INSERT INTO `permission` VALUES (5, '员工删除', 'employee:delete');
INSERT INTO `permission` VALUES (6, '员工列表', 'employee:list');
INSERT INTO `permission` VALUES (7, '员工编辑', 'employee:input');
INSERT INTO `permission` VALUES (8, '员工保存或更新', 'employee:saveOrUpdate');
INSERT INTO `permission` VALUES (9, '权限列表', 'permission:list');
INSERT INTO `permission` VALUES (10, '权限加载', 'permission:reload');
INSERT INTO `permission` VALUES (11, '角色删除', 'role:delete');
INSERT INTO `permission` VALUES (12, '角色列表', 'role:list');
INSERT INTO `permission` VALUES (13, '角色编辑', 'role:input');
INSERT INTO `permission` VALUES (14, '角色保存或更新', 'role:saveOrUpdate');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sn` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, '人事管理', 'HR_MGR');
INSERT INTO `role` VALUES (2, '采购管理', 'ORDER_MGR');
INSERT INTO `role` VALUES (3, '仓储管理', 'WAREHOUSING_MGR');
INSERT INTO `role` VALUES (4, '行政部管理', 'Admin_MGR');
INSERT INTO `role` VALUES (5, '市场经理', 'Market_Manager');
INSERT INTO `role` VALUES (6, '市场专员', 'Market');
INSERT INTO `role` VALUES (7, 'Waylon', '5');

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission`  (
  `role_id` bigint(0) NULL DEFAULT NULL,
  `permission_id` bigint(0) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES (5, 8);
INSERT INTO `role_permission` VALUES (4, 11);
INSERT INTO `role_permission` VALUES (2, 1);
INSERT INTO `role_permission` VALUES (2, 3);
INSERT INTO `role_permission` VALUES (2, 5);
INSERT INTO `role_permission` VALUES (3, 6);
INSERT INTO `role_permission` VALUES (3, 7);
INSERT INTO `role_permission` VALUES (6, 2);
INSERT INTO `role_permission` VALUES (1, 5);
INSERT INTO `role_permission` VALUES (1, 6);
INSERT INTO `role_permission` VALUES (1, 7);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `account` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`account`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('Lorraine', '123456', 'Lorraine@qq.com');
INSERT INTO `user` VALUES ('Waylon', '123456', 'Waylon@qq.com');

SET FOREIGN_KEY_CHECKS = 1;
