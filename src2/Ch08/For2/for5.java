package Ch08.For2;

public class for5 {
	public static void main(String[] args) {
		//1부터 10까지 수 중의 3의배수의 합만 출력
		System.out.println("1부터 10까지의 수 중 3의 배수의 합 만 출력합니다.");
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
			
		
		
		
		
	}
}
