package Ch38;

import java.io.*;
import java.net.URL;

public class C04URLStreamMain {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.naver.com");
			InputStream in = url.openStream();
			in = new BufferedInputStream(in);
			Reader r = new InputStreamReader(in);
			
			int data;
			while(true) {
				data = r.read();
				if(data==-1) break;
				System.out.print((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
