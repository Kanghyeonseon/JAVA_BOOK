package Ch07.C01;

public class While4 {
	public static void main(String[] args) {
		//1부터 10까지 수 중 3의 배수 합만 출력
		int i=1;
		int sum = 0;
		while(i<=10)
		{
			if(i%3==0)
			{
				sum+=i;
			}
			i++;
		}
		System.out.println("합은 : " + sum);
		
		
		
	}
}
