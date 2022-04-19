package One;

public class Bar {
	int Mymoney;
	String Menu;
	int Total=0;
	int ea;

	
	Bar (int mymoney, String menu, int ea){
		this.Mymoney=mymoney;this.Menu=menu;this.ea=ea;
	}	
	int Recieve(int price, int ea) {
		Total=price*ea;
		return Total;		
	}
	
	
	void Showinfo() {
		System.out.println("Bar사장돈 : "+Mymoney);
//		System.out.println("거스름돈 : " + change);
		}


	}
	
	

	

