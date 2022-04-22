package Ch23;
class A {int a;}
class B extends A{int b;}
class C extends A{int c;}
class D extends B{int d;}
class E extends C{int e;}
class F extends D{int f;}
class G extends E{int g;}

public class C03InstanceOfMain {
	public static void UpDownFunc(A obj) //업캐스팅이다. A obj = new B();
	{	
		//다운캐스팅을 해줘야한다.
		if(obj instanceof B) {
			//obj가 만든 것이 B클래스의 객체인가?
			//확장된 부분이 무엇인지 모르기 때문에 이런 작업을 거친다.
			B down = (B) obj; //그렇다면 B로 다운캐스팅해라.
			down.a=10; down.b=20; //다운캐스팅을 할 수 있음을 나타낸다.
			System.out.printf("a=%d, b=%d",down.a, down.b);
		} else if (obj instanceof C) {
			C down = (C) obj;
			down.a=11; down.c=20;
		} 
	}
	
	
	public static void main(String[] args) {
		UpDownFunc(new B());
		UpDownFunc(new C());
	}
}

