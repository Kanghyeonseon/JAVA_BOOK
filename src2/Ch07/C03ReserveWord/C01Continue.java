package Ch07.C03ReserveWord;

public class C01Continue {
	public static void main(String[] args) {
		//예약어
		//Continue : 가장가까이 있는 반복문의 조건식으로 올라간다.
		//1부터 10까지의 수 중 3의 배수는 제외하고 출력
		int i = 1;
		while(i<=10)
		{
//			System.out.println("무한루프");
			if(i%3==0) {
				i++; //이 부분을 추가시키지 않으면 무한루프로 돌아간다.
				continue;
			}
			System.out.println("i = " + i);
			i++;
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
