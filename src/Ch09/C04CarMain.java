package Ch09;

class C04Car2{
	//속성
	String owner;
	int speed;
	int fuel;
	
	//기능
	public int Accel() {
		System.out.println(owner + "님의 차가 가속합니다.");
		return 0;
	}
	public void Break() {
		System.out.println(owner + "님의 차가감속합니다.");
	}
}


public class C04CarMain {
public static void main(String[] args) {
	C04Car2 hong = new C04Car2();
	hong.owner = "홍길동";
	hong.speed = 0;
	hong.fuel = 0;
	hong.Accel();
	hong.Break();
	
}
}
