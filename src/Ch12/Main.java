package Ch12;

import java.util.Scanner;

public class Main {

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
