package Ch13Problem;

import java.util.Scanner;

public class BarMain {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("주종을 고르세요.\n1.맥주\n2.소주\n3.양주");
		String menuname=sc.nextLine();
		int price = 0;	
		System.out.println("개수를 고르세요.");
		int count = sc.nextInt();
		
		switch(menuname) {
		case "소주" : price=3000; System.out.println(price);break;
		case "맥주" : price=5000;System.out.println(price);break;
		case "양주" : price=10000;System.out.println(price);break;
		default : System.out.println("없는 메뉴를 고르셨습니다.");
		}
		int StartMoney=2000;
		
		Bar b1 = new Bar(StartMoney ,menuname,totalprice);
		BarCustomer 강현선 = new BarCustomer(price, menuname);
		
		b1.Recieve(price, price, count);		
		강현선.pay(price);
		
		
		
		b1.Showinfo();
		강현선.Showinfo();
		
		
		
		
	}
}
