package com.lee.agc.model;

/**
 * @Author: Lee0609x
 * @Date: 2018/8/5 21:17
 * java
 */
public class Column {
    private String columnName;
    private String isNullable;
    private String dataType;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
}
