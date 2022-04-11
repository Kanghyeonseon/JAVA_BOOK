package Ch03실수;

public class C04자료형 {

	public static void main(String[] args) {
//		int자료형(4바이트, -21억~21억) - 기본자료형
//		int var1 = 0b1111; //2진수
//		int var2 = 0206;   //8진수
//		int var3 = 365;
//		int var4 = 0xb3;   //16진수
		

//		byte자료형
//		byte var1 = -128;
//		byte var2 = -30;
//		byte var3 = 30;
//		byte var4 = 127;
		
//		char(2byte, 음수값x) 0-65535
//		char var1 = 97;
//		char var2 = 5000;
//		char var3 = 20;
//		char var4 = 65535;

//		short 자료형(2byte -음수값o) -30000 ~ 30000
//		short var1 = 30000;
//		short var2 = -30000;
//		short var3 = 1234;
//		short var4 = 4567;
		
		
//		long자료형(8byte, 음수값o)		
//		long var1 = 20000000000L;		//200억이라는 데이터를 상수풀에 저장시키려고하는데
//										//int자료형의크기(4바이트,21억)보다 크다.
//										//그래서 접미사 L로써 구분해준다.
//		long var2 = 100;
//		long var3 = 100;
//		long var4 = 100;
		
		
//		double 자료형(8byte) - 기본자료형 15~18자리
//		float (4byte) 5~9자리
		double var1 = 10.77777777777777777777; //소숫점아래가 20개
		float var2 = 10.77777777777777777777F; 
		double var3 = 30.5;
		double var4 = 40.5;
		
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		

	
	}

}
