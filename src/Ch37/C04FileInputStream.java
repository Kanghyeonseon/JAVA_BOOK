package Ch37;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C04FileInputStream {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("c:\\abcd\\c03test.exe");
			
			while(true) {
				int data = in.read();
				if(data == -1) { break; }
				System.out.println((char) data);
				//2바이트를 이상의 데이터는 깨진다(영문자같은경우에는 1바이트면 저장하기 충분하다.)
				//1바이트씩 짤리기때문에 데이터가 깨진다.
				//'가'를 저장하려면 44032 -> 010101101 00001110
				//'나'를 저장하려면 45796 -> 010110010 11100100
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
