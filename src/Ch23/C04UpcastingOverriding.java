package Ch23;
class Super1 {
	int x;
	void Func() {
		System.out.println("TEST");
	}
}
class Sub1 extends Super1 {
	int y;

	@Override
	void Func() {
		System.out.println("SUB CLASS TEST");
	}
	void ShowXY() {
		System.out.printf("x = %d, y = %d\n", x, y);
	}
	
}
public class C04UpcastingOverriding {
	public static void main(String[] args) {
		//노캐스팅
		Super1 ob1 = new Super1();
		Sub1   ob2 = new Sub1();
		Sub1   ob3 = new Sub1();
		
		//업캐스팅상태에서...
		Super1 ob4 = new Sub1();
//		ob4.y=10; ob4.ShowXY(); //하위클래스의 메소드는 쓸 수 없다.
		ob4.Func();             //상속관계의 오버라이딩한 함수는쓸 수있다.
	}
}
