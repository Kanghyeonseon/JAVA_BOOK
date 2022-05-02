package Ch41;

import java.io.DataInputStream;
import java.net.Socket;

public class ServerRecvThread implements Runnable {
	
	Socket client; //클라이언트객체의 수신송신쓰레드를 받아야한다.
	DataInputStream Din;
	public ServerRecvThread(Socket client) { this.client=client; }
	@Override
	public void run() {
		try {
			Din = new DataInputStream(client.getInputStream());
										//수신스트림을 가지고왔음.
			String recv;
			while(true) {
				recv = Din.readUTF(); //클라이언트가 내용을 주면 수신한다.
				if(recv== null || recv.equals("q")) {
					System.out.println("연결을 종료합니다.");
					System.exit(-1);
				}
				System.out.println("\r[Client] " + recv);
									//클라이언트가 입력했던 내용을 보여준다.
					
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
