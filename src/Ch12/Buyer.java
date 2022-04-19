package Ch12;

public class Buyer {
	//속성
	int Mymoney;
	int Applecnt;
	
	//생성자
	Buyer(int money, int cnt) {
		this.Mymoney = money; this.Applecnt=cnt;
	}
	
	//기능
	void pay(Seller seller, int money) {
		Mymoney-=money;
		int cnt=seller.Recieve(money); //판매자에게 돈을 전달하는 행위.
									   //return값을 전달.
		Applecnt+=cnt;
	}
	
	void ShowInfo() {
		System.out.println("보유 금액 : " + Mymoney);
		System.out.println("사과 개수 : " + Applecnt);
	}
	
	
	
}
