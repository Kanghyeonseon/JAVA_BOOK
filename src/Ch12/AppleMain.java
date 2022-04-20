package Ch12;


public class Seller {
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
public class Buyer {
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

