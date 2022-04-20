package Ch19;
class Simple{
	static int x; //공유 메모리 영역에 적재된다.
	int y;
	void ShowXY() {
		System.out.printf("X = %s, Y = %s\n",x , y);
	}
}
public class C01StaticMain {
	public static void main(String[] args) {
		Simple ob1 = new Simple();
		Simple ob2 = new Simple();
//		ob1.x = 1;
//		ob1.y = 2;		
		
//		ob2.x = 3;
//		ob2.y = 4;
		
//		ob1.x =100;
		Simple.x=123;
//		Simple.y=12;
		
		ob1.ShowXY();
		ob2.ShowXY();
	}
}
