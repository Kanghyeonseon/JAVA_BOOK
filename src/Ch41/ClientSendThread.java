package Ch41;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSendThread implements Runnable {
	Socket client; //클라이언트객체의 수신송신쓰레드를 받아야한다.
	DataOutputStream Dout;
	Scanner sc = new Scanner(System.in);
	public ClientSendThread(Socket client) { this.client=client; }
	@Override
	public void run() {
		try {
			Dout = new DataOutputStream(client.getOutputStream());
			String send;
			while(true) {
				System.out.print("[Clinet] : ");
				send = sc.nextLine();
				Dout.writeUTF(send);
				if(send == null || send.equals("q")) {
					System.out.println("연결을 종료합니다.");
					System.exit(-1);
				}
				Dout.flush();
				
			}			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
