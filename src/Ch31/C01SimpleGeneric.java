package Ch31;
class Person {
	String name; String addr;
	Person(String name, String addr) {
		this.name=name;this.addr=addr;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name = " + name + ", addr = " + addr;
	}
	
}
class Simple<T> {
	T x; T y;
	Simple(T x, T y) {
		this.x = x; this.y = y;
	}
	void ShowMember() {
		System.out.println("X =" + x + " Y = " + y);
									//x : x의 toString 호출
									//y : y의 toString 호출
	}
}
public class C01SimpleGeneric {
	public static void main(String[] args) {
		Simple<Integer> ob1 = new Simple<Integer>(10, 20);
		ob1.ShowMember();
		System.out.println();
		Simple<String> ob2 = new Simple<String>("홍길동", "이상민");
		ob2.ShowMember();
		
		Simple<Person> ob3 = new Simple<Person>(new Person("정우균", "대구"), 
				new Person("홍길동","서울"));
		
		ob3.ShowMember();
	
	}
}
