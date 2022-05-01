package Ch39;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
public class C03ClientSocket {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("192.168.5.20", 5050);
							//Socket("서버아이피", 포트번호);
						//5050 : 아까 설정한 포트번호. 전화기비유의 전화번호와 같다.
			OutputStream out = client.getOutputStream();
			DataOutputStream Dout = new DataOutputStream(out);
			
			Scanner sc = new Scanner(System.in);
			System.out.printf("전달 메세지 : ");
			String message = sc.next();
			Dout.writeUTF("본인이름 : " + message);
			
			Dout.flush();
			client.close();
			
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}
}
