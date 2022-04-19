package One;

public class BarCustomer {
	int Mymoney;
	String Menu;
	String menuname;
	BarCustomer(int mymoney, String menu) {
		this.Mymoney=mymoney;this.Menu=menu;
	}
	

	 void pay(int mymoney) { 
		 Mymoney=mymoney;

		 }
	 
	 void Showinfo() {
		 System.out.println("손님이 낼 금액 : " + Mymoney);

	 }
	 }
	
	
	


