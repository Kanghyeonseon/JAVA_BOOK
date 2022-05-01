package Ch39;
import java.io.*;
import java.net.*;
public class C01ClientSocket {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("192.168.5.20", 5050);
							//Socket("서버아이피", 포트번호);
							//5050 : 아까 설정한 포트번호. 전화기비유의 전화번호와 같다.
			InputStream in = client.getInputStream();
			DataInputStream Din = new DataInputStream(in);
			
			System.out.println("-------서버 메세지 START-------");
			System.out.println(Din.readUTF() + "\n");
			System.out.println("-------서버 메세지 END  -------");			
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}
}
