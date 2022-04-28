package Ch37;

import java.io.FileReader;
import java.io.Reader;

public class C01ReaderMain {
	public static void main(String[] args) {
		try {
			Reader in = new FileReader("C:\\abcd\\test.txt");
			
			while(true) {
				int data = in.read(); //연결된 파일로부터 유니코드를 받아온다.	
									  //더이상 읽어올 값이 없으면 -1을 리턴한다
				if(data==-1) {
					break;
					}
				System.out.print((char) data );
			}
		} catch (Exception e) { e.printStackTrace(); }
	}
}

