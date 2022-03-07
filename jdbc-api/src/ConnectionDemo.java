import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;

public class ConnectionDemo {

	public static void main(String[] args) {
		
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";   //Oracle
//		String url = "jdbc:mysql://localhost:3306/training";
		try {
//		OracleDriver driver = new OracleDriver();  //Oracle
//		Driver driver = new Driver();    //MySql
//		
//		DriverManager.registerDriver(driver);
//		Connection conn = DriverManager.getConnection(url, "root", "password");
		Connection conn = JdbcFactory.getConnection();
		System.out.println("Connection Successful");
		
		DatabaseMetaData meta = conn.getMetaData();
		System.out.println("DB name: " + meta.getDatabaseProductName());
		System.out.println("DB var: " + meta.getDatabaseProductVersion());
		System.out.println("Driver name: " + meta.getDriverName());
		System.out.println("Driver var: " + meta.getDriverVersion());
		
		}catch(SQLException e) {
			System.out.println("Connection Faild");
			e.printStackTrace();
		}
	}

}
