package Ch08.For2;

import java.util.Scanner;

public class for8 {
	public static void main(String[] args) {
		//1부터 n까지 수 중의 짝수의 합 / 홀수의 합 따로 구해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 수 중 짝수의 합, 홀수의 합을 따로 구해서 출력합니다.\nn값을 입력하세요.");
		int evensum = 0;
		int oddsum = 0;
		int n = sc.nextInt();
		for(int i =1; i<=n ; i++) {
			if(i%2==0) {
				evensum+=i;
			} else oddsum+=i;
		}
		System.out.println("짝수의 합 : " + evensum);
		System.out.println("홀수의 합 : " + oddsum);
		
	}
}
