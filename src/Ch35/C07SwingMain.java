package Ch35;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C07GUI extends JFrame {
	public C07GUI() {
		super();
		setBounds(100,100,540,500);
		setTitle("여섯번째 프레임입니다.");		
		JPanel pan1 = new JPanel();		
		Color col = new Color(100,50,100); 
		pan1.setBackground(col);
		
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		JButton btn4 = new JButton("Button4");
		
		JTextField txt1 = new JTextField("경양식 돈까스 맛집 전원돈까스?");
		
		txt1.setBounds(50,350,350,30);
		
		
		//텍스트 Area 객체 생성, 크기, 위치 지정
		JTextArea area1 = new JTextArea();
//		area1.setBounds(50,50,190,280); //스크롤 추가시 이 부분 제거
		
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(50,50,190,280); //스크롤이 적용된 Area생성
		
		
		btn1.setBounds(50, 400, 80, 30);
		btn2.setBounds(160, 400, 80, 30);
		btn3.setBounds(270, 400, 80, 30);
		btn4.setBounds(380, 400, 80, 30);
		
		pan1.add(btn1); pan1.add(btn2); 
		pan1.add(btn3); pan1.add(btn4);
		pan1.add(txt1);
		
		//패널에 area추가
//		pan1.add(area1); 				//스크롤 추가시 이 부분 제거		
		pan1.add(scroll1)
		
		pan1.setLayout(null); 
		
		add(pan1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);
	}
}


public class C07SwingMain {
	public static void main(String[] args) {
		new C07GUI();
	}
}
