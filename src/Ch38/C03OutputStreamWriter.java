package Ch38;
import java.io.*;
public class C03OutputStreamWriter {
	public static void main(String[] args) {
		try {
			
			OutputStream out = new FileOutputStream("c:\\abcd\\temp.exe");
						//바이너리파일.
						//나가는 형태가 바이너리형태라서 확장자가 exe를넣어도 상관이 없다
			OutputStreamWriter wout = new OutputStreamWriter(out);
			//Stream : 1바이트단위
			wout.write('가');
			wout.write('나');
			wout.write('다');
			wout.flush();
			
			InputStream in = new FileInputStream("c:\\abcd\\temp.exe");
			InputStreamReader rout = new InputStreamReader(in);
			while(true) {
				int data = rout.read();
				if(data==-1) {
					break;
				}
				System.out.print((char)data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
