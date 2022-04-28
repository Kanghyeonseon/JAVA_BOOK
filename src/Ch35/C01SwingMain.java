package Ch35;
import javax.swing.JFrame;
public class C01SwingMain {
	public static void main(String[] args) {
		JFrame frame = new JFrame("첫번째 프레임제목");	  //프레임창 객체 생성
//		frame.setTitle("첫번째 프레임입니다."); //프레임창 제목
		frame.setBounds(100,100,700,700); //프레임창 위치
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//창을 닫을 때 JFrame에서 기본으로 제공하고있는 상수값대로 실행해라.
		//이대로 실행하면 작업관리자에서 실제 프로세스가종료되고 메모리를 차지하지않는다.
		frame.setVisible(true);			  //프레임창 표시여부		
	}
}
