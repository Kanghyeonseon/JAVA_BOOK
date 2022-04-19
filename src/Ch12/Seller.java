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
	int Recieve(int money) {
		Mymoney += money;
		int cnt = money/Price;
		Applecnt-=cnt;
		return cnt;
	}
	
	void ShowInfo() {
		System.out.println("보유 금액 : " + Mymoney);
		System.out.println("사과 개수 : " + Applecnt);
	}
	
	
	
}
