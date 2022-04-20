package Ch07.C01;

import java.util.Scanner;

public class While9 {
	public static void main(String[] args) {
		//n부터 m까지의 수 중 짝수의 합/홀수의 합 따로 구해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("n부터 m까지의 수 중 짝수의합/홀수의합을구한다.");
		System.out.println("n과 m을 입력해라.");
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		int i=n;
		while(i<=m)
		{
			if (i%2==0)
			{
				sum1+=i;
				i++;
			}
			else
			{
				sum2+=i;
				i++;
			}
		}
		System.out.println("짝수의 합 : " + sum1);
		System.out.println("홀수의 합 : " + sum2);
	}
}
