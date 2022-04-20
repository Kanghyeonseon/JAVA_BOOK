package Ch18;

class C01Person {
	String name;
	String addr;
	C01Person(String name, String addr) {
		this.name = name; this.addr = addr;
	}
	}


public class C01ClassArrayMain {
	public static void main(String[] args) {
		C01Person[] list = new C01Person[3]; //배열형으로 만들기.
		System.out.println("길이 : " + list.length);
		
//		list[0] = new C01Person();
//		list[0].name = "홍길동";
//		list[0].addr = "대구";
		
		list[0] = new C01Person("홍길동", "대구");
		
		
//		list[1].name = "정우균";
//		list[1].addr = "마산";
//		
//		
//		
//		
//		list[2].name = "이태수";
//		list[2].addr = "일산";
		
		
		
		
		
		
		
		
		
	}
}
