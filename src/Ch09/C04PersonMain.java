package Ch09;
class C04Person { 
	//동일패키지 내에서는 동일한 이름의 클래스 불가능
	//메인 클래스가 아닌 다른 클래스에는 접근한정자 public을 지워야한다.
	//속성(=필드, 멤버변수)
	String name;
	int age;
	float height;
	double weight;	
	//기능(=멤버메서드, 멤버함수)
	void talk() {
		System.out.println(name + "님이 말합니다");
	}
	void walk() {
		System.out.println(name + "님이 걷습니다.");
	}
}
	//주의! main 메서드를 포함한 java파일명과 class명은 일치해야한다.
public class C04PersonMain { 
	public static void main(String[] args) {
		C04Person obj = new C04Person();
		//이 부분도 이름 바꿔줘야한다.
		obj.name = "홍길동" ; obj.age=35;
		obj.talk();
		obj.walk();
	}

}
