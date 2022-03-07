import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class ResultDemo {

	public static void main(String[] args) {
		
//		String sql = "select * from citizen";
		try {
			Connection conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			ResultSet rs = stmt.executeQuery("select id,name,age,city from citizen");
//			rs.absolute(9);
//			rs.updateString("name", "julie");
//			rs.updateRow();
//			rs.absolute(0);
//			rs.moveToInsertRow();
//			rs.updateInt(1, 109);
//			rs.updateString(2, "nobita");
//			rs.updateInt(3, 21);
//			rs.updateString(4, "Nainital");
//			rs.insertRow();
//			rs.moveToCurrentRow();
//    		rs.deleteRow();
//			rs.absolute(9);
//			rs.deleteRow();
			rs.moveToCurrentRow();
			ResultSetMetaData meta = rs.getMetaData();
			
			for(int c=1; c<=meta.getColumnCount(); c++)
				System.out.print(meta.getColumnName(c) + "\t");
			System.out.println();
			
			while(rs.next())
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
