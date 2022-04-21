package Test;

import java.util.Scanner;

class Seller {
	int mymoney; int cnt; int price;
	Seller(int mymoney, int cnt, int price) {
		this.mymoney=mymoney; this.cnt=cnt; this.price=price;
	}
	int Recieve(int howmuch) {
		mymoney+=howmuch;
		int resultcnt = howmuch/price;
		cnt-=resultcnt;
		return resultcnt;
	}
	void ShowSellerInfo() {
		System.out.println("보유금액\t사과개수");
		System.out.printf("%d\t%d",mymoney,cnt);
	}
}
class Buyer {
	int mymoney; int cnt;
	
	Buyer(int mymoney, int cnt) {
		this.mymoney=mymoney; this.cnt=cnt;
	}
	void pay(Seller RefVar, int paymoney) {
		mymoney-=paymoney;
		int resultcnt = RefVar.Recieve(paymoney);
		cnt+=resultcnt;
	}
	void ShowBuyerInfo() {
		System.out.println("보유금액\t사과개수");
		System.out.printf("%d\t%d",mymoney,cnt);
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
		사과장수1.ShowSellerInfo();
		System.out.println();
		System.out.println("---------구매자--------");
		홍길동.ShowBuyerInfo();
	}
	
}