package jdbcDesignPatterns;
import java.sql.*;

/*
 * This class contains MySql url, username, and password
 */
class JdbcSetUp{
	// JDBC Steps
	String url = "jdbc:mysql://localhost:3306/jdbc_students_db"; //mysql connector
	String username = "YOUR MySql User name"; // FIx this
	String password = "YOUR MySql Password";  // Fix this
}


class UpdateDataBase{
	public void updateDatabase() {
		// JDBC setup
		JdbcSetUp setupObject = new JdbcSetUp();
		String url = setupObject.url;
		String username = setupObject.username;
		String password = setupObject.password;
		
		// insert values in database
		String insertValues = "INSERT INTO students(student_id, first_name, last_name)"
				+ "VALUES(1, 'nabin', 'niroula')";
		String std2 = "INSERT INTO students(student_id, first_name, last_name) "
				+ "VALUES(2, 'Jane', 'Doe')";
		String std3 = "INSERT INTO students(student_id, first_name, last_name) "
				+ "VALUES(3, 'James', 'Gosling')";
		
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// connect to mysql database
			Connection con = DriverManager.getConnection(url, username, password);
			// create statement
			Statement st = con.createStatement();
			// execute the query
			int rowCount = st.executeUpdate(insertValues);
			int secondInsert = st.executeUpdate(std2);
			int thirdInsert = st.executeUpdate(std3);
			System.out.printf("Number of rows affected = %d", rowCount + secondInsert + thirdInsert);
			System.out.println();		
			// close connections
			con.close();
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


class StudentDAO{
	public Student getStudent(int std_id) {
		// implement jdbc steps to access database and get student name
		try {
			// instantiate the student class
			Student stdObject = new Student();
			stdObject.rollNumber = std_id;
			
			// JDBC Steps
			JdbcSetUp setupObject = new JdbcSetUp();
			String url = setupObject.url;
			String username = setupObject.username;
			String password = setupObject.password;
			
			// sql retrieval query
			// use prepared statement, use ? for dynamic/variable value
			String q = "SELECT first_name, last_name FROM students WHERE student_id = ?";
			Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver
			Connection con = DriverManager.getConnection(url, username, password); // connect to the database
			// create prepared statement for using variable as dynamic value
			PreparedStatement ps = con.prepareStatement(q);
			//update the variable
			ps.setInt(1, std_id); // first 1 = ?, std_id is for student_id in table
			ResultSet rs = ps.executeQuery(); //execute the statement
			// resultSet contains table representing first and last name in this case
			while(rs.next()) {
				String fName = rs.getString(1);
				String lName = rs.getString(2);
				stdObject.firstName = fName;
				stdObject.lastName = lName;
			}
			// close connections
			con.close();
			ps.close();

			return stdObject; // return student object here
		}catch(Exception e) {
			e.printStackTrace();
		}
		// if no student found, return null
		return null;
	}
}


// Student class
class Student{
	int rollNumber;
	String firstName;
	String lastName;
}

/*
 * main class
 */
public class JdbcDAO {
	public static void main(String []args) {
		System.out.println("JDBC Design patterns...");
		/*
		 * UpdateDataBase class
		 */
		// UpdateDataBase class to insert values into database table
		//UpdateDataBase udb = new UpdateDataBase();
		//udb.updateDatabase();
		
		/*
		 * StudentDAO class
		 */
		// I know the student id, I wanted to know the name of that student
		StudentDAO stdDao = new StudentDAO();
		/*
		 * Student class
		 */
		Student std1 = stdDao.getStudent(1);
		//System.out.println(std1);
		String stdFirstName = std1.firstName;
		String stdLastName = std1.lastName;
		String fullName = "Student name is " + stdFirstName + " " + stdLastName;
		System.out.println(fullName);
	}
}
