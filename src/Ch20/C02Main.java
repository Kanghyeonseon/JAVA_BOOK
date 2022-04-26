package Ch20;
class Super {
	int x; int y;
	Super() {
		System.out.println("Super()생성자 호출!");
		x=0;y=0;
	}
	Super(int x) {
		System.out.println("Super(x)생성자 호출!");
		this.x=x;
	}
	Super(int x, int y) {
		System.out.println("Super(x, y)생성자 호출!");
		this.x=x;this.y=y;
	}
}
class Sub extends Super {
	int z;
	Sub() {
		System.out.println("Sub()생성자 호출!");
		}
	Sub(int x) {
		super(x); 
		System.out.println("Sub(x)생성자 호출!");
		this.x=x;y=0;
	}
	//멤버x에다가 전달받은x를 넣는다.
	Sub(int x, int y) {
		super(x,y);System.out.println("Sub(x,y)생성자 호출!");
		this.x=x;this.y=y;
		}
	//super라는 예약어가 없으면 x, y를 전달받지 않기 때문에
	//int의 초기값인 0으로 출력된다.
	Sub(int x, int y, int z) {
		super(x,y);
		System.out.println("Sub(x,y,z)생성자 호출!");
		this.x=x;this.y=y;this.z=z;
		}
	void ShowXYZ() {
		System.out.printf("%3d %3d %3d\n",x,y,z);
	}
}
public class C02Main {
	public static void main(String[] args) {
		Sub ob1 = new Sub();	//디폴트 생성자 호출
		Sub ob2 = new Sub(10);	//Super(x)생성자 호출->Sub(x)생성자 호출
		Sub ob3 = new Sub(10, 20); //
		Sub ob4 = new Sub(10, 20, 30);
		ob1.ShowXYZ();
		ob2.ShowXYZ();
		ob3.ShowXYZ();
		ob4.ShowXYZ();		
	}
}
