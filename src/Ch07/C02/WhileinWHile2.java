package Ch07.C02;

import java.util.Scanner;

public class WhileinWHile2 {

	public static void main(String[] args) {
		//전체 구구단을 역순 출력합니다.
		//9 x 1 = 9
		//9 x 2 = 18
		//...
		//2 x 9 = 18
		
		//단수를 입력받아(dan)
		//dan-9단까지 출력합니다.
		//조건 : dan은 9미만이어야한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단 까지 출력할까요?");
		int dan = sc.nextInt();
		int i =1;
		int y = 9;
		while(y>=dan)
		{
			i = 1;
			while(i<=9)
			{
				System.out.printf("%d x %d = %d\n", y, i, (y*i));
				
				i++;
			}
			System.out.println();
			y--;
		}		
		sc.close();
		
		
		
	}

}
