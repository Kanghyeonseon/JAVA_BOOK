package Ch29;

public class C08StringBufferMain {
	public static void main(String[] args) {
//		String str1 = "JAVA";
//		String str2 = "Android";
//		
//		System.out.println(str1.toString());
//		System.out.println(str1);
//		
//		System.out.printf("%x\n", System.identityHashCode(str1));
//		
//		//StringAPI중에 문자열을 붙이는 함수가 있다.
//		str1 = str1.concat(str2);
//		System.out.println(str1);
//		System.out.printf("%x\n", System.identityHashCode(str1));
		
		
		//concat을 자주사용하게 되면 문제가 생긴다.
		//기존str1공간에다가 덧붙이는게 아니라 새로운 공간을 만들어서 문자열을붙이고
		//새로운 문자열은 새로운 해쉬코드값을 가지게 된다.
		//그러면 공간낭비가 된다. 
		//->스트링버퍼, 스트링 빌더를 쓴다. (기존의공간을 유지한다.=동적공간을만든다)
		
		
		StringBuffer str1 = new StringBuffer("JAVA");
		System.out.printf("%x\n",System.identityHashCode(str1));
		StringBuffer str2 = new StringBuffer("Android");
		System.out.println();
		
		str1.append(" and ");
		str1.append("Android ");
			//덧붙이는 함수
		System.out.printf("%x\n",System.identityHashCode(str1));
		System.out.println(str1);
		
		
		
		
		

		
	
	}
}
