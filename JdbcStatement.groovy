import de.hybris.platform.core.Registry;
conn = Registry.getCurrentTenant().getDataSource().getConnection();
stmt = conn.createStatement();
String sql = "select * from mp_shops" ;
ResultSet rs = stmt.executeQuery(sql);
 ResultSetMetaData rsmd = rs.getMetaData();
 System.out.println("Column name  : " + rsmd.getColumnName(35));
 System.out.println("Column type  : " + rsmd.getColumnTypeName(35)); // database specific type name
 int columnType = rsmd.getColumnType(35);
 String columnTypeMeaning;
 switch (columnType) {
     case -7:  columnTypeMeaning = "BIT";
     break;
     case -6:  columnTypeMeaning = "TINYINT";
     break;
     case -5:  columnTypeMeaning = "BIGINT";
     break;
     case -4:  columnTypeMeaning = "LONGVARBINARY";
     break;
     case -3:  columnTypeMeaning = "VARBINARY";
     break;
     case -2:  columnTypeMeaning = "BINARY";
     break;
     case -1:  columnTypeMeaning = "LONGVARCHAR";
     break;
     case 0:  columnTypeMeaning = "null";
     break;
     case 1:  columnTypeMeaning = "CHAR";
     break;
     case 2:  columnTypeMeaning = "NUMERIC";
     break;
     case 3:  columnTypeMeaning = "DICIMAL";
     break;
     case 4:  columnTypeMeaning = "INTEGER";
     break;
     case 5:  columnTypeMeaning = "SMALLINT";
     break;
     case 6:  columnTypeMeaning = "FLOAT";
     break;
     case 7:  columnTypeMeaning = "REAL";
     break;
     case 8:  columnTypeMeaning = "DOUBLE";
     break;
     case 12:  columnTypeMeaning = "VARCHAR";
     break;
     case 91:  columnTypeMeaning = "DATE";
     break;
     case 92:  columnTypeMeaning = "TIME";
     break;
     case 93:  columnTypeMeaning = "TIMESTAMP";
     break;
     case 1111:  columnTypeMeaning = "OTHER";
     break;
     default: columnTypeMeaning = "Invalid";
     break;
 }
     
 System.out.println("Column type  : " + columnTypeMeaning); // returns the SQL type
 
 
 //Alter table 
 PreparedStatement pst =  conn.prepareStatement("ALTER TABLE mp_shops MODIFY p_returnpolicy text");
 int numRowsChanged = pst.executeUpdate("ALTER TABLE mp_shops MODIFY p_returnpolicy text");
