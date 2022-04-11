package Ch03;

public class C04ArithChange {

	public static void main(String[] args) {
		// 산술연산 시 자동형변환

		// 정수연산식(int보다 작은 변수자료형(short, char, byte))인 경우
//		byte x = 10;
//		byte y = 20;
//		byte z = 30;
//		int result = x + y + z;
		// byte result = x + y + z;
		// 산술연산 시(+연산)에서는 int보다 작은 자료형인 경우 int형으로 자동형변환이 일어난다.

		// 정수연산식(int보다 큰 변수자료형 (long))
		// ->큰자료형으로 형변환

//		byte x = 10;
//		int y = 20;
//		long z = 30L;
//		long result = x + y + z;
//		System.out.println(result);

		// 실수연산식
		int x = 10;
		float y = 3.3F;
		double z = 4.5;
		double result = x + y + z; // 실수자료형(=size큰 자료형)으로 자동 형변환
		System.out.println(result);

	}
}
