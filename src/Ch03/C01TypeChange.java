package Ch03;

public class C01TypeChange {

	public static void main(String[] args) {

		//자동형변환
		byte bval = 10;
		int ival = bval;
		System.out.println("ival : " + ival);
		
		char cval = '가';
		ival = cval;
		System.out.println("ival : " + ival);
		
		long lval = ival;
		System.out.println("lval : " + lval);
		
		float fval = lval;
		System.out.println("fval : " + fval);
		
		double dval = fval;
		System.out.println("dval : " + dval);
		
		
	}

}
