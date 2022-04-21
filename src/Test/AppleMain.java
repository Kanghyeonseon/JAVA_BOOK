package Test;

import java.util.Scanner;

class Seller {
	int mymoney; int applecount; int price;
	Seller(int mymoney, int applecount, int price) {
		this.mymoney=mymoney;this.applecount=applecount
				;this.price=price;
	}
	int Recieve(int howmuch) {
		mymoney+=howmuch;
		int cnt = howmuch/price;
		applecount-=cnt;
		return cnt;
	}
	void ShowInfo() {
		System.out.println("보유 금액 : " + mymoney);
		System.out.println("사과 개수 : " + applecount);
	}
	
}
class Buyer {
	int money; int applecnt;
	Buyer(int money, int cnt) {
		this.money=money;applecnt=cnt;
	}
	void pay(Seller seller,int paymoney) {
		money-=paymoney;
		int cnt=seller.Recieve(paymoney);
		applecnt+=cnt;
	}
	void ShowInfo() {
		System.out.println("보유 금액 : " + money);
		System.out.println("사과 개수 : " + applecnt);
	}
}



public class AppleMain {
	public static void main(String[] args) {
		Seller 사과장수1 = new Seller(100000,100,1000);
								//보유금액, 사과개수, 사과금액
		Buyer 홍길동 = new Buyer(10000,0);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("홍길동의 사과가격을 입력하세요.");
		int m = sc.nextInt();
		
		홍길동.pay(사과장수1, m);

		System.out.println("---------판매자--------");
		사과장수1.ShowInfo();
		System.out.println();
		System.out.println("---------구매자--------");
		홍길동.ShowInfo();
	}
	
	
}

