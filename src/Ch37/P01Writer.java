package Ch37;

import java.io.FileWriter;
import java.io.Writer;

public class P01Writer {
		public static void main(String[] args) {
			try {
				Writer out = new FileWriter("c:\\abcd\\환상게임.txt");
				out.write("날아오르라 주작이여"
						+ " 환상의 날개 날아오르라"
						+ " 묻혀있던 전설이 깨어나"
						+ " 진실이 되어 눈앞에 펼쳐질때"
						+ " 아련히 울리는 워아이니"
						+ " ~~~~ "
						+ " 다른하나의 세계"
						+ " 소중한 나의 연인을 위하여 지금 무엇을 나는 할 수 있을까");
				
				out.flush();
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
