package jdbc;
import java.sql.*;

class SetupClass{
	String url = "jdbc:mysql://localhost:3306/jdbc_db_one";
	String username = "*********Your MySql user name********** ";
	String password = "********Your Mysql Password************ ";
}


class QueryClass{
	//String updateLanugae1 = "UPDATE developer_tools SET language = Elixir WHERE id in (1, 20)";
	String updateLanugae1 = "UPDATE developer_tools SET language = 'GO' WHERE id = 2";
	String sql = "UPDATE developer_tools SET language = 'Unknown' WHERE id = 10";
}

public class UpdateJdbc {
	public static void main(String []args) {
		System.out.println("JDBC updation...");
		
		// setup
		SetupClass setup = new SetupClass();
		
		//queries
		QueryClass query = new QueryClass();
		
		//JDBC
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(setup.url, setup.username, setup.password);
			//PreparedStatement pst = con.prepareStatement(query.updateLanugae1);
			Statement st = con.createStatement();
			//int rowsCountAffected = st.executeUpdate(query.updateLanugae1);
			int rowsCountAffected = st.executeUpdate(query.sql);
			System.out.println("Rows affected = " + rowsCountAffected);
			//close the connections
			con.close();
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
