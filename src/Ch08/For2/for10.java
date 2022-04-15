package Ch08.For2;

import java.util.Scanner;

public class for10 {
	public static void main(String[] args) {
		//n부터 m까지 수 중의 짝수의 합 / 홀수의 합 따로 구해서 출력	
		Scanner sc = new Scanner(System.in);
		System.out.println("n부터 m까지의 수 중 짝수의 합과 홀수의 합을 구합니다.");
		System.out.println("");
		System.out.println();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int evensum = 0;
		int oddsum = 0;
		for(int i=n; i<=m; i++) {
			if(i%2==0) {
				evensum+=i;
			} else oddsum +=i;
		}
		System.out.println("짝수의 합" + evensum);
		System.out.println("홀수의 합" + oddsum);
	}
}
