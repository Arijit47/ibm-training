import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {
		String sql = "Insert into citizen values (105, 'jack', 24, 'Delhi')";
		
		try {
			Connection conn = JdbcFactory.getConnection();
			
			Statement stmt = conn.createStatement();
			
			stmt.execute(sql);      //DML operation
			
			System.out.println("Record inserted");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
