package One;

public class BarCustomer {
	int Mymoney;
	String Menu;
	int menunum;
	int ea;
	int Change;
	int origin;
	int Total=origin;
	public BarCustomer(int mymoney, int menunum,int ea, int origin) {
		this.Mymoney=mymoney;this.menunum=menunum;this.ea=ea;this.origin=origin;
	}
	
	void pay(Bar bar , int money,int ea) { 
		 
		 Mymoney=money*ea;
//		 Total+=bar.Recieve(origin);
		 Change=origin-money*ea;
	 }
	 
	 void Showinfo() {
		 System.out.println("총 금액 : " + Mymoney);
		 System.out.println("거스름돈 : " + Change);
	 	}
	 }
	
	
	


