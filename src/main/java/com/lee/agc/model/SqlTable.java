package com.lee.agc.model;

import java.util.List;

/**
 * @Author: Lee0609x
 * @Date: 2018/7/28 17:26
 * SQL
 */
public class SqlTable {
    private String tableName;
    private List<SqlColumn> columns;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<SqlColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<SqlColumn> columns) {
        this.columns = columns;
    }
}
