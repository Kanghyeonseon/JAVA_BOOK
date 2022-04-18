package Ch09;

class C08Car2{
	//속성
	String owner;
	int speed;
	int fuel;
	
	//기능
	public void Accel() {
		//현재속도에서 +10
		//최대속도 200km/h를 넘지않는다.
		//연료량은 -5, 연료 량이 0이 되면 가속할 수 없다.
		//정상가속이 되면 (name님 차량 가속합니다. 연료량 = ? 현재속도 = ?)
		if(fuel-5<=0) {
			fuel = 0;
			System.out.println("연료량0 가속불가능합니다.");
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
}


public class C08CarMain2 {
public static void main(String[] args) {
	C08Car2 hong = new C08Car2();
	hong.owner = "홍길동";
	hong.speed = 100;
	hong.fuel = 50;
//	hong.Accel();
//	hong.Break();
	while(true) {
		try { Thread.sleep(500); //0.5초 일시정지
		hong.Accel();
//		hong.Break();
		}
		catch(Exception e) {}
	}
	
}
}
