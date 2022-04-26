package Ch29;

import java.util.Objects;

class C03Simple {
	int x;
	C03Simple(int x) {this.x = x;}
	
	
	//equals와 hash코드를 재정의해줘야 equals가 재정의된다.
	@Override
	public int hashCode() {
		System.out.printf("해쉬코드 결과값 : %x\n",Objects.hash(x));
		return Objects.hash(x);
					//클래스이름으로 접근가능 static 객체생성안해도 사용가능
					//멤버 x에 대한 해쉬코드 값
	}
	
	@Override
	public boolean equals(Object obj) { 
						//obj는 Object클래스로 부터 만들어진 객체이다.
		//Object obj = ob2로 업캐스팅된 상태이다. 
		//어떤 객체든 다 받을 수 있으므로
		if(obj instanceof C03Simple) {
			//외부로부터 들어온 객체 C03Simple클래스로부터 들어온 객체가맞는가?
			C03Simple down = (C03Simple) obj; 
			//다운캐스팅했고, 강제형변환 했다.
			return this.x==down.x;
			//ob1의 x가 다운캐스팅 한 ob2의 x와 같은가?
		} else return false;
	}
}


public class C02EqualsMain {
	public static void main(String[] args) {
		C03Simple ob1 = new C03Simple(10);
		C03Simple ob2 = new C03Simple(10);
		C03Simple ob3 = new C03Simple(20);
		System.out.println("ob1.equals(ob2) ? " + ob1.equals(ob2));
		System.out.println("ob1.equals(ob3) ? " + ob1.equals(ob3));
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		//업캐스팅 된 상태라서 equals는 어떤객체든 다 받을 수 있다.
		//equals는 Object클래스 에 소속되어있으므로 		
		
		//equals를 재정의해서 Simple클래스의 x멤버가 일치하면 true를
		//리턴할 것이다.			
	}
}
