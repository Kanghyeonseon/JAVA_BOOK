package Ch18;

import java.util.Scanner;

class Book {
	String BookCode;
	String Bookname;
	String Publisher;
	String Amount;
	Book(String BookCode, String Bookname, String Publisher, String Amount) {
		this.BookCode=BookCode;this.Bookname=Bookname;
		this.Publisher=Publisher;this.Amount=Amount;
	}
}


public class C02ClassArrayMain {
	public static void main(String[] args) {
		//배열만들것
		Scanner sc = new Scanner(System.in);
		int num = 0;		
		Book[] list = new Book[4];
		int i=0; //while문 바깥에다가 i를 넣어야한다.
		while(true) {
			System.out.println("---------BOOKStore---------");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 검색");
			System.out.println("3. 전체 도서 확인");
			System.out.println("4. 종료");
			System.out.println("---------BOOKStore---------");
			System.out.printf("번호 : ");
			num = sc.nextInt();
			
			
			switch(num)
			{
			
			case 1 : //도서등록
				if (i<list.length) {
					//인덱스가 정해준 배열의 길이보다 작아야 등록가능
				System.out.printf("코드/이름/출판사/권수 를 차례로 입력하세요.");
				String A = sc.next(); String B = sc.next(); 
				String C = sc.next(); String D = sc.next();	
				list[i] = new Book(A,B,C,D);
				i++;
				} else System.out.println("더 이상 등록 할 수 없습니다.");

				break;
			case 2 : //도서검색			
				System.out.printf("검색 할 단어를 입력하세요.");
				String E = sc.next();
				for(int j=0;j<i;j++) {
					if(list[j].Bookname.equals(E)) {
						System.out.println("코드\t제목\t출판사\t권수");
						System.out.printf("%s\t%s\t%s\t%s\n",
								list[j].BookCode, list[j].Bookname,
								list[j].Publisher, list[j].Amount);
					}
				}
				break;
			case 3 : //전체도서출력
				System.out.println("코드\t제목\t출판사\t권수");
				for(int j=0;j<i;j++) {
				System.out.printf("%s\t%s\t%s\t%s\n",list[j].BookCode
						,list[j].Bookname,list[j].Publisher,
						list[j].Amount);
				}
				break;
			case 4 : 
				System.exit(-1);
				break;
				
			}
			
			
		}
		
		
	}
}
