package Ch13;

public class C01Buyer {
	int Mymoney;
	int Cokecount;
	
	C01Buyer(int mymoney, int cokecount) {
		this.Mymoney=mymoney;this.Cokecount=cokecount;
	}
	
	public void Pay(C02Seller seller, int mymoney) {
		Mymoney-=mymoney;
		int cnt = seller.Recieve(mymoney);
		Cokecount+=cnt;
	}
	void Showinfo() {
		System.out.println("남은 돈 = " + Mymoney);
		System.out.println("총 콜라 개수 = " + Cokecount);
	}
	

}
