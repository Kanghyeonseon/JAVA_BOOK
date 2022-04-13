package Ch07.C01;

import java.util.Scanner;

public class While8 {

	public static void main(String[] args) {
		//n부터 m까지의 수 중 3의배수 합만 출력
		System.out.println("n부터 m까지의 수 중 3의배수 합만 출력");
		System.out.println("n과 m을 입력하세요.");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i = n;
		int sum = 0;
		while(i<=m)
		{
			if(i%3==0)
			{
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
