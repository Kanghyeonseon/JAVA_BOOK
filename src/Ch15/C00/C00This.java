package Ch15.C00;
class Person {
	String name;
	String addr;
	int age;
	
	Person() { //디폴트 생성자
		this("없음", "없음", 0);
		
	}
	
	Person(String n, String a) { //인자를 두 개 받는 생성자
		this(n,a,0);
	}
	Person(String n) { //이름 인자만 받는 생성자.
		this(n,"없음",0);
	}
	
	Person(String name, String addr, int age) {
		this.name=name;this.addr=addr;this.age=age;
		System.out.println("Person(String name, String addr, int age) 호출!");
		System.out.printf("%s, %s, %d\n",name,addr,age);
	} //인자를 모두 받는 생성자
}


public class C00This {

	public static void main(String[] args) {
		Person kim = new Person(); //디폴트생성자는 무엇인가요?
		Person Lee = new Person("이지성","서울특별시"); //인자를 두 개받는 생성자
		Person Son = new Person("손민수","대구광역시",20);//인자를 모두 받는 생성자
		Person Kang = new Person("강현선");//인자를 이름만 받는 생성자.
	}

}
