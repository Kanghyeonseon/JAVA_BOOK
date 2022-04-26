package Ch24;
//완성된 클래스---------
class Super1 {
	void Func1() { System.out.println("Super1 에서 정의한 Func1");}
	//일반메서드(함수선언+함수정의)
}
class Sub1 extends Super1 {
	void Func1() { System.out.println("Sub1에서 재정의한 Func1"); }
}
//------------------

//추상클래스-----------
abstract class Super2 {
	abstract void Func1(); //{}(함수의 본체)가 없다.
							//추상메서드(함수선언)
}
class Sub2 extends Super2 {
	void Func1() { System.out.println("Sub2에서 재정의한 Func1"); }
} 
//{}안의 내용(Func1())이 없으면 컴파일에러!
//add unImplementedmethod라는 컴파일에러!


//------------------


public class C01AbstractMain {
	public static void main(String[] args) {
		//일반클래스 상속관계
		Super1 ob1 = new Super1(); //상위클래스로 객체 생성 가능하다.
		Sub1 ob2 = new Sub1(); //하위클래스로 객체생성도 가능하다.
		Super1 ob5 = new Sub1();
		ob1.Func1();
		ob2.Func1();
		ob5.Func1();
		
		//추상클래스 상속관계
//		Super2 ob3 = new Super2(); //상위클래스로 객체생성 불가능하다.
		Sub2 ob4 = new Sub2(); 
		//하위클래스로 객체생성 가능
		//단, 물려받은 추상메서드를 정의했을 때만(내용이 있을 떄만) 가능하다.
		
		//추상클래스의 업캐스팅 다운캐스팅
		Super2 up = new Sub2(); //업캐스팅 
		//재정의한 하위객체의 오버라이딩한 함수에는 접근가능.
		up.Func1();
		//업캐스팅 자체로는 접근 불가능 하지만 
		//추상클래스에서는 접근이 가능하다.
	}
}
