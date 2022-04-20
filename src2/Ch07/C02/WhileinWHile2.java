package Ch07.C02;

import java.util.Scanner;

public class WhileinWHile2 {

	public static void main(String[] args) {
		
		//단수를 입력받아(dan)
		//dan-9단까지 출력합니다.
		//조건 : dan은 9미만이어야한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단 부터 출력할까요?");
		int dan = sc.nextInt();
		int i =1;
		int y = 1;
		if(dan>=9) {
			System.out.println("단수를 잘못 입력하셨습니다.");
			
		}else {
			
		while(dan<=9)
		{
			i = 1;
			while(i<=9)
			{
				System.out.printf("%d x %d = %d\n",dan ,i , (y*i));
				
				i++;
			}
			
			System.out.println();
			dan++;
		}		
		sc.close();
		
		}
		
	}

}
