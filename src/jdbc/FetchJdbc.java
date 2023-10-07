package jdbc;
import java.sql.*;


class Setup{
	String url = "jdbc:mysql://localhost:3306/jdbc_db_one";
	String username = "*********Your MySql user name********** ";
	String password = "********Your Mysql Password************ ";
}

class Query{
	String retriveAll = "SELECT * From developer_tools";
	String retrieveJava = "SELECT * FROM developer_tools WHERE id=1";
}


public class FetchJdbc {
	public static void main(String []args) {
		System.out.println("JDBC Retrieval...");
		
		// setup class
		Setup setup = new Setup();
		
		// Queries
		Query query = new Query();
		
		try {
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(setup.url, setup.username, setup.password);
			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery(query.retriveAll);
			ResultSet rs = st.executeQuery(query.retrieveJava);
			// resultset contains table with different information
			while(rs.next()) {
				int id = rs.getInt(1);
				String language = rs.getString(2);
				String frontendTool = rs.getString(3);
				System.out.println(id + " " + language + " " + frontendTool);
			}
			// close connections
			con.close();
			st.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
