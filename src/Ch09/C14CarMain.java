package Ch09;

class C14Car{
	//속성
	public String owner;
	public int speed;
	public int fuel;
	public String model;
	public String cupholder1;
	public String cupholder2;

	C14Car(String owner, String model, int fuel, int speed, String cup1, String cup2) {
		this.owner=owner; this.model=model; this.fuel=fuel; this.speed=speed; this.cupholder1=cup1; this.cupholder2=cup2;
	}
	C14Car(String owner, String model, int fuel, int speed, String cup1) {
		this.owner=owner;this.model=model; this.fuel=fuel; this.speed=speed; this.cupholder1=cup1;
	}
	C14Car(String owner, String model, int fuel, int speed) {
		this.owner=owner;this.model=model; this.fuel=fuel; this.speed=speed; 
	}
	
	
	//기능
	//기능 추가
	//AddCupholder(String b) : void ->멤버변수 cupholder1에 b1문자열 저장
	//AddCupholder(String b1, String b2) : void -> 멤버변수 cupholder1,2에 각각 b1, b2저장
	//ShowInfo() : void : owner, speed, fuel, cupholder1, cupholder2를 각각 출력하는 메서드
	
	void AddCupholder(String b1) {
		this.cupholder1 = b1;
		
	}
	void AddCupholder(String b1, String b2) {

		this.cupholder1 = b1;
		this.cupholder2 = b2;
	}
	
	
	
	public void Accel() {
		//현재속도에서 +10
		//최대속도 200km/h를 넘지않는다.
		//연료량은 -5, 연료 량이 0이 되면 가속할 수 없다.
		//정상가속이 되면 (name님 차량 가속합니다. 연료량 = ? 현재속도 = ?)
		if(fuel-5<=0) {
			fuel = 0;
			System.out.println("연료량 0 가속불가능합니다.");
			System.exit(-1);
			return ; //!!!!!!!!!!!!!!!!!!!리턴을 해줘야한다.
		} else if(speed+10>=200) {
			speed = 200;			
			fuel-=5;
			System.out.println("최고속도를 넘었습니다.\n가속할 수 없습니다.");
			System.exit(-1); //프로그램을 종료할 수 있다.
		
		}
		else {
			speed = speed +10;
			fuel = fuel-5;
			System.out.println(owner + "님 차량 가속합니다.");
		}

		System.out.println("연료량 = " + fuel);
		System.out.println("현재속도 = " + speed);
		

	}
	public void Break() {
		//현재속도에서 -10
		//현재속도가 0이라면 차량이 정지했습니다.를 출력
		speed = speed -10;
		if(speed>0) {
			System.out.println(owner + "님의 차량이 감속했습니다.");
			System.out.println("speed = " + speed);
			
		} else {
			speed = 0;
			System.out.println(owner + "님의 차량이 정지했습니다.");
			System.out.printf("현재속도 : %d\n", speed);
			System.exit(-1); //프로그램을 종료할 수 있다.
		}

	}
	public void ShowInfo() {
		//ShowInfo() : void : owner, speed, 
		//fuel, cupholder1, cupholder2를 각각 출력하는 메서드
		System.out.println("차주 : " + owner);
		System.out.println("속도 : " +speed);
		System.out.println("모델 : " +model);
		System.out.println("연료 : " +fuel);
		System.out.println("컵홀더1번 : " +cupholder1);
		System.out.println("컵홀더2번 : " +cupholder2);
		System.out.println();
	}
}


public class C14CarMain {
public static void main(String[] args) {
	C14Car mycar1 = new C14Car("홍길동", "아반떼", 0,100,"식혜","수정과");
	C14Car mycar2 = new C14Car("홍길동", "펠리세이드" ,0, 100,"아아");
	C14Car mycar3 = new C14Car("홍길동", "그랜저" ,0, 100);
	mycar1.ShowInfo();
	mycar2.ShowInfo();
	mycar3.ShowInfo();
	
	
	}
	
}

