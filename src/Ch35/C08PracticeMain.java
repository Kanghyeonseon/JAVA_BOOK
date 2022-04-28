package Ch35;

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

class testGUI extends JFrame implements ActionListener, KeyListener{
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JTextField txt;
	JTextArea area;
	JScrollPane scroll;

	public testGUI() {
		super("Chatting Server");
		setBounds(100,100,500,390);
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);		
		
		//버튼과 필드 생성
		button1 = new JButton("파일로저장");
		button2 = new JButton("1:1요청");
		button3 = new JButton("대화기록보기");
		button4 = new JButton("입력");
		txt = new JTextField("");
		area = new JTextArea();
		scroll = new JScrollPane(area);
		
		button1.setBounds(300, 30, 150, 30);
		button2.setBounds(300, 90, 150, 30);
		button3.setBounds(300, 150, 150, 30);
		button4.setBounds(300, 280, 150, 30);		
		txt.setBounds(30, 280, 240, 30);
		scroll.setBounds(30,30,240,210);
		
		
		
		//컴포넌트를 리스너에 등록
		button4.addActionListener(this);
		txt.addKeyListener(this);
		
		panel.add(button1); panel.add(button2);
		panel.add(button3); panel.add(button4);
		panel.add(scroll);
		panel.add(txt);
		
		//set레이아웃, 패널추가
		panel.setLayout(null);
		add(panel);
		
		setResizable(false);
		
		//메모리, Visible설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
				
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button4) {
			String temp = txt.getText();
			area.append(temp + "\n");
			txt.setText("");
		} 		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==10) {
			String temp = txt.getText();
			area.append(temp + "\n");
			txt.setText("");
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
}
public class C08PracticeMain {
	public static void main(String[] args) {
		new testGUI();
	}
}
