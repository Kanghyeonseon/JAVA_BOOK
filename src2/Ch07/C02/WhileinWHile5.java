package Ch07.C02;

public class WhileinWHile5 {
	public static void main(String[] args) {
		// 높이 : 3
		// *
		// **
		// ***

		// ****
		// ***
		// **
		// *
		int high = 3;
		//int i = 1;
		int j = 1;
		int k = 1;
		while(j<=high)
		{
			k=1;
			while(k<=j)
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
			j++;
		}		
		System.out.println();
		
		while(j>=1) 
		{
			k=1;
			while(k<=j)
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
			j--;				
		}
		
		
		}
	}

			
		

			
		
	

