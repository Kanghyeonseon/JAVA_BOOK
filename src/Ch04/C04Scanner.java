package Ch04;

import java.util.Scanner;

public class C04Scanner {

	public static void main(String[] args) {
		//문제
		//이름을 입력하세요? 홍길동 <-이름은 키보드로 입력받습니다.
		//홍길동 님의 나이를 입력하세요? 33 <-나이는 키보드로 입력받습니다, 이름은 서식문자로 출력합니다.
		//홍길동 님의 나이는 33살입니다. <- 서식문자로 이름과 나이를 출력합니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		//System.out.println("이름 : " + name);
		
		System.out.print(name + " 님의 나이를 입력하세요.");
		int age = sc.nextInt();
		//System.out.println("나이 : " + age);
		
		System.out.print(name + " 님의 나이는" + age + " 살입니다.");
		
		
	}

}
