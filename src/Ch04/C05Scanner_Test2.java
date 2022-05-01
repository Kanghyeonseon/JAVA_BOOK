package Ch04;

import java.util.Scanner;

public class C05Scanner_Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("[필수 정보 입력]\n1. 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("2. 주민번호 6자리 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("3. 전화번호 : ");
		String phone = sc.nextLine();
		
		
		System.out.print("[입력한 내용]\n");
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + num);
		System.out.println("PH : " + phone);
		
		
	}

}
