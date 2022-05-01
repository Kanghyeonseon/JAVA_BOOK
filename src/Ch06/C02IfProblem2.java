package Ch06;

import java.util.Scanner;

public class C02IfProblem2 {
	public static void main(String[] args) {
		//문제
		//나이별로 요금을 부과하는 else if만드세요
		//8세 미만  : 1000원
		//14세 미만 : 2000원
		//20세 미만 : 2500원
		//20세 이상 : 3000원
		System.out.println("나이를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age<8) {
			System.out.println("요금은 1000원입니다.");
		} else if (age <14) {
			System.out.println("요금은 2000원입니다.");
		} else if (age <20) {
			System.out.println("요금은 2500원입니다.");
		} else {
			System.out.println("요금은 3000원 입니다");
		}
		sc.close();
	}

}
