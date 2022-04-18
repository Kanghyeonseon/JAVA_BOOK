package Ch09.C07;

class C07Simple
{
	int num = 10; //멤버변수 num 이클립스에서 파란색으로 표기된다.
	void Func1() {
		System.out.println("num : " + num);
		int num=20; //지역변수를 만들어 주었다. 
					//괄호 안에서지역변수를 따른다.
					//이 괄호가 끝나면 지역변수는 소멸된다.
	}
	void Func2() {
		System.out.println("num : " + num);
		if(num>0) {
			int num = 300;
			System.out.println("if문 내부 num : " + num);
		} //괄호가 끝나서 지역변수 num이 소멸됐다.
		System.out.println("num : " + num);
	}
	void Func3() {
		int i = 1;
		int num=0;
		System.out.println("num : " + num);
		while(i<=num) {
			num = i;
			System.out.println("while문 내부의 num : " + num);
			i++;
		} //while문이 끝나면 
		System.out.println("num : " + num);
		
	}
}

public class LocalVar {

	public static void main(String[] args) {
		C07Simple obj = new C07Simple();//C07Simple객체를 만들어서실행
		obj.Func1();
		System.out.println();
		obj.Func2();
		System.out.println();
		obj.Func3();

	}

}
