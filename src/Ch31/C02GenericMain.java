//package Ch31;
//class Plastic<T> {
//	public void doPrinting() {
//		System.out.println("플라스틱 재료로 출력");
//	}
//}
//class Powder<T> {
//	public void doPrinting() {
//		System.out.println("파우더 재료로 출력");
//	}
//}
//class ThreeDPrinter<T> {
//	private T material;
//	public T getMaterial() {
//		return material; //material이 private
//	}
//	public void setMaterial(T material) {
//		this.material = material;
//	}
//	}
//public class C02GenericMain {
//	public static void main(String[] args) {
//		
//		
//		ThreeDPrinter<Powder> print1 = new ThreeDPrinter<Powder>();	
//		//3d프린트 의 제너릭 타입을 Powder로 지정
//		//3d프린트의 <Powder> 객체 생성
//		print1.setMaterial(new Powder()); //Powder객체 생성 후 주소를 3d프린트 객체로 전달
//		print1.getMaterial().doPrinting(); //3d프린트의 get함수로 material을 꺼내 doPrinting()
//
//		ThreeDPrinter<Plastic> print2 = new ThreeDPrinter<Plastic>();
//		print2.setMaterial(new Plastic());
//		print2.getMaterial().doPrinting();
//	}
//}
