package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcdemo {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet rs =null;
		try {connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","Akki");
		statement = connection.createStatement();
		rs = statement.executeQuery("select * from Account");
		while(rs.next()) {
			int accno=rs.getInt(1);
			String lastname = rs.getString(3);
			String firstname = rs.getString(2);
//			String email = rs.getString(3);
//			String password = rs.getString(4);
			System.out.println("|"+accno+"|"+firstname+"|"+lastname);
			}} 
		catch (SQLException e)
		{e.printStackTrace();
		}finally
		{//cleanup 
			try {rs.close();
			statement.close();
			connection.close();} 
			catch (SQLException e) {
				// TODO Auto-generated catch blocke.printStackTrace();}}}
			}
		}
	}

}
