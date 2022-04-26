//package Ch31;
//class caramel {	
//	public String toString() {
//		return "카라멜";
//	}
//}
//class onion {
//	public String toString() {
//		return "어니언";
//	}
//}
//class Popcorn<T> {
//	private T material;
//	void Fry() {
//		System.out.println(material.toString()+" 팝콘이 튀겨집니다");
//		System.out.println(material); 
//		//toString을 하나 안 하나 같다.
//		//toString이 참조변수를 본다는 뜻이므로 
//	}
//	public T getMaterial() {
//		return material;
//	}
//	public void setMaterial(T material) {
//		this.material = material;
//	}
//}
//public class C03GenericMain {
//	public static void main(String[] args) {
//		Popcorn<caramel> corn1 = new Popcorn<caramel>();
//		//corn1은 카라멜형자료형으로 선언했다.
//		corn1.setMaterial(new caramel());
//		//corn1로 setMaterial이라는 메소드을 쓸 수 있다. 
//		//setMaterial에 카라멜클래스의 주소를 대입했다.
//		//그러면 카라멜클래스의 material을 꺼내올 수 있다.
//		corn1.Fry();
//		
//		Popcorn<onion> corn2 = new Popcorn<onion>();
//		corn2.setMaterial(new onion());
//		corn2.Fry();		
//	}
//}
