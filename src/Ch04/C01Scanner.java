package Ch04;

import java.util.Scanner;

public class C01Scanner {

	public static void main(String[] args) {

//		System.in : 표준입력 스트림 요청(ex.키보드)
//		System.out : 표준출력 스트림 요청(ex.모니터)
//		new Scanner() : 표준입력 스트림과 연결된 객체를 생성
//		Scanner sc : 스캐너 장치의 위치정보를 저장할 용도의 참조변수
		
		
		
		Scanner sc = new Scanner(System.in); 
		//위치정보를 sc에 넣겠다.     //스캐너에 표준입력스트림을 연결하겠다.
		
		
		//new Scanner(System.in)
		//->키보드와 
		System.out.print("정수 3개 입력 : ");
		int num1 = sc.nextInt(); //키보드로 무언가를 입력하면 정수값 하나를 받아와서 num1에 넣어준다.
		int num2 = sc.nextInt(); //띄어쓰기 or 엔터를 기준으로 다음 값을 입력한다.
		int num3 = sc.nextInt();
		int sum = num1 + num2 + num3;
		System.out.println("Sum : " + sum);
		
		
		sc.close();
		
		
	}

}
