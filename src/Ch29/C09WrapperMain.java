package Ch29;

public class C09WrapperMain {
	public static void main(String[] args) {
		//boxing
		Integer ob1 = new Integer(100);
		Integer ob2 = new Integer("200");
		Integer ob3 = Integer.valueOf("300"); //요즘은 이방식으로만쓴다.	
		
		
		//unboxing
		int val1 = ob1.intValue();
		int val2 = ob2.intValue();
		int val3 = ob3.intValue();
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		
	}
}
