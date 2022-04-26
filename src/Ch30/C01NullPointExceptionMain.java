package Ch30;

public class C01NullPointExceptionMain {
	public static void main(String[] args) {
		try {
			String temp = null;	
			temp.charAt(10); //nullpointexception
		} catch(NullPointerException e) {
			//NullPointException 클래스이고 e라는 참조변수
			System.out.println("예외처리!");
			System.out.println(e.getCause());
			//e라는 참조변수의 원인은 무엇인가요? -> null
			System.out.println(e.toString());
			//error메세지확인
			System.out.println(e.getStackTrace());
			//StackTrace의 위치정보
			e.printStackTrace();
			//오류가 발생한 시점을 알려준다.
		}
		System.out.println("실행되어야 하는 코드 1");
		System.out.println("실행되어야 하는 코드 2");
	}
}
