package Ch13;

public class C02Seller {
	int Mymoney;
	int Cokecount;
	int Cokeprice;
	
	C02Seller(int mymoney, int cokecount, int cokeprice) {
		this.Mymoney=mymoney;
		this.Cokecount=cokecount;
		this.Cokeprice=cokeprice;
	}
	
	int Recieve(int mymoney) {
		Mymoney+=mymoney;
		int cnt=mymoney/Cokeprice;
		Cokecount-=cnt;		
		return cnt;
	}

	public void Showinfo() {
		System.out.println("판매자가 가지고있는 돈:"+Mymoney);
		System.out.println("남은 콜라 개수:" +Cokecount);
	}
	
	
}
