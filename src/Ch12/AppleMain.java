package Ch12;

import java.util.Scanner;

class Seller {
	//속성
	int Mymoney;
	int Applecnt;
	int Price;	
	
	//생성자
	public Seller(int mymoney, int applecnt, int price) {
		Mymoney = mymoney;
		Applecnt = applecnt;
		this.Price=price;
	}
		
	//기능
	//Recieve 
	int Recieve(int eee) {
		Mymoney += eee;
		int cnt = eee/Price;
		Applecnt-=cnt;
		return cnt;
	}
	
	void ShowInfo() {
		System.out.println("보유 금액 : " + Mymoney);
		System.out.println("사과 개수 : " + Applecnt);
	}
		
	
}
class Buyer {
	//속성
	int Mymoney;
	int Applecnt;
	
	//생성자
	Buyer(int money, int cnt) {
		this.Mymoney = money; this.Applecnt=cnt;
	}

	//기능
	void pay(Seller seller, int b) {
		Mymoney-=b;
		int cnt=seller.Recieve(b); //판매자에게 돈을 전달하는 행위.
									   //return값을 전달.
		Applecnt+=cnt;
	}
	
	void ShowInfo() {
		System.out.println("보유 금액 : " + Mymoney);
		System.out.println("사과 개수 : " + Applecnt);
	}
	
	
	
}


public class AppleMain {
	public static void main(String[] args) {
		Seller 사과장수1 = new Seller(100000,100,1000);
								//보유금액, 사과개수, 사과금액
		Buyer 홍길동 = new Buyer(10000,0);
		Buyer 정우균 = new Buyer(10000, 0);
		Buyer 이준영 = new Buyer(10000, 0);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("홍길동의 사과가격을 입력하세요.");
		int m = sc.nextInt();
		
		홍길동.pay(사과장수1, m);
		정우균.pay(사과장수1, 5000);
		이준영.pay(사과장수1, 1000);
		System.out.println("---------판매자--------");
		사과장수1.ShowInfo();
		System.out.println();
		System.out.println("---------구매자--------");
		홍길동.ShowInfo();
		System.out.println();
		정우균.ShowInfo();
		System.out.println();
		이준영.ShowInfo();
	
	}
	
	
}

