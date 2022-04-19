package Ch13.C01;
class C01Person{
	//속성
	public String name;
	private int age;
	private float weight;
	private double height;
	
	//생성자
	C01Person(String name, int age, float weight, double height) {
		this.name=name;this.age=age;
		this.weight=weight;this.height=height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	/*
	 * //Getter int getAge() { return this.age; }
	 * 
	 * //Setter void setAge(int age) { this.age = age; }
	 */
	
	
}
public class C01InforHide {
	public static void main(String[] args) {
		C01Person hong = new C01Person("홍길동", 30, 70, 170.5);
		System.out.println(hong.getAge());
		hong.setAge(50);
		hong.setWeight(80);
		
		System.out.println(hong.getAge());
	}
}
