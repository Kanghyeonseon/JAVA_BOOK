package Ch07.C02;

public class WhileinWHile6 {

	public static void main(String[] args) {
		// 높이 : 3
		// ***
		// **
		// *

		//   *
		//  ***
		// *****
		//*******

		int high = 3;
		int j = high;
		int k=1;
		while(j>=1) 
		{
			k=1;
			while(k<=j)
			{
				System.out.print("*");
				k++;
			}
			System.out.println("");
			j--;				
		}
		System.out.println();
		
		
		
		
		
		int i=high;
		int l =1;
		
		
		
		
		while(j<=high)
		{
			i=high;
			while(i>=j)
			{
				System.out.printf(" ");				
				i--;
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
