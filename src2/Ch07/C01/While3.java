package Ch07.C01;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단을 출력할까요?");

		int n = sc.nextInt();
		int i = 1;
		int product=0;
		
		while(i<=9)
		{
			product = n *i;
			System.out.println(n +"*" + i+ "="+ product);
			i++;
		}
		
		
	}
}
