package Ch08.For2;

import java.util.Scanner;

public class for7 {
	public static void main(String[] args) {
		//1부터 n까지 수 중의 3의배수의 합만 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 수 중 3의배수의 합만 출력합니다.\nn을 입력하세요.");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if (i%3==0) {
				sum+=i;
			}
		}
		System.out.println("합계 :" + sum);
		
	}
}
