package Ch31;

/*class Person1 {
	String name; String addr;
	Person1(String name, String addr) {
		this.name=name; this.addr = addr;
	}
	public String toString() {
		return "name = " + name + ", addr = " + addr;
	}	
}*/
class C04Simple<K,T> {
	K x; T y;
	C04Simple(K x, T y) { this.x = x; this.y = y; }
	@Override
	public String toString() {
		return "C04Simple [x=" + x + ", y=" + y + "]";
	}


	
	
	
}

public class C04GemericMain {
	public static void main(String[] args) {
		//기본자료형을 제테릭타입에 전달할 수 없다 -> Wrapper클래스로 기본자료형을 대체한다.
		C04Simple<Integer,Double> ob1 = new C04Simple(10, 10.2);
		//기본자료형 int, double을 사용할 수 없다.
		//좌우변의 자료형이 동일하다면우변은 생략할 수 있다. 
		System.out.println(ob1.toString());
		
		C04Simple<Character, String> ob2 = new C04Simple('가',"Hello World");
		System.out.println(ob2.toString());
		
		C04Simple<Character, Person> ob3 = new C04Simple("Key1",new Person("홍길동", "대구"));
		System.out.println(ob3.toString());

	}
	
}
