package Ch09;

//생성자 함수 (매서드)
//객체 생성 시 필요한공간 + 초기값을 설정하기 위해 선언된 함수
//객체 생성 시 한 번만 호출된다.
//클래스 내에 생성자 함수를 명시하지 않았을 때 컴파일러에 의해 삽입되는 
//기본 생성자 함수가 있다(디폴트생성자함수) : 이 함수는 모든 멤버변수의 값을 0 또는 null로 초기화시켜준다.
//생성자 함수는 반환자료형이 없다.
//생성자함수명은 클래스명과동일하다.
class C12Simple
{
	//속성.멤버변수
	int x;
	int y;
	//디폴트생성자의 형태
	C12Simple() {
		System.out.println("디폴트생성자호출!");
		x=5; y=5;}
	//기능
	void ShowXY() {System.out.printf("x=%d, y=%d\n", x, y);}
}

public class C12ConstructorMain {
	public static void main(String[] args) {
		C12Simple ob = new C12Simple(); //C12Simple() 디폴트 생성자 함수
		ob.ShowXY();
	}
}
