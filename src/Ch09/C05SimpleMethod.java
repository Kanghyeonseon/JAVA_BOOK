package Ch09;

import java.util.Scanner;

class C05Simple {
	//속성
	Scanner sc = new Scanner(System.in);
	
	//기능
	//반환O, 매개변수O
	int sum1(int x, int y) {
		return x + y;
	}
	
	//반환O, 매개변수X 매개변수 없이 반환값을 받기 위해서 Scanner를 추가해줌.
	int sum2() {
		System.out.print("정수 2개 입력 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x + y;
	}
	
	void sum3(int x , int y) {
	//리턴을 하지 않기 때문에 자체적으로 출력을 해야한다.
		System.out.printf("sum3(%d, %d)=%d\n",x,y,x+y);
		
	}
	
	void sum4() {
		System.out.print("1값 입력 : ");
		int x = sc.nextInt();
		System.out.println("2값 입력 : ");
		int y = sc.nextInt();
		System.out.printf("%d + %d = %d\n",x,y,x+y);
	}
	
	
	
	
}
//SubClass를 선언하고
//sub1,sub2,sub3,sub4멤버 메서드를 만들어서 실행합니다.(두 수의 차를 계산하는 함수)
//sub1(int x, int y) : int
//sub2() : void
//sub3(int x, int y) : void
//sub4 : int 
public class C05SimpleMethod {
	public static void main(String[] args) {
		C05Simple obj = new C05Simple(); //obj 라는 이름의 객체를 만들었다.
		int result1 = obj.sum1(10,20); //10, 20 : 인자
									  //x, y : 매개변수
		System.out.println(result1);
		
		int result2 = obj.sum2();
		System.out.println("결과 : " + result2);
		
		obj.sum3(11, 22);
		obj.sum4();
		
	}		
}

