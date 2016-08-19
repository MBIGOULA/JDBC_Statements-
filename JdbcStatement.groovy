import java.sql.*;
DB_URL=""; //db url
USER="";  // db user
PASS=""; // db password
Connection conn = null;
Statement stmt = null;
conn = DriverManager.getConnection(DB_URL,USER,PASS);
stmt = conn.createStatement();
String sql = "select * from mp_shops" ;
ResultSet rs = stmt.executeQuery(sql);
 ResultSetMetaData rsmd = rs.getMetaData();
 System.out.println("Column name  : " + rsmd.getColumnName(35));
 System.out.println("Column type  : " + rsmd.getColumnTypeName(35)); // database specific type name
 System.out.println("Column  : " + rsmd.getColumnType(35)); // returns the SQL type
 
 //Alter table 
 PreparedStatement pst =  conn.prepareStatement("ALTER TABLE mp_shops MODIFY p_returnpolicy text");
 int numRowsChanged = pst.executeUpdate("ALTER TABLE mp_shops MODIFY p_returnpolicy text");
