import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C03 {
	public static void main(String[] args) {
		//연결관련정보
		String driver="com.mysql.cj.jdbc.Driver";
		String user = "root";
		String pwd = "1234";
		String url ="jdbc:mysql://localhost:3306/tempdb"; 

		
		
		
		String sql;		
		Connection conn = null;
		PreparedStatement pstmt = null; 
		ResultSet rs = null; 	
		
		//연결작업
		try {
			System.out.println("Driver Loading Success");
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, pwd);
			System.out.println("DB Connected..!");
			pstmt=conn.prepareStatement("select * from student_tbl");

			rs = pstmt.executeQuery(); 

			while(rs.next()) {
				System.out.print(rs.getString("id") + " ");
				System.out.print(rs.getString("name") + " ");
				System.out.print(rs.getInt("age") + " ");
				System.out.print(rs.getString("addr") + " ");
				System.out.println();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try { pstmt.close(); } catch (Exception e2) { e2.printStackTrace(); }
			try { conn.close(); } catch (Exception e1) { e1.printStackTrace(); }
		}		
		
		
		
		
		
		
		
	}
}
