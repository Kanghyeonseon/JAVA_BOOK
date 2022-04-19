package Ch15;
class C01Simple {
	C01Simple() {
		System.out.println("위치 : " + this);
	}
}
public class C01ThisMain {
	public static void main(String[] args) {
		C01Simple obj1 = new C01Simple();
		System.out.println("ob1 : " + obj1);
		C01Simple obj2 = new C01Simple();
		C01Simple obj3 = new C01Simple();
	}
}
