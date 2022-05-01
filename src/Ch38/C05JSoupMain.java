package Ch38;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class C05JSoupMain {
	public static void main(String[] args) {
		try {
			//url과 연결된 JSoup 객체 생성
			Connection conn = Jsoup.connect("https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=101");
			//https:// 프로토콜도 적어줘야한다.
			
			//해당 URL의 모든 소스를 DOM객체에 저장
			URL url = new URL("https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=101");
			
			Document document = conn.get();
			//Document를 쓰기 위해서 org.jsoup이 import되어있어야한다.
			//결과적으로 document에 url의 정보가 담기게 된다.
			System.out.println(document);
			
			//DOM객체 안에서 img태그를 가지는 요소만 추출
			Elements elements = document.getElementsByTag("img");
			//elements에 이미지의 주소 정보가 담기게된다.			
			
			for(int i=0; i<elements.size();i++) {
				
				if(elements.get(i).toString().contains("http")) {
				
				//!!!!!!!!!!url추출
				//공백 " "을 기준으로 요소 안의 내용을 문자열로 바꾼 뒤 잘라낸다.
				String str[] = elements.get(i).toString().split(" ");
												//toString으로안하면안된다!!!!
//				System.out.println("1번째 : " + str[1]); //확인했더니 url은 1번인덱스가 들고있다.
				int BeginIdx = str[1].indexOf("\"");
				System.out.println(str[1].substring(BeginIdx+1, str[1].length()-1));
				
				//http시작으로 하는 URL을 추출해서 tmp에 담는다.
				String tmp = str[1].substring(BeginIdx+1, str[1].length()-1);
												//큰따옴표를 제거하기위해 +1, -1해줬다.
				
				//!!!!!!!!!!url연결
				url = new URL(tmp.toString());
							//toString안하면 컴파일에러뜸
				InputStream in = url.openStream();
				BufferedInputStream bin = new BufferedInputStream(in);
				String Filename = "Image";				
				OutputStream out = new FileOutputStream("c:\\abcd\\" + Filename + i + ".png");
				int data=0;
				while(true ) {
					data = bin.read();
					if(data==-1) break;
					out.write(data);
					out.flush();
				}				
			}						
			}	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
