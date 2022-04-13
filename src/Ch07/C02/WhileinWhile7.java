package Ch07.C02;

public class WhileinWhile7 {

	public static void main(String[] args) {
		// 높이 : 3
		//   *
		//  ***
		// *****	

		//*******
		// *****
		//  ***
		//   *
		int high = 3;
		int a=1;
		int b=1;
		int c=high;


		
		while(j<=c)
		{
			while(c>=j)
			{
				System.out.printf(" ");				
				c--;
			}	
			l=1;
			int m=1;
			while(l<=j)
				{
					System.out.printf("*");

					l++;
				}
			m=1;			
			while(m<=l) {
					System.out.print("*");
					m++;
			}			
			System.out.println();
			j++;
		}
		
		
		
		
		

	}

}
