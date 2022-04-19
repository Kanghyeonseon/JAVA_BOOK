package One;

import java.util.Scanner;

public class BarMain {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------- B A R -------");
		System.out.println("1 맥주");
		System.out.println("2 소주");
		System.out.println("3 양주");
		System.out.println("4 소맥");
		System.out.println("------- B A R -------");
		System.out.print("주문번호 입력 : ");
		int menunum=sc.nextInt();
		System.out.printf("주문 개수 입력 : ");
		int ea = sc.nextInt();
		System.out.println("낼 돈 입력 : ");
		int origin=sc.nextInt();
		int price = 0;	
		String menuname=null;
		switch(menunum) {
		case 1 : price=3000; menuname="맥주";break;
		case 2 : price=5000;menuname="소주";break;
		case 3 : price=10000;menuname="양주";break;
		default : System.out.println("없는 메뉴를 고르셨습니다.");
		}
		
		int StartMoney=10000;
		
		Bar b1 = new Bar(StartMoney ,menuname, ea);
		BarCustomer 강현선 = new BarCustomer(price, menunum,ea,origin);
				
		강현선.pay(b1,price,ea);		
		
		b1.Showinfo();
		강현선.Showinfo();
		
		
		
		
	}
}
