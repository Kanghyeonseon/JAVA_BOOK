package Ch37;
import java.io.*;
public class C03FileOutputStream {
	public static void main(String[] args) {
		
		try {
			
			OutputStream out = new FileOutputStream("c:\\abcd\\c03test.exe");
			out.write((char) '가'); //byte단위로 받는다. (char)를 해도되고 안해도된다.
			out.write('b');
			out.write('c');
			out.write('d');
			out.flush();
			out.close();
			
		} catch (Exception e) { e.printStackTrace(); }
		
	}
}
