package jdbc;
import java.sql.*;

public class InsertStaticContent {
	public static void main(String []args) {
		// setup to use mysql database
		String url = "jdbc:mysql://localhost:3306/YOUR_DATABASE_HERE"; // link to your database
		String username = "YOUR USERNAME HERE"; // mysql username
		String password = "YOUR PASSWORD HERE"; // mysql password
		
		// query to be implemented
		String insertStaticContent = "INSERT into developer_tools(language, frontend_tool) "
				+ "VALUES('C#', 'CSS')";
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create the connection to mysql database
			Connection con = DriverManager.getConnection(url, username, password);
			// create statement
			Statement st = con.createStatement();
			/* execute the query
			 * INSERT uses executeUpdate method & returns an integer indicating number of rows affected
			 */
			int numberOfRowsAffected = st.executeUpdate(insertStaticContent);
			System.out.printf("Number of rows affected = %d ", numberOfRowsAffected);
			System.out.println();
			
			//close the connection and the statement
			con.close();
			st.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
