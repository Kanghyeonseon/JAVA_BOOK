package Ch08.For2;

import java.util.Scanner;

public class for2 {
	public static void main(String[] args) {
		//n부터 m까지수의 합을 구합니다(n,m은 키보드로 입력받습니다)
		Scanner sc = new Scanner(System.in);
		System.out.println("n부터 m까지의 합을 구합니다 n, m을 입력하세요.");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = 1;
		int sum = 0;
		for(a=n; a<=m; a++) {
			sum+=a;
		}
		System.out.println("합은 " + sum);
	}
}
