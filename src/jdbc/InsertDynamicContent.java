package jdbc;
import java.sql.*;

/*
 * To create dynamic content, store values to be inserted into database table in variables
 * in sql query statement, use ? to represent dynamic content
 * before executing the query in resultset, update the variables with dynamic contents
 * 
 * When you use ps.executeUpdate(), you do not have to pass in query for dynamic data insert,
 * rather you have to update variables with dynamic values before executing it.
 */

public class InsertDynamicContent {
	public static void main(String [] args) {
		System.out.println("JDBC to insert Dynamic content...");
		
		// set up for connection to local host
		String url = "jdbc:mysql://localhost:3306/YOUR_DATABASE_HERE";
		String username = "YOUR MYSQL USERNAME";
		String password = "YOUR MYSQL PASSWORD";
		
		// dynamic content
		String lang = "Scala"; // for language column in database table
		String technology = "echo"; // for frontend_tool column in database table
		
		// SQL query to insert dynamic content, use ? for dynamic content
		String insertDynamicContent = "INSERT INTO developer_tools(language, frontend_tool) "
				+ "VALUES(?, ?)";
		
		try {
			//load mysql jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// connect to mysql database
			Connection con = DriverManager.getConnection(url, username, password);
			// use PreparedStatement for handling dynamic content
			PreparedStatement ps = con.prepareStatement(insertDynamicContent);
			//update the dynamic content
			ps.setString(1, lang);
			ps.setString(2, technology);
			// Now, execute the statement
			int numRowsAffected = ps.executeUpdate();
			System.out.println("Number of rows affecterd = " + numRowsAffected);
			
			// close connection and statement
			con.close();
			ps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
