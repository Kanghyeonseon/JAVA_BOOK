package Ch37;

import java.io.FileWriter;
import java.io.Writer;

public class C01WriteExam {
	public static void main(String[] args) {
		try { //Writer를 쓸 때는 반드시 try catch써야함
			Writer out = new FileWriter("c:\\abcd\\test.txt",true);
								//false이면 덮어쓰고 true이면 내용을 추가한다.
			out.write("a\n");
			out.write("b\n");
			out.write("c\n");
			out.write("defyou\n");
			
			out.flush(); //스트림 버퍼 초기화
			out.close(); //스트림 제거
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
