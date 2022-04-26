package Ch31;
class 팥{
	String material;
	팥(String material) { this.material=material; }
	@Override
	public String toString() {
		return material;
	}
	
}
class 슈크림 {
	String material;
	슈크림(String material) { this.material=material; }
	public String toString() {
		return material;
	}
}
class 만두소 {
	String material;
	만두소(String material) { this.material=material; }
	public String toString() {
		return material;
	}
}
class 피자<T> {
	String material;
	피자(String material) { this.material=material; }
	public String toString() {
		return material;
	}
}
class 호빵<T> {
	//제네릭 타입의 클래스를 선언했다.
	private T material;
	호빵(T material) {
		this.material=material;
	}
	void ShowInfo() {
		System.out.println(material.toString() + "으로 만든 붕어빵");
	}

	
}

public class C01GenericMain {
	public static void main(String[] args) {
		호빵<팥> ob1 = new 호빵<팥>(new 팥("단팥"));
		ob1.ShowInfo();
		호빵<슈크림> ob2 = new 호빵<슈크림>(new 슈크림("맛있는슈크림"));
		ob2.ShowInfo();
		호빵<피자> ob3 = new 호빵<피자>(new 피자("맛있는피자속"));
		ob3.ShowInfo();
	}
}
