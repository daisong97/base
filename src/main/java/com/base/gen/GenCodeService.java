package com.base.gen;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.gen.vo.ColumnVo;
import com.base.gen.vo.TableVo;

@Service

public class GenCodeService {
	@Autowired
	private DataSource dataSource;
	
	public List<TableVo> getAllTable() throws SQLException{
		DatabaseMetaData dbMetData = dataSource.getConnection().getMetaData();
		ResultSet rs = dbMetData.getTables(null,null, null,new String[] { "TABLE", "VIEW" });
		
		List<TableVo> result = new ArrayList<>();
		while (rs.next()) {
			if (rs.getString(4) != null
					&& (rs.getString(4).equalsIgnoreCase("TABLE") || rs
							.getString(4).equalsIgnoreCase("VIEW"))) {
				String tableName = rs.getString(3).toLowerCase();
				// 根据表名提前表里面信息：
				ResultSet colRet = dbMetData.getColumns(null, "%", tableName,"%");
				
				List<ColumnVo> columnVos = new ArrayList<>();
				String pkName = null;
				while (colRet.next()) {
					String columnName = colRet.getString("COLUMN_NAME");
					String columnType = colRet.getString("TYPE_NAME");
					int datasize = colRet.getInt("COLUMN_SIZE");
					int digits = colRet.getInt("DECIMAL_DIGITS");
					//int nullable = colRet.getInt("NULLABLE");
					ColumnVo columnVo =new ColumnVo();
					columnVo.setName(columnName);
					columnVo.setSize(datasize);
					columnVo.setType(columnType);
					columnVo.setDigits(digits);
					columnVos.add(columnVo);
				}
				
				TableVo tableVo = new TableVo();
				tableVo.setColumnVos(columnVos);
				tableVo.setPkName(pkName);
				tableVo.setTableName(tableName);
				result.add(tableVo);
			}
		}
		return result;
	}
}
