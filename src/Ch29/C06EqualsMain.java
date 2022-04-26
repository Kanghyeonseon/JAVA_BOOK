package Ch29;

import java.util.Objects;

class Person
{
	String name; String addr; int age;


	public Person(String name, String addr, int age) {
		this.name = name; this.addr = addr; this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		System.out.printf("%x\n",Objects.hash(name));
		return Objects.hash(name, addr, age);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person down = (Person) obj;
			return this.name.equals(down.name)&&this.addr.equals(down.addr)&&this.age==down.age;
		} else return false;
	}	
	
	
}
public class C06EqualsMain {
	public static void main(String[] args) {

		Person ob1 = new Person("홍길동" ,"대구", 22);
		Person ob2 = new Person("홍길동" ,"대구", 22);
		Person ob3 = new Person("김길동" ,"대전", 12);
		System.out.println("ob1과 ob2 일치? " + ob1.equals(ob2));
		System.out.println("ob2과 ob3 일치? " + ob2.equals(ob3));
		
		
		System.out.printf("%x\n",Objects.hash(ob1.name));
		System.out.printf("%x\n",Objects.hash(ob2.name));
		System.out.printf("%x\n",Objects.hash(ob3.name));



		
	}
}
