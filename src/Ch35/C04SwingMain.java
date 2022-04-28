package Ch35;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class C04GUI extends JFrame {
	public C04GUI() {
		super();
		setBounds(100,100,540,500);
		setTitle("세번째 프레임입니다.");		
		JPanel pan1 = new JPanel();		
		Color col = new Color(100,200,255,200); 
		pan1.setBackground(col);
		
		//버튼 객체 생성
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		JButton btn4 = new JButton("Button4");
		
		//버튼 위치 생성
		btn1.setBounds(50, 400, 80, 30);
		btn2.setBounds(160, 400, 80, 30);
		btn3.setBounds(270, 400, 80, 30);
		btn4.setBounds(380, 400, 80, 30);
		
		//버튼 패널에 추가
		pan1.add(btn1); pan1.add(btn2);
		pan1.add(btn3); pan1.add(btn4);
		
		//레이아웃 null
		pan1.setLayout(null); 
		//기본적인 레이아웃이다. 없애줘야 setBounds가 된다.
				
		//패널을 프레임에 추가
		add(pan1);	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);
	}
}
public class C04SwingMain {
	public static void main(String[] args) {
		new C04GUI();
	}
}
