package Ch40Thread;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C01GUI extends JFrame implements ActionListener, KeyListener {
	JButton btn1;
	JButton btn2; //아까하던방식대로하면 C01GUI생성자 안에서만 사용되는 지역변수
	JButton btn3;
	JButton btn4;
	JTextField txt1;
	JTextArea area1;
	JTextArea area2; //area를 추가했음
	JScrollPane scroll1;
	JScrollPane scroll2;
	
	Thread th1; //일꾼 관리를 위한 참조변수
	Thread th2;
	
	public C01GUI() {
		super();
		

		
		
		
		
		setBounds(100,100,600,500);
		setTitle("Lisner적용하기");		
		JPanel pan1 = new JPanel();		
		Color col = new Color(0,50,100); 
		pan1.setBackground(col);	
		
		
		//컴포넌트 객체 생성
		btn1 = new JButton("시작");
		btn2 = new JButton("중지");
		btn3 = new JButton("시작");
		btn4 = new JButton("중지");
		txt1 = new JTextField("");
		area1 = new JTextArea();
		area2 = new JTextArea(); //area객체도 하나 더 만들었다.
		scroll1 = new JScrollPane(area1);
		scroll2 = new JScrollPane(area2);
		
		//기타설정
		area1.setEditable(false); //텍스트스크롤편집불가
		
		
		//위치지정
		txt1.setBounds(50,350,200,30);
		scroll1.setBounds(50,50,200,280);
		scroll2.setBounds(300,50,190,280);
		btn1.setBounds(50, 400, 80, 30);
		btn2.setBounds(160, 400, 80, 30);
		btn3.setBounds(300, 400, 80, 30);
		btn4.setBounds(410, 400, 80, 30);
		
		//컴포넌트를 리스너에 등록
		btn1.addActionListener(this);
		//actionListner라는 함수를 통해 button1이라는 객체 자체를 추가.
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		txt1.addKeyListener(this);
		
		
		pan1.add(btn1); pan1.add(btn2); 
		pan1.add(btn3); pan1.add(btn4);
		pan1.add(txt1);	
		pan1.add(scroll1); pan1.add(scroll2); //스크롤2도 등록
		pan1.setLayout(null); 
		
		
		add(pan1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);
	}
	
	//ActionListner에있던 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
								//event객체를 e가 받아준다.
		if(e.getSource()==btn1) {
			//스레드1 시작
			C03Task1 worker1 = new C03Task1(this); 
			//worker객체생성. 스레드만들기.
			th1 = new Thread(worker1);			
			if(!th1.isInterrupted()) th1.start();
		}
		if(e.getSource()==btn2) {
			//스레드1 중지
			th1.interrupt();

		}	
		if(e.getSource()==btn3) {
			//스레드2 시작		
			
			//this의 의미 : 만들어진 gui객체의 주소
			C03Task2 worker2 = new C03Task2(this);
			th2 = new Thread(worker2); //독립적인 공간에 일꾼 분리
			th2.start();
		}	
		if(e.getSource()==btn4) {
			//스레드2 중지
			th2.interrupt();
		}	
	}
	
	//KeyListner
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==10) {
			//엔터키의 아스키코드 10
			String temp = txt1.getText();
			area1.append(temp + "\n");
			txt1.setText("");
		}		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}


public class C03SwingThread {
	public static void main(String[] args) {
		new C01GUI();
	}
}
