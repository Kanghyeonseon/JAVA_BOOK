package Ch05;

import java.util.Scanner;

public class C02Percent {
	public static void main(String[] args) {
		
		//홀짝
		//짝수는 나머지 0, 홀수는 나머지 1
//		System.out.println(10%2==0);
//		System.out.println(11%2);
//		System.out.println(12%2);
//		System.out.println(13%2);
//		System.out.println(14%2);
		
		
		//배수 3의배수는 N%3==0 true
//		System.out.println(10%3==0);
//		System.out.println(11%3==0);
//		System.out.println(12%3==0);
//		System.out.println(13%3);
//		System.out.println(14%3);
//		System.out.println(15%3);
//		System.out.println(16%3);
//		System.out.println(17%3);
		
		//미니문제
		//키보드로 부터 정수값 2를 입력받아
		//두 수의 합이 짝수이면 "짝수입니다."
		//홀수이면 "홀수입니다."를 출력하세요
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 2개를 입력하세요");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
////		if((num1+num2)%2==0) {
////			System.out.println("짝수입니다");
////		} else System.out.println("홀수입니다.");
//		
//		int sum = num1 + num2;
//		String result = ( sum%2 ==0 ) ? "짝수입니다." : "홀수입니다.";
//		System.out.println(result);
		
		//범위제한
		
//		Scanner sc = new Scanner(System.in);
//		double tmp=0;
//		while (true)
//		{
//			System.out.print("값 입력 :");
//			tmp = sc.nextDouble();
//			System.out.println("값 확인 : " + (tmp % 10));
//		}
		
		
		
		//자리수 추출
		
//		System.out.println(0b1010110);
//		System.out.println(12345%100);
//		System.out.println(12345%1000);
//		System.out.println(12345%10000);
//		System.out.println(12345%100000);
//		System.out.println();
//		System.out.println(12345/10000);
//		System.out.println(12345/1000);
//		System.out.println(12345/100);
//		System.out.println(12345/10);
		
		int i = 0;
		int num = 123456;
		for (i=1;i<=10000;i*=10) {
			System.out.print(num%(i*10)/i);
			}
//		
//		System.out.println();
//		System.out.println(num%(10^1));
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
