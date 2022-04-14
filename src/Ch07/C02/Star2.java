package Ch07.C02;

public class Star2 {

	public static void main(String[] args) {
		// 높이 : 3
		//   *
		//  ***
		// *****	

		//*******
		// *****
		//  ***
		//   *
		
//		i	j		k		l		m
//		1	1-3		1-1		0		1-7
//		2	1-2		1-3		1		1-5
//		3	1-1		1-5		2		1-3
//							3		1-1
		int high = 3;
		int i = 1;
		int j = 1;
		int k = 1;
		int l = 1;
		int m = 1;
		
		while(i<=3)
		{
			j=high;
			while(j>=i) {
				System.out.print("0");
				j--;
			}
			k=1;
			while(k<=2*i-1)
			{
				System.out.print("*");
				k++;
			}
			
			
			System.out.println();
			i++;
		}
		
		while(l<=high)
		{
			
			System.out.println();
			l++;
		}
		
		
		
		
	}

}
