package Ch13.C02;
class CarEngine {
	//엔진의 작동 과정 : 흡입->압축->폭발->배기
	private void Induction() {System.out.println("흡입!");}
	private void Compress() {System.out.println("압축!");}
	private void Power() {System.out.println("폭발!");}
	private void Exhaust() {System.out.println("배기!");}
	
	public void EngineStart() {
		System.out.println("엔진 구동!");
		Induction();
		Compress();
		Power();
		Exhaust();
	}
}

class C02Car {
//	private CarEngine engine; //참조변수
//	C02Car() {
//		engine = new CarEngine();
//	}
	private CarEngine engine = new CarEngine();
	
	void StartCar() {
		//~~
		engine.EngineStart();
		//~~
	}
	
}
public class C02Capsulation {
	public static void main(String[] args) {
		C02Car mycar = new C02Car();
		mycar.StartCar();
		
	}
}
