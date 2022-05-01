package Ch39;
import java.net.*;//인터넷연결
import java.io.*; //데이터송수신
public class C01ServerSocket {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5050);
						//서버객체					//포트번호.
			//내아이피 : 192.168.5.20(IPV4주소)
			System.out.println("서버 통신 서비스 시작!");
			Socket client = server.accept();
			//접속 요청을 한 클라이언트가 객체로 저장된다.
			//그리고 In/OutStream임 만들어진다.
			//accept()의 반환형이 Socket이고 클라이언트정보를 담고있는것이다.
			
			//데이터전송용스트림
			OutputStream out = client.getOutputStream();
						
			//보조스트림추가
			DataOutputStream Dout = new DataOutputStream(out);
			
			Dout.writeUTF("Server접속이 확인되었습니다.");
			Dout.flush();
			//클라이언트에게 전달해줄 문자. UTF문자셋으로 보낸다.
			
			server.close();
			client.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
