package Ch07.C02;

import java.util.Scanner;

public class WhileinWhile10 {

	public static void main(String[] args) {
		//******* 
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//******* 
		Scanner sc = new Scanner(System.in);
		System.out.println("모래시계 찍기를 수행합니다.");
		System.out.println("높이를 입력하세요");
		int i = 0;
		int j = 0;
		int k = 0;
		int high = sc.nextInt();
		while(i<=high)
		{
			j=0;
			while(j<=i-1)
			{
				System.out.print(" ");
				j++;
			}
			k=0;
			while(k<=2*high-2*i)
			{
				System.out.print("*");
				k++;				
			}			
				
			System.out.println();
			i++;
		}

		while(i<=2*high)
		{
			j=0;
			while(j<=2*high-i-1)
			{
				System.out.print(" ");
				j++;
			}
			k=0;
			while(k<=2*(i-high))
			{
				System.out.print("*");
				k++;
			}
			
			System.out.println();
			i++;
		}
		

	}

}
