package Ch03실수;

public class C05자료형 {

	public static void main(String[] args) {

		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'가');
		System.out.println((int)'나');

		System.out.println((char)100);
		System.out.println((char)200);
		System.out.println((char)30000);
		System.out.println((char)12345);

		System.out.println((char)10);
		System.out.printf("%x\n",(int)'A');
		System.out.printf("%x\n",(int)'a');
		System.out.printf("%x\n",(int)'가');
		System.out.printf("%x\n",(int)'나');
		
		//유니코드 값을 이용해서 문자를 출력
		System.out.println('\u0041');
		System.out.println('\u0061');
		System.out.println('\uac00');
		System.out.println('\uac02');

		
	}

}
