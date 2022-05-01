package Ch08.For2;

public class for6 {
	public static void main(String[] args) {
		//1부터 10까지 수 중의 짝수의 합 / 홀수의 합 따로 구해서 출력
		int evensum=0;
		int oddsum = 0;
		for(int i = 1; i<=10;i++) {
			if (i%2==0) {
				evensum+=i;
			} else { oddsum+=i; }
		}
		System.out.println("짝수의 합 : " + evensum);
		System.out.println("홀수의 합 : " + oddsum);
	}
}
