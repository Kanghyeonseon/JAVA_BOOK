package Ch09;

class C09Simple
{
	int sum(int x, int y) {
		return x+y;
	}
	//메서드 오버로딩
	int sum(int x, int y, int z) {
		return x+y+z;
	}
	//메서드 오버로딩 -위 와는 다르다. 반환 자료형이 다르기 때문이다.
	double sum(double x, double y) {
		return x+y;
	}
	String sum(String str1, String str2) {
		return str1 + str2;
	}
	
	
}

public class C09MethodOverloading {

	public static void main(String[] args) {
		C09Simple ob = new C09Simple();
		System.out.println("sum(int x, int y) : " + ob.sum(10, 20));
		System.out.println("sum(int x, int y, int z) : " + ob.sum(10, 20, 30));
		System.out.println("sum(double x, double y) : " + ob.sum(10.5, 20.5));
		
	}

}
