package Ch13;


public class C03Main {

	public static void main(String[] args) {
					
		C02Seller c1 = new C02Seller(5000, 500, 100);
		C01Buyer 강현선 = new C01Buyer(500, 3);
		c1.Showinfo();
		System.out.println();
		
		강현선.Pay(c1, 500);
		
		c1.Showinfo();
		강현선.Showinfo();
		
	}

}
