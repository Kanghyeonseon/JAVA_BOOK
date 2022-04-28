package Ch36;

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
	JTextField txt1;
	JTextArea area1;
	JScrollPane scroll1;
	
	public C01GUI() {
		super();
		setBounds(100,100,540,500);
		setTitle("Lisner적용하기");		
		JPanel pan1 = new JPanel();		
		Color col = new Color(100,50,100); 
		pan1.setBackground(col);
		
		
		
		
		//컴포넌트 객체 생성
		btn1 = new JButton("입력");
		btn2 = new JButton("종료");
		JButton btn3 = new JButton("Button3");
		JButton btn4 = new JButton("Button4");		
		txt1 = new JTextField("경양식 돈까스 맛집 전원돈까스?");
		area1 = new JTextArea();
		scroll1 = new JScrollPane(area1);
		
		//기타설정
		area1.setEditable(false); //텍스트스크롤편집불가
		
		
		//위치지정
		txt1.setBounds(50,350,200,30);
		scroll1.setBounds(50,50,200,280);
		btn1.setBounds(50, 400, 80, 30);
		btn2.setBounds(160, 400, 80, 30);
		btn3.setBounds(270, 400, 80, 30);
		btn4.setBounds(380, 400, 80, 30);
		
		//컴포넌트를 리스너에 등록
		btn1.addActionListener(this);
		//actionListner라는 함수를 통해 button1이라는 객체 자체를 추가.
		btn2.addActionListener(this);
		txt1.addKeyListener(this);
		
		
		pan1.add(btn1); pan1.add(btn2); 
		pan1.add(btn3); pan1.add(btn4);
		pan1.add(txt1);	pan1.add(scroll1);		
		pan1.setLayout(null); 
		
		
		add(pan1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);
	}
	
	//ActionListner에있던 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
								//event객체를 e가 받아준다.
		if(e.getSource()==btn1) { //어떤 Component인지 확인
			//txt필드의 내용을 txtArea로 담아준다.
			String temp = txt1.getText();
			area1.append(temp + "\n"); //붙여준다는뜻
			txt1.setText(""); //내용을 추가하고 난 다음에는 txt필드가 비워진다.
			
		}
		if(e.getSource()==btn2) {
			System.exit(-1);
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


public class C01SwingMain {
	public static void main(String[] args) {
		new C01GUI();
	}
}
