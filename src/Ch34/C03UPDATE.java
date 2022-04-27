package Ch34;
import java.sql.*;
public class C03UPDATE {
	public static void main(String[] args) {
		
		//1. 연결관련 정보 저장용 변수
		String id = "root";
		String pw = "1234";
		String url ="jdbc:mysql://192.168.5.50:3306/testdb"; 
		//특정 DBMS연결위한 url 
		//mysql : oracleDB같은게 될 수 있다.
		//localhost : dbms가 같은 컴퓨터에 있으므로 이렇게 입력. IP나 도메인네임이 들어갈 수 있다.
		//3306 : 포트번호 (해당 서비스를 찾아가기위한 주소)
		//내컴퓨터의 testdb에 연결하겠다는뜻이다.
		
		//2. DB연결관련 객체를 위한 참조변수
		Connection conn = null; //mysql 특정 DB와 연결할 때 Connection이 만들어짐.
								//DB연결객체 
		PreparedStatement pstmt = null; //SQL쿼리 전송용 객체
		ResultSet rs = null; 	//쿼리 결과(보통 Select 결과) 수신용 객체
		
		//3. 연결작업
		try {
			//DB드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver"); //클래스이름이다.
			System.out.println("Driver Loading Success!");
			//DB연결객체 생성
			conn=DriverManager.getConnection(url, id, pw);
											//원하는DBMS위치, 
			System.out.println("DB Connected..!");			
			
			//SQL전송객체
			pstmt = conn.prepareStatement("update students_Tbl set age=?, addr=?, hobby=?,goals=? where Name=?");
											//조건절
			pstmt.setInt(1, 3);
			pstmt.setString(2, "대구");
			pstmt.setString(3, "꿈변경");
			pstmt.setString(4, "돈많은백수");
			pstmt.setString(5, "강현선");
			
			//SQL전송
			int result = pstmt.executeUpdate();
			if(result!=0) { System.out.println("수정 성공!"); }
			else { System.out.println("수정 실패!"); }

		} catch(Exception e) {
			e.printStackTrace();
			//만약에 오류가 발생하면 예외객체가만들어진다. 예외객체는 catch를 만들어줘야한다.
		} finally {
			//finally내부에 객체들을 해제하는 작업을 한다.
			//메모리공간에서 없애주는작업이다. 안 하면 계속 메모리공간에서 적재하고있다.
			//이것도 따로 try-catch만들어줘야한다.
			try { pstmt.close(); } catch(Exception e2) {e2.printStackTrace(); }

			try {conn.close(); } catch (Exception e1) { e1.printStackTrace(); }
		}
		
		
		
		
		
		
		
		
	}
}
