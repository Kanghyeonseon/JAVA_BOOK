package Ch07.C01;

public class C01While2 {
	public static void main(String[] args) {
		//1부터 10까지의 합 구하기
		int i = 1;				//탈출용 변수
		int sum = 0;			//누적용 변수
		while(i<=10)			//탈출 조건식
		{
			sum+=i;
			i++;				//탈출 연산식
		}
		System.out.println(sum);
		
		
	}
}
