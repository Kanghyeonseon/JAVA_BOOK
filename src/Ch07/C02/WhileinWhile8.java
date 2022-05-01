package Ch07.C02;

import java.util.Scanner;

public class WhileinWhile8 {
	public static void main(String[] args) {
		// ****
		// ***
		// **
		// *
		
		// 높이 : 3
		// ***
		// **
		// *
		//Star2.에 선생님이 푼게있다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반쪽 역트리 별찍기를 수행합니다.");
		System.out.println("높이를 입력해보세요");
		int high = sc.nextInt();
		int i = 1;
		int j = high;
		
		while (j>=1)
		{
			i=1;
			while(i<=j)
			{
				System.out.print("*");
				i++;
			}			
			System.out.println();
			j--;
		}
		
		
		
	}
}
