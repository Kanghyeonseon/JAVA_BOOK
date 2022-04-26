package Ch29;

public class C07ClassMain {
	public static void main(String[] args) {
		//방법1
//		Class c1 = Person.class;
//						//예약어 class
//						//객체의 주소가 c1에 들어가게 된다.		
//		System.out.println(c1.getName());
//		System.out.println(c1.getSimpleName());
//		System.out.println(c1.getPackage().getName());
//		
		//방법2
//		Class c1 = null; //초기화
//		try {
//			c1 = Class.forName("Ch29.Person");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(c1.getName());
//		System.out.println(c1.getSimpleName());
//		System.out.println(c1.getPackage().getName());
		
	
	
	//방법3
	Person obj = new Person("홍길동", "대구", 22);
	Class c1 = obj.getClass();
	System.out.println(c1.getName());
	System.out.println(c1.getSimpleName());
	System.out.println(c1.getPackage().getName());
	
	}
	
	
}
