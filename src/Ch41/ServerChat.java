package Ch41;
import java.io.*;
import java.net.*;

public class ServerChat {
	public static void main(String[] args) {
		//어느시점에서 스레드가 동작하는가?
		try { 
			//1
			ServerSocket server = new ServerSocket(1234);
			System.out.println("서비스 실행.....");			
			//2
			Socket client = server.accept();
			System.out.println(client.getInetAddress() + " 에서 접속");
			
			//3 스레드 객체 생성
			//클라이언트의 스레드를 받아서 recv와 send에 전달.
			ServerRecvThread recv = new ServerRecvThread(client);
			ServerSendThread send = new ServerSendThread(client);
			
			Thread th1 = new Thread(recv);
			Thread th2 = new Thread(send); //독립적인 공간으로 쓰레드를 분리해준다.
			
			//4 스레드 동작
			th1.start();
			th2.start();
			
		} catch (Exception e) { }
	}
}
