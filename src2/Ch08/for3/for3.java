package Ch08.for3;

import java.util.Scanner;

public class for3 {

	public static void main(String[] args) {
		//단수를 입력받아(dan) dan-9단까지 출력합니다
		//조건 : dan안의 숫자는 9미만이어야 합니다
		
		// 전체구구단(가로)
		// 2 x 1 = 2 	3 x 1 = 3		... 	9 x 1 = 9
		// 2 x 2 = 4	3 x 2 = 6		...		9 x 2 = 18
		// ..
		// 2 x 9 = 18	3 x 9 = 27				9 x 9 = 81
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		for(int i = 2; i <=dan;i++) {
			System.out.printf("");
		}
		
		
	}

}
