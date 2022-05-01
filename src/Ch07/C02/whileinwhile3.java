package Ch07.C02;

import java.util.Scanner;

public class whileinwhile3 {
	public static void main(String[] args) {
		//전체 구구단을 역순출력합니다.
		//9x9=81
		//9x8=72
		//...
		//2x1=2
		//단수를 입력받아 dan-9단까지 출력합니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단 까지 출력할까요?");
		int dan = sc.nextInt();
		int i =9;
		int y = 9;
		while(y>=dan)
		{
			i = 9;
			while(i>=1)
			{
				System.out.printf("%d x %d = %d\n", y, i, (y*i));
				
				i--;
			}
			System.out.println();
			y--;
		}		
		sc.close();
		
		
	}
}
