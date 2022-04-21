package Ch19;

class C05Company {
	int x;int y;int z;
	private static C05Company instance = new C05Company();
							//company주소를 담는 참조변수
							//private : 객체 생성하지 않아도 
							//instance는 공간이 만들어져있다.
	private C05Company () {} //외부에서 쓸 수 없는 디폴트생성자
							//외부에서는 객체 만들 수 없다.

	public static C05Company getInstance() {
							//
		if(instance==null)
			instance = new C05Company();
		return instance; //company객체가 만든 주소값을 리턴한다.
	}
	

	
	//싱글톤패턴 코드 끝
}
class Calculator {
	int x; int y;
	private static Calculator instance = new Calculator();
	public static Calculator getInstance() {
		if(instance==null)
			instance = new Calculator();
		return instance;
	}
	int Sum() {	
		return x+y;
	}
	int Sub() {
		return x-y;
	}
	int Mul() {
		return x*y;
	}
	double Div() {
		return (double)x/y;
	}
	
	
}

public class C05SingleTonPattern {
	public static void main(String[] args) {
		C05Company com1 = C05Company.getInstance();
		//100번지를 com1이라는 참조변수에 연결한다.
		C05Company com2 = C05Company.getInstance();
		System.out.println(com1 == com2);
		com1.x=10;com1.y=20;com1.z=30;
		System.out.printf("com2.x=%d,com2.y=%d,com2.z=%d\n"
				,com2.x,com2.y,com2.z);
		
		System.out.println();
		Calculator cal1 = Calculator.getInstance();
		Calculator cal2 = Calculator.getInstance();
		System.out.println(cal1==cal2);
		cal1.x=1000;
		cal2.y=500;
		System.out.printf("cal1.x=%d, cal1.y=%d\ncal2.x=%d, cal2.y=%d\n\n",cal1.x,cal1.y,cal2.x,cal2.y);
		
		System.out.printf("Sum =%3d\n",cal1.Sum());
		System.out.printf("Div =%3.1f\n",cal1.Div());
		System.out.printf("Mul =%3d\n",cal1.Mul());
		System.out.printf("Sub =%3d\n",cal1.Sub());

	}
}
