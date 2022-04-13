package Ch07.C01;

import java.util.Scanner;

public class While7 {
	public static void main(String[] args) {
		//1부터 N까지의 수 중 짝수의 합, 홀수의 합 따로 구해서 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 N까지의 수 중 짝수의합/홀수의합을구한다.");
		System.out.println("N을 입력해라.");
		
		int N = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		int i=1;
		while(i<=N)
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
