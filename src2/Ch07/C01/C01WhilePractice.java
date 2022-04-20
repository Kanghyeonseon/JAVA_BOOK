package Ch07.C01;

import java.util.Scanner;

public class C01WhilePractice {

	public static void main(String[] args) {
		//1부터 N까지(키보드로 입력받습니다.)의 합을 구합니다.

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 몇 까지의 합을 구할까요?");
		int n = sc.nextInt();
		
		int i=0;
		int sum = 0;
		
		while(i<=n)
		{
			sum+=i;
			i++;
		}
		System.out.println("1부터 " + n + " 까지의 합 : " + sum);
		sc.close();
		
	}

}
