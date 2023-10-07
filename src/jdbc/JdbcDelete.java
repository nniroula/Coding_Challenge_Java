package jdbc;
import java.sql.*;

class JdbcSetup{
	String url = "jdbc:mysql://localhost:3306/jdbc_db_one";
	String username = "*********Your MySql user name********** ";
	String password = "********Your Mysql Password************ ";
}


class SqlQueries{
	String delete1 = "DELETE from developer_tools WHERE id = ?"; // table = developer_tools
	//delete from developer_tools where id = 14;
}


public class JdbcDelete {
	public static void main(String[]args) {
		System.out.println("JDBC DELETE...");
		
		// JDBC setup
		JdbcSetup setup = new JdbcSetup();
		
		// queries
		SqlQueries queries = new SqlQueries();
		
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connect to mysql
			Connection con = DriverManager.getConnection(setup.url, setup.username, setup.password);
			//create statement
			PreparedStatement ps = con.prepareStatement(queries.delete1);
			// update the id for item to be deleted
			ps.setInt(1, 8);
			//execute the query
			int rowsAffectedCount = ps.executeUpdate();
			System.out.println("Number of rows affected = " + rowsAffectedCount);
			//close connections
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
