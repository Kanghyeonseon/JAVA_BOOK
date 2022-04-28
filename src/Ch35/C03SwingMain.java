package Ch35;

import java.awt.Color;

import javax.swing.*;

//패널
class C03GUI extends JFrame{

	public C03GUI() {
		super();
		setBounds(100,100,500,500);
		setTitle("세번째 프레임입니다.");
		
		//패널 추가
		JPanel pan1 = new JPanel();
		
		//배경색 지정
		Color col = new Color(100,50,100); 
		//Color 클래스로 0-255까지의 숫자로 표현가능
		pan1.setBackground(col);
		
		
		//패널을 프레임에 추가
		add(pan1);
		//add는 JFrame으로부터 물려받은 함수
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);
	}
	
}
public class C03SwingMain {
	public static void main(String[] args) {
		new C03GUI();;
	}
}
