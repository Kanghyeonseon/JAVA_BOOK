package Ch06;

import java.util.Scanner;

public class C01If {


public static void main(String[] args) {
	//단순 if
	
//		int age =9;
//		
//		if (age>=8) 
//			System.out.println("취학아동입니다.");
//			System.out.println("첫번째 if 벗어남..");
//		
//		if (age<8) 
//			System.out.println("미취학아동입니다.");
//			System.out.println("두 번째 if 벗어남..");
	
	//if-else문
//		int age =9;		
//		if (age>=8) 
//			System.out.println("취학아동입니다.");
//		else 
//			System.out.println("미취학아동입니다.");
	
	
	//정수 3개의 값을 입력받아
	//입력받은 수의 모든 합이 가 짝수이면 "N은짝수입니다."
	//
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 3 개를 입력하세요.");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		int sum = num1 + num2 + num3;
//		if (sum%2==0) {
//			System.out.println(sum + "은/는 짝수입니다.");
//		} else {
//			System.out.println(sum + "은/는 홀수입니다.");
//		}
//		sc.close();
	
	
	//중첩 if문
	//짝수이면서 3의배수 -> 출력
	//홀수이면서 5의배수 -> 출력
//		int n =0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		n = sc.nextInt();
//		
//		if(n%2==0)
//		{
//			if(n%3==0) 
//			{
//				System.out.println(n + " 은 짝수 이면서 3의배수입니다.");
//			}
//		}
//		else
//		{
//			if(n%5==0) 
//			{
//				System.out.println(n + " 은 홀수이면서 5의배수입니다.");
//			}
//		}
//		System.out.println("프로그램을 종료합니다.");
//		
//		
//		
//		
//		sc.close();
	
	
	//문제
	//위 코드를 and연산자 기호를 써서 바꿔보세요
//		int n =0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		n = sc.nextInt();		
//		if(n%2==0&&n%3==0)
//		{
//			System.out.println(n + " 은 짝수 이면서 3의배수입니다.");
//		}
//		else if((!(n%2==0))&&n%5==0)
//		{
//			System.out.println(n + " 은 홀수이면서 5의배수입니다.");
//		}
//		System.out.println("시스템을 종료합니다.");
	
	
	//두 수를 입력받아 큰 수를 출력하세요.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("두 수를 입력하세요.");
//		int a =0; int b=0;
//		
//		a = sc.nextInt();
//		b = sc.nextInt();
//		if(a>b) {
//			System.out.println(a);
//		}	else System.out.println(b);
	
	
	
	
	//세 수를 입력받아 큰 수를 출력하세요.
	Scanner sc = new Scanner(System.in);
	System.out.println("세 수를 입력하세요.");
	int a =0; int b=0; int c = 0;
	
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	
//	if(a>b) {
//		if(a>c) {
//			System.out.println(a);
//		}
//		else System.out.println(a); 
//			//a와 c가 같은 경우 때문에 넣어줌
//	}
//	else {
//		if (b>c) {
//			System.out.println(b);
//		}
//		else {	
//			System.out.println(c);
//		}
//	}
	
	//int max = a;
	if(a>=b&&a>=c)
	{
		System.out.println(a);
	}
	else if (b>=a&&b>=c)
	{
		System.out.println(b);
	}
	else if (c>=a&&c>=b)
	{
		System.out.println(c);
	}
	
	
}
}


		
	
	
	
	
		
			
			 
					
			
	
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


