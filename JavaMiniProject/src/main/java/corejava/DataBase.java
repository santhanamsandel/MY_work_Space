package corejava;

import java.sql.*;


public class DataBase {
	
	
  static java.sql.Timestamp date=new java.sql.Timestamp(new java.util.Date().getTime());
	
	
	
	
public static Connection getCon() throws SQLException {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/best_choice","root","santhanam");
	return con;
	
}

public static void cust_detail(String name,String add,String mblno) throws SQLException
{
 
	PreparedStatement pre=DataBase.getCon().prepareStatement("insert into cust_details values (?,?,?,?,?)");
	
	
//	java.sql.Timestamp=new java.sql.Timestamp(new java.util.Date().getDate())

	pre.setString(1,null);
	pre.setTimestamp(2,date);
	pre.setString(3,name);
	pre.setString(4,add);
	pre.setString(5,mblno);
	pre.execute();
	}

} 
