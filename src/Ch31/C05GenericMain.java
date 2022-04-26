//package Ch31;
//class Material {//재료로 사용할 클래스의 상위클래스를 지정
//	public String toString() {
//		return "그냥재료";
//	}	
//}
//class caramel extends Material{	
//	public String toString() {
//		return "카라멜";
//	}
//}
//class onion extends Material {
//	public String toString() {
//		return "어니언";
//	}
//}
//class Mincho { //민초는 material에 포함되어있지 않다.
//	public String toString() {
//		return "민초;;;;;;;;";
//	}
//}
//class Popcorn<T extends Material> {
//				//Material과 상속관계에 있는 클래스들만 제네릭으로 지정하겠다!
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
//public class C05GenericMain {
//	public static void main(String[] args) {
//		//비정상재료
//		
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
//		
//		//비정상재료
////		Popcorn<Mincho> corn3 = new Popcorn<Mincho>();//컴파일에러
////		corn3.setMaterial(new Mincho());
////		corn3.Fry(); 
//		
//		
//		
//		//Material로 상위클래스를 지정하면 Material클래스로 다른 클래스
//		//의 기능들을 사용할 수 있다.
//		
//		
//	}
//}
