package Ch09;
class C03Person { 
	//동일패키지 내에서는 동일한 이름의 클래스 불가능
	//메인 클래스가 아닌 다른 클래스에는 접근한정자 public을 지워야한다.
	//속성(=필드, 멤버변수)
	String name;
	int age;
	float height;
	double weight;		
}
	//주의! main 메서드를 포함한 java파일명과 class명은 일치해야한다.
public class C03PersonMain { 
	public static void main(String[] args) {
		C03Person obj = new C03Person();
		obj.name = "홍길동" ; obj.age=35;
	}

}
