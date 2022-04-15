package Ch08.For2;

import java.util.Scanner;

public class for1 {
	public static void main(String[] args) {
		//문제
		//1부터 n(키보드로 입력받습니다)까지의 합을 구합니다	
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		int sum = 0;
		int n = sc.nextInt();
		for(int a=1; a<=n; a++) {
			sum+=a;
		}
		System.out.println(sum);
	}
}
