package jdbc.practics;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCDemo {

	public static void main(String[] args) throws SQLException {
		 JDBCDemo jd = new JDBCDemo();
		 jd.retrieveData();

	}
	public void retrieveData() throws SQLException{
		String url="jdbc:mysql://localhost:3306/ PRACTICE1";
		String username="root";
		String pass="Ammu@1211";
		//String query="insert into Student values(4,'kavi',9.0)";
		String query="select * from Student";
		//int id=4;
		//String query = "delete from Student where id= "+ id;
		//String query = "update Student set GPA =9.0 where id=4";
		
	
		
		Connection con = DriverManager.getConnection(url,username,pass);
	    Statement st= con.createStatement();
        ResultSet rs =st.executeQuery(query);
	   //int rows = st.executeUpdate(query);
//		
//	System.out.println("number of rows affected" + rows);
//	   con.close();
//		st.close();
//		
		while(rs.next()) {
			String userData = rs.getInt(1) + ":" + rs.getString(2)+":"+rs.getFloat(3);
			System.out.println(userData);		}
		con.close();
		st.close();	
	}
}

