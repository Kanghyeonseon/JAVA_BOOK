package Ch26;
interface Tire {
	void run();
}
class HankookTire implements Tire {
	@Override
	public void run() {System.out.println("한국타이어가 굴러감");}
	
}
class KumhoTire implements Tire {
	@Override
	public void run() {System.out.println("금호타이어가 굴러감");	}	
}
class Car {
	Tire FL = new HankookTire();
	Tire FR = new HankookTire();
	Tire BL = new HankookTire();
	Tire BR = new HankookTire();
	
	void StartCar() {
		FL.run(); FR.run(); BL.run(); BR.run(); 
	}	
}
public class C02InterfaceMain {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.StartCar();
		System.out.println();
		//타이어교체 같은 타이어 인터페이스를 상속받고 있기 때문에 가능한 일이다.
		myCar.FL = new KumhoTire();
		myCar.BR = new KumhoTire();
		myCar.StartCar();
	}
}
