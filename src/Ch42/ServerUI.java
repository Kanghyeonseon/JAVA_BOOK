package Ch42;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerUI extends JFrame implements KeyListener {
	
	JTextArea area;
	JTextField txt;
	JScrollPane scroll;
	
	ServerSocket server; Socket client;
	
	public ServerUI() {
		super("Chat Server");
		
		//패널
		JPanel pan = new JPanel();
		pan.setLayout(null);
		
		//컴포넌트
		area = new JTextArea();
		txt = new JTextField();
		scroll = new JScrollPane(area);		
		
		txt.setBounds(10,320,260,30);
		scroll.setBounds(10,10,260,300);
		
		//이벤트 리스너 등록
		txt.addKeyListener(this);
		
		
		//패널에 추가
		pan.add(txt); 
		pan.add(scroll);
		
		//프레임에 추가
		add(pan);
		
		
		this.setBounds(100,100,300,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//소켓 연결
		try {
			server = new ServerSocket(7890);
			client = server.accept();
			System.out.println("서비스 실행.....");			
			Socket client = server.accept();
			System.out.println(client.getInetAddress() + " 에서 접속");
			
			ServerRecvThread recv = new ServerRecvThread(client,this);
						//client : 소켓 연결
						//this : GUI객체 : 수신 한 문자열을 area로 append하기 위해
			//ServerSendThread send = new ServerSendThread(client);
			
			Thread th1 = new Thread(recv);
			
			th1.start();
			
			area.append(client.getInetAddress() + "에서 접속하였습니다.\n");
			
		} catch (IOException e) { e.printStackTrace(); }
		
	}
	
	public static void main(String[] args) {
		new ServerUI();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==10) {
			
			//입력한 내용이 클라이언트로 전달돼야한다. 
			try {
				DataOutputStream Dout = new DataOutputStream(client.getOutputStream());
				Dout.writeUTF(txt.getText());
				Dout.flush();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			//SendThread에 입력한 내용을 전달한다.
			area.append("[Server] : " + txt.getText() + "\n");
			txt.setText("");
			
			
		}		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
