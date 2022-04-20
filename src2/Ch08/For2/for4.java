package Ch08.For2;

import java.util.Scanner;

public class for4 {
	public static void main(String[] args) {
		//단수를 하나 입력받아서 해당 단수를 출력합니다
		Scanner sc = new Scanner(System.in);
		System.out.println("단수를 입력하세요.");
		int dan = sc.nextInt();		
		for(int a=1 ; a<=9; a++) {
			System.out.printf("%d x %d = %d\n", dan, a, dan*a);
		}
		sc.close();
	}
}
