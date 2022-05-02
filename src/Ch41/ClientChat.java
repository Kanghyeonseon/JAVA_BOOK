package Ch41;
import java.io.*;
import java.net.*;

public class ClientChat {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("192.168.5.3",1237);
			
			ClientRecvThread recv = new ClientRecvThread(client);
			ClientSendThread send = new ClientSendThread(client);
			
			Thread th1 = new Thread(recv);
			Thread th2 = new Thread(send); //독립적인 공간으로 쓰레드를 분리해준다.
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
