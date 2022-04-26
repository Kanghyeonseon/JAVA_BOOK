package Ch29;

public class C10WrapperMain {
	public static void main(String[] args) {
		//자동 boxing
		Integer obj = 100;
		System.out.println("val : "+ obj);
		
		//자동 Unboxing(산술연산 시)
		int val = obj;
		System.out.println("val : " + val);
		int result1 = obj + val;
		System.out.println("result : " + result1);
	}
}
