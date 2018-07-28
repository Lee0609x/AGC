package com.lee.agc;

/**
 * @Author: Lee0609x
 * @Date: 2018/7/28 17:17
 * 定义一些常量
 */
public class Constants {
    //查询数据库中所有的表
    public static final String SELECT_TABLE = "SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = (SELECT DATABASE()) ";
    //select * from information_schema.COLUMNS where TABLE_SCHEMA = (select database()) and TABLE_NAME=#{tableName}
    //查询数据库中所有的字段
    public static final String SELECT_COLUMN = "SELECT * FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA = (SELECT DATABASE()) ";
    //freemarker模板文件夹路径
    public static final String TEMPLATE_DIR = "C:\\Git\\GitProject\\AGC\\src\\main\\CodeTemplate";
}
