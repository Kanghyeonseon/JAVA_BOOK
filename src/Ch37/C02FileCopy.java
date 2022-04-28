package Ch37;
import java.io.*;
public class C02FileCopy {
	public static void main(String[] args) {
		
		try {
			Reader in = new FileReader("c:\\abcd\\Original.txt");
			Writer out = new FileWriter("c:\\abcd\\CopyFIle.txt");
			
			//읽을 떄 사용하는 버퍼 공간
			char buffer[] = new char[100]; 
					//를 버퍼사이즈로 받는다. //8k바이트 정도 크기로 받는다고 지정.
			while(true) {
				int num = in.read(buffer);
				
				if(num == -1) { 
					System.out.println("받은 문자 개수 : " + num);
					break; 
					}
				out.write(buffer);
				out.flush(); //버퍼공간을 비워줘야한다.
				System.out.println("받은 문자 개수 : " + num);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
