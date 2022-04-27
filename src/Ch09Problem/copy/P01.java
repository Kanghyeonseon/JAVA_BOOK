/*자바 클래스를 작성하는 연습을 해보자. 
1) 
public static void main(String[] args) {
   Person Jung = new Person("홍길동", 44, "대구"); //이름(name),나이(age),주소(addr)
   Jung.showinfo();
}
[출력]
이름 : 홍길동
나이 : 44
주소 : 대구
*/
package Ch09Problem.copy;
class Person {
	String name;
	int age;
	String addr;
	
	Person(String name, int age, String addr) {
		this.name = name; this.age = age; this.addr = addr;
	}
	

	void showinfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
	}

}


public class P01 {

	public static void main(String[] args) {
		   Person Jung = new Person("홍길동", 44, "대구"); //이름(name),나이(age),주소(addr)
		   Jung.showinfo();
		}

}
