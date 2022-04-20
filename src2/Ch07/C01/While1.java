package Ch07.C01;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		//n부터 m까지 수의 합을 구합니다.(키보드로 입력받습니다.)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("n부터 m까지 수의 합을 구합니다.\nn과 m을 입력하세요.");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		
		if(n>m)				//n에 m보다 큰 수가 들어오면?
		{
			int tmp = n;
			n=m;
			m=tmp;
		}
		
		int i=n;
		
		while(i<=m)
		{
			sum +=i;
			i++;
		}
		System.out.println(n + "부터 " + m + "까지의 합은 : "+sum+"입니다.");
		sc.close();
		
		

		
		
	}
}
