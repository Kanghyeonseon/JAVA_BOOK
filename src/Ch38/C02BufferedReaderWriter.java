package Ch38;
import java.io.*;

import javax.xml.crypto.Data;
public class C02BufferedReaderWriter {
	public static void main(String[] args) {
		try {
			Reader in = new FileReader("c:\\abcd\\Dialog.txt"); //기본스트림 연결
			BufferedReader bin = new BufferedReader(in); //보조스트림 연결 -속도증가
			Writer out = new FileWriter("c:\\abcd\\CopyDialog.txt"); //기본스트림연결
			BufferedWriter bout = new BufferedWriter(out);//보조스트림연결 -속도증가
			
			int data;
			while(true) {
				data = bin.read();
				if(data==-1) break;
				System.out.print((char)data);
				bout.write(data);
				bout.flush(); //꼭 넣어줘야한다!!
			}			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
