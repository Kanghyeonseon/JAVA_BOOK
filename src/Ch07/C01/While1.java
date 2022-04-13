package Ch07.C01;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		//n부터 m까지 수의 합을 구합니다.(키보드로 입력받습니다.)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("n부터 m까지 수의 합을 구합니다.\nn과 m을 입력하세요.");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int sum = n;
		int i=n+1;
		
		while(i<=m)
		{
			sum +=i;
			i++;
		}
		System.out.println(n + "부터 " + m + "까지의 합은 : "+sum+"입니다.");
		sc.close();
		
		

		
		
	}
}
