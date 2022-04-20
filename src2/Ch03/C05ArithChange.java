package Ch03;

public class C05ArithChange {

	public static void main(String[] args) {
		int num = 10, div = 4;
		double result1 = num/div;		//num/div값은 int이므로 소수점이하가 버려지게되고
										//2.5->2 좌우의 자료형이 다르므로 int->double되므로 2.0
		double result2 = (double)num/div; //좌우의 자료형이 같으므로 double->double
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		
	}

}
