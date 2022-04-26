package Ch99;
class Seller {
	private int MyMoney;
	private int AppleCnt;
	private int Price;
	Seller(int Mymoney, int Applecnt, int Price) {
		this.MyMoney=Mymoney; this.AppleCnt=Applecnt;this.Price=Price;
	}
	int Recieve(int money) {
		MyMoney+=money;
		int ResultCnt = money/Price;
		AppleCnt-=ResultCnt;
		return ResultCnt;		
	}
	void ShowInfo() {
		System.out.println("보유금액 : " + MyMoney );
		System.out.println("사과개수 : " + AppleCnt);
		System.out.println("개당가격 : " + Price);
	}
	
}
class Buyer {
	private int MyMoney;
	private int AppleCnt;
	Buyer(int MyMoney, int AppleCnt) {
		this.MyMoney=MyMoney; this.AppleCnt=AppleCnt;
	}
	void Payment(Seller seller01,int money) {
		MyMoney-=money;
		AppleCnt+=seller01.Recieve(money);
	}
	void ShowInfo() {
		System.out.println("보유금액 : " + MyMoney );
		System.out.println("사과개수 : " + AppleCnt);
	}
}
public class test {
	public static void main(String[] args) {
		Seller 사과장수1 = new Seller(100000, 100, 1000);
		Buyer buyer01 = new Buyer(10000,0);
		Buyer buyer02 = new Buyer(20000,0);
		Buyer buyer03 = new Buyer(30000,0);

		buyer01.Payment(사과장수1,2000);
		buyer02.Payment(사과장수1,5000);
		buyer03.Payment(사과장수1,3000);

		System.out.println("---판매자 정보---");
		사과장수1.ShowInfo();
		System.out.println("---구매자 정보---");
		buyer01.ShowInfo();
		buyer02.ShowInfo();
		buyer03.ShowInfo();

	}
}
