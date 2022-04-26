package Ch30;

import java.util.Scanner;

public class C02ArthMethicExceptionMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//무한으로 값을 받아낸다.
		
		
		while(true) {
			try {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			System.out.print("나눌 수 입력 : ");
			int div = sc.nextInt();
			System.out.printf("결과 : " + num/div);
										//여기 double로 형변환하면 예외처리가 자동으로 들어가있다.
			System.out.println();
			System.out.println("예외발생과무관");

			} catch (ArithmeticException e) {
				e.printStackTrace();
			} finally {
			}
		}
	}
}
