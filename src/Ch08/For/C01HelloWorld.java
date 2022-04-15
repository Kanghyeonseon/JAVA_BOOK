package Ch08.For;

public class C01HelloWorld {

	public static void main(String[] args) {

		/*-------------------------------------------- 
		 * 이 부분을 for문으로 옮겼다.
		int i = 1; 		//탈출용 변수
		while(i<=10) 	//탈출 조건식
		{
			System.out.println("Hello World");
			i++; 		//탈출 연산식

		}
		--------------------------------------------*/
		
		for(int i=1; i<=10; i++) {
		//탈출용변수 //탈출조건식 //탈출연산식
			System.out.println("Hello World");

		}
	}

}
