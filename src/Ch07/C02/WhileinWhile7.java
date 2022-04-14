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
		int i=high;
		int l =1;
		int j = 1;
		
		
		while(j<=high)
		{
			i=high;
			while(i>=j)
			{
				System.out.printf(" ");				
				i--;
			}			
			l=1;
			while(l<=2*j-1)
				{
					System.out.printf("*");
					l++;
				}	
						
			System.out.println();
			j++;
		}
		
		
		
		System.out.println();
		
		int k=1;		
		while(k<=high+1) {
			
			i=2;
			while(i<=k)
			{
				System.out.printf(" ");				
				i++;
			}	

			
			l=high+1;
			
			while(l>=2*k-4)
				{
					System.out.printf("*");
					l--;
				}	
						
			System.out.println();
						
			
			
			k++;
		}
		
		
		
		

	}

}
