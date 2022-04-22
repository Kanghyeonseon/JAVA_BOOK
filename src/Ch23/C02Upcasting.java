package Ch23;

class C02Super {
	int x;
	void prit() {
		System.out.println("Super클래스");
	}
}
class C02Sub extends C02Super {
	int y;

}
public class C02Upcasting {
	public static void main(String[] args) {
		C02Super ob1 = new C02Super();
		ob1.x = 10;
		
		C02Super ob3 = new C02Sub();
		ob3.x = 10; //접근 가능
//		ob3.y = 20; //접근 불가능
		C02Sub down = (C02Sub) ob3;
		//하위클래스의참조변수로 ob3이 연결해놓은 주소에 연결해라
		down.x=10; down.y=20;
		
	}
}
