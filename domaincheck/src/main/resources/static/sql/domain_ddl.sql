-- ----------------------------
-- Table structure for domainproduct
-- ----------------------------
CREATE TABLE `domainproduct` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `val` varchar(50) DEFAULT NULL,
  `createtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `isuse` tinyint(1) DEFAULT '0',
  `isavailable` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2688 DEFAULT CHARSET=utf8;