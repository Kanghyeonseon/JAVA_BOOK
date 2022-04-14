package Ch07.C02;

import java.util.Scanner;

public class WhileInWhile9 {

	public static void main(String[] args) {
		// 높이 : 3
		//   *
		//  ***
		// *****	

		//*******
		// *****
		//  ***
		//   *
		Scanner sc = new Scanner(System.in);
		System.out.print("다이아몬드 트리를 출력합니다.\n높이를 입력하세요.");
		
		int high = sc.nextInt();
		int i = 1;
		int j = 1;
		int k = 1;
		int l = 1;
		int m = 1;
		
		while (i<=high)
		{
			
			//선생님이랑 크게 다르지 않은데 여기가 다르다. 
			//j++, j<=high-i 이런식으로 처리하셨음.
			j=high;
			while(j>=i)
			{
				System.out.print(" ");
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
		
		System.out.println();
		
		i = 1;
		while(i<=high+1)
			{
				//여기서부터가 정말 어려웠다.
				l=1;				
				while(l<=i-1) //i까지가 아니고 i-1까지 반복 그래야 첫 번째 개행하기 전에 공백이 출력되지 않는다.
				{
					System.out.print(" ");
					l++;
				}
				
				m=high*2 +1;
				while(m>=2*i-1)
				{
					System.out.print("*");
					m--;
				}
				
				
				System.out.println();
				i++;
			}
		
		
	}

}
