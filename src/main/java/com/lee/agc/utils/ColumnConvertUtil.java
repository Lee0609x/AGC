package com.lee.agc.utils;

import com.lee.agc.model.Column;
import com.lee.agc.model.SqlColumn;

import java.util.ArrayList;
import java.util.List;

/**
 * 将SqlColumn转换为Column
 * @Author: Lee0609x
 * @Date: 2018/7/30 21:58
 */
public class ColumnConvertUtil {
    /**
     * 将数据库中的列属性转换为java属性
     * @param sqlColumns
     * @return
     */
    public static List<Column> conver(List<SqlColumn> sqlColumns) {
        ArrayList<Column> columns = new ArrayList<Column>();
        for (SqlColumn sqlColumn : sqlColumns) {
            Column column = new Column();
            //TODO
            columns.add(column);
        }
        return columns;
    }

    /**
     * 将sql类型转换为java类型
     * @param sqlType
     * @return
     */
    private static String typeConver(String sqlType) {
        return null;
    }

    /**
     * 将数据库的列名转换为符合java命名规则的列名
     * @param sqlName
     * @return
     */
    private static String nameConver(String sqlName) {
        return null;
    }


}
