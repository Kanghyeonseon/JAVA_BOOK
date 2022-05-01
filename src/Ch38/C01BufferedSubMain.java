package Ch38;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class C01BufferedSubMain {
	public static void main(String[] args) {
		try {
			//기본스트림 소요시간
			InputStream in = new FileInputStream("c:\\abcd\\bluehouse.jpg");
			OutputStream out = new FileOutputStream("C:\\abcd\\copy.jpg");
			long time = copyTimer(in, out);
			System.out.println("기본 스트림 복사 시간 " + time);
			
			//보조스트림 추가 후 소요시간 확인
			InputStream in2 = new FileInputStream("c:\\abcd\\bluehouse.jpg");
			OutputStream out2 = new FileOutputStream("C:\\abcd\\copy2.jpg");
			//기본스트림에 보조스트림 추가
			BufferedInputStream bin = new BufferedInputStream(in2);
			BufferedOutputStream bout = new BufferedOutputStream(out2);
			long time2 = copyTimer(bin, bout);
			System.out.println("보조스트림 복사 시간 : " + time2);
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}			
	}
	
	//파일 복사 함수
	public static long copyTimer(InputStream in, OutputStream out) throws IOException {
		long start = System.nanoTime();
		
		//파일 복사
		int data = 0;
		while(true) {
			data = in.read(); //-1 : end
			if(data==-1) {
				break;
			}
			out.write(data);
			out.flush();			
		}		
		long end = System.nanoTime();
		return end-start; //걸린 시간을 리턴한다.		
	}
}
