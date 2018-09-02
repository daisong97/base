package com.base.gen.vo;

import java.util.List;

public class TableVo {
	private String tableName;
	
	private String pkName;

	private List<ColumnVo> columnVos;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<ColumnVo> getColumnVos() {
		return columnVos;
	}

	public void setColumnVos(List<ColumnVo> columnVos) {
		this.columnVos = columnVos;
	}

	public String getPkName() {
		return pkName;
	}

	public void setPkName(String pkName) {
		this.pkName = pkName;
	}
	
	
    
}
