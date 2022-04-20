package Ch08.For2;

import java.util.Scanner;

public class for9 {
	public static void main(String[] args) {
		//n부터 m까지 수 중의 3의배수의 합만 출력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		for(int i=n; i<=m; i++) {
			if(i%3==0) {sum+=i;}
		}
		System.out.println("합계 : " + sum);
		
	}
}
