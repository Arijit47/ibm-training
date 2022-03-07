import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;

public class QueryAnalyzer {

	public static void main(String[] args) throws SQLException {
		String sql = "select id,city from citizen";
		
		Connection conn = JdbcFactory.getConnection();
		ResultSet rs = conn.createStatement().executeQuery(sql);
		ResultSetMetaData meta = rs.getMetaData();
		
		for(int c=1; c<=meta.getColumnCount(); c++)
			System.out.print(meta.getColumnName(c).toUpperCase() + "\t");
		System.out.println();
		
		while(rs.next()) {
			for(int c=1; c<=meta.getColumnCount(); c++)
				System.out.print(rs.getString(c) + "\t");
			System.out.println();
		}

	}
}

