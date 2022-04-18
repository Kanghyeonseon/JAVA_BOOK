package Ch09;

class C14Simple {
	//속성
	int x; int y; int z;
	
	//생성자
	C14Simple() {
		System.out.println("디폴트생성자 호출!");
		x=0; y=0; z=0;
	}
	C14Simple(int x) {
		System.out.println("C14Simple(int x)생성자 호출!");
		this.x=x; y=0; z=0;
		//만들어진 이 객체 x(this)에 외부에서 받은 x(10)를 넣어주겠다.
	}
	C14Simple(int x, int y) { //생성자오버로딩을 하고 있다.
		System.out.println("C14Simple(int x, int y)생성자 호출!");
		this.x=x; this.y=y; z=0;
	}
	C14Simple(int x, int y, int z) {
		System.out.println("C14Simple(int x, int y, int z)생성자 호출!");
		this.x=x; this.y=y; this.z=z;
	}
	
	//기능
	void ShowInfo() {
		System.out.printf("X=%d, Y=%d, Z=%d", x, y, z);
	}
	
}

public class C14ConstructorMain {
	public static void main(String[] args) {
		C14Simple obj1 = new C14Simple(); //기본 생성자 호출
		obj1.ShowInfo();
		
		C14Simple obj2 = new C14Simple(10); 
		//오버로딩 된 생성자 중에인자 하나를 전달받는 생성자가 자동적으로 호출된다.		
		obj2.ShowInfo(); //외부로부터 전달받은 x값을 확인할 수 있다.
		
		C14Simple obj3 = new C14Simple(10, 20);
		//인자 2개를 받는 생성자를 자동으로 호출한다.
		obj3.ShowInfo();
		
		C14Simple obj4 = new C14Simple(10, 20, 30);
		//인자 3개를  받는 생성자를 자동으로 호출한다.
		obj4.ShowInfo();
		
	}
}
