package jdbc;
import java.sql.*;

public class JDBC {
	public static void main(String []args) {
		System.out.println("Java JDBC...");
		
		// set up for mysql database
		String url = "jdbc:mysql://localhost:3306/jdbc_db_one";
		String username = "root"; // your mysql username
		// Enter your mySQl password
		String password = "please enter your MySQL password";
		
		// sql query to retrieve all information from the table
		String getInfo = "SELECT * FROM developer_tools";	
		
		/*
		 GET/retrieve the values from database
		 */
		try {
			// now load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection using DriverManager
			Connection con = DriverManager.getConnection(url, username, password);
			
			// create statement
			Statement st = con.createStatement();
			
			// executet the sql query defined above, use executeUpdate to insert values
			// run it only once
			//st.executeUpdate(q);
			
			// executet the sql query defined above
			ResultSet rs = st.executeQuery(getInfo); // stmt.executeUpdate(sql)
			System.out.println(rs);
			
			//preparedStatement = dbConnection.prepareStatement(deleteSQL);
			while(rs.next()) {
				String lang = rs.getString("language");
				System.out.println(lang);
				//String frontEndIndex = rs.getString("frontend_tool");
				//System.out.println(frontEndIndex);
				//String frontEndLang = rs.getString(1);
				//System.out.println(frontEndLang);
			}
			con.close();
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
}
