package Ch13Problem;

public class Bar {
	int Mymoney;
	String Menu;
	int change=0;
	int TotalPrice
	
	Bar (int mymoney, String menu, int totalprice){
		this.Mymoney=mymoney;this.Menu=menu;this.TotalPrice=totalprice;
	}
	
	void Recieve(int mymoney, int price, int count) {
		Mymoney+=mymoney;		
		int TotalPrice = count * price;
		change =Mymoney- TotalPrice;

		
	}
	void Showinfo() {
		System.out.println("Bar사장돈 : "+ Mymoney);		
		System.out.println("총 가격 : " + TotalPrice);
		System.out.println("거스름돈 : " + change);
		}
	}
	
	

	

