package Ch34;
import java.sql.*;
public class C05SELECTSAMYANG {
	public static void main(String[] args) {
		//1. 연결관련 정보 저장용 변수
		String id = "root";
		String pw = "1234";
		String url ="jdbc:mysql://192.168.5.50:3306/samyang"; 
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
				//테이블형태를 받아오는 객체. SELECT에서 쓴다.
		
		//3. 연결작업
		try {
			//DB드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver"); //클래스이름이다.
			System.out.println("Driver Loading Success!");
			//DB연결객체 생성
			conn=DriverManager.getConnection(url, id, pw);
											//원하는DBMS위치, 
			System.out.println("DB Connected..!");
			
			//SQL전송
			pstmt=conn.prepareStatement("select * from samyang_ramen");
			
			//SQL실행
			rs = pstmt.executeQuery(); 
			//이건 int가 아니고 resultset의 형태로 리턴된다. 
			//그래서 rs객체에 resultset의 주소를에 담아준다.
			System.out.println("이름\t\t날짜\t\t수량");
			System.out.println("-----------------------------------------");
			while(rs.next()) {
				//한 열 이동하는것을 .next() 더이상 next가 되지않을 때 까지 
				
				System.out.printf("%7s%15s%7d\n",rs.getString(1), rs.getString(2),rs.getInt(3));
			}	
		} catch(Exception e) {
			e.printStackTrace();
			//만약에 오류가 발생하면 예외객체가만들어진다. 예외객체는 catch를 만들어줘야한다.
		} finally {
			//finally내부에 객체들을 해제하는 작업을 한다.
			//메모리공간에서 없애주는작업이다. 안 하면 계속 메모리공간에서 적재하고있다.
			//이것도 따로 try-catch만들어줘야한다.
			try { pstmt.close(); } catch (Exception e2) { e2.printStackTrace(); }
			try { conn.close(); } catch (Exception e1) { e1.printStackTrace(); }
		}
		
		
		
		
		
		
		
	}
}
