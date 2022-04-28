package Ch35;

import javax.swing.JFrame;
class C02GUI extends JFrame {
			//JFrame클래스의 기능들을 이 클래스에서 사용할 수 있다.
	public C02GUI() {
		super(); //상위클래스의 디폴트생성자를 호출한다.
		//super("두 번째 프레임입니다."); 해도 상관없다. 생성자 오버로딩이 되어있음.
		setBounds(100,100,500,500);
		setTitle("두 번째 프레임입니다.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);
	}
	
}
public class C02SwingMain {
	public static void main(String[] args) {
		new C02GUI(); //객체생성만 해도 바로 된다. 계속 쓸거면 변수에다 저장시킨다.
		
	}
}
