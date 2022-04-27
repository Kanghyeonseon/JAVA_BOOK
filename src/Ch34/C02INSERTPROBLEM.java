package Ch34;
import java.sql.*;
public class C02INSERTPROBLEM {
	public static void main(String[] args) {
		
		//1. 연결관련 정보 저장용 변수
		String id = "root";
		String pw = "1234";
		String url ="jdbc:mysql://192.168.5.50:3306/testdb"; 
		
		//2. DB연결관련 객체를 위한 참조변수
		Connection conn = null; 
		PreparedStatement pstmt = null;
		ResultSet rs = null; 
		
		//3. 연결작업
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			System.out.println("Driver Loading Success!");
			conn=DriverManager.getConnection(url, id, pw);
			System.out.println("DB Connected..!");
			
			//4. SQL전송객체 생성
			pstmt=conn.prepareStatement("insert into students_Tbl values(?,?,?,?,?)");
									//conn객체에 문장을 넣어준다. 물음표 형태로 변수를만든다.
			pstmt.setString(1, "강현선");
			pstmt.setInt(2, 30);
			pstmt.setString(3, "대구");
			pstmt.setString(4, "롤");
			pstmt.setString(5, "챌린저");
			
			
			//5. SQL전송
			int result = pstmt.executeUpdate(); //Insert, Update, Delete SQL사용 시 실행되는 함수
								//행 변경 수를 리턴한다.
			if(result!=0 ) {
				System.out.println("INSERT 성공!");
			} else {
				System.out.println("INSERT 실패;");
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try { pstmt.close(); } catch(Exception e2) {e2.printStackTrace(); }

			try {conn.close(); } catch (Exception e1) { e1.printStackTrace(); }
		}
		
		
		
		
		
		
		
	}
}
