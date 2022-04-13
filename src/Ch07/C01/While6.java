package Ch07.C01;

import java.util.Scanner;

public class While6 {
	public static void main(String[] args) {
		//1부터 N까지의 수 중 3의배수의 합만 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 N까지의 수 중 3의배수 합만 출력합니다.");
		System.out.println("N을 입력하세요.");
		int N = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i<=N)
		{
			if(i%3==0)
			{
				sum = sum+i;
			}
			i++;
		}
		System.out.println("1부터 N까지의 수 중 3의배수 합은 :" + sum);
		
		
		
		
	}
}
