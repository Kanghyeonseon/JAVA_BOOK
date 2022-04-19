package Ch15;
class C03Simple {
	//멤버
	int x;
	int y;
	int z;
	
	
	C03Simple() {
		this(0,0,0); //인자 3개를 받는 생성자를 호출하고 x=0, y=0, z=0 전달
	} //디폴트생성자
	C03Simple(int x) {
		this(x,0,0);
	} //인자 1개받는생성자
	C03Simple(int x, int y) {
		this(x,y,0);
	}
	C03Simple(int x, int y, int z) {
		System.out.println("C03Simple(int x, int y, int z) 호출!");
		this.x=x;this.y=y;this.z=z;
	}
	

	
	
}


public class C03ThisMain {
	public static void main(String[] args) {
		C03Simple ob1 = new C03Simple();
		C03Simple ob2 = new C03Simple(10);
		C03Simple ob3 = new C03Simple(10,20);
		C03Simple ob4 = new C03Simple(10,20,30);
//		ob1.Showinfo();.
	}
}
