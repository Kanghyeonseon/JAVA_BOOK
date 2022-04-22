package Test;

import java.util.Scanner;

class Seller {
	int Mymoney; int AppleCount; int Price;
	Seller(int Mymoney, int AppleCount, int Price) {
		this.Mymoney=Mymoney; this.AppleCount=AppleCount; this.Price=Price;
	}
	int Recieve(int howmuch) {
		Mymoney+=howmuch;		
		int ResultCount=howmuch/Price;
		AppleCount=AppleCount-ResultCount;
		return ResultCount;
	}
	void ShowSellerInfo() {
		System.out.println("판매자돈주머니\t판매자사과주머니");
		System.out.printf("%d\t\t%d",Mymoney,AppleCount);
	}
}
class Buyer {
	int Mymoney; int AppleCount;
	Buyer(int Mymoney, int AppleCount) {
		this.Mymoney=Mymoney; this.AppleCount=AppleCount;
	}
	void Pay(Seller seller, int paymoney) {
		Mymoney-=paymoney;
		AppleCount=AppleCount+seller.Recieve(paymoney);
				
	}
	void ShowBuyerInfo() {
		System.out.println("구매자돈주머니\t구매자사과주머니");
		System.out.printf("%d\t\t%d",Mymoney,AppleCount);
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
		
		홍길동.Pay(사과장수1, m);

		System.out.println("---------판매자--------");
		사과장수1.ShowSellerInfo();
		System.out.println();
		System.out.println("---------구매자--------");
		홍길동.ShowBuyerInfo();
	}
	
}