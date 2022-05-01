package Ch07.C01;

public class While5 {

	public static void main(String[] args) {
		//1부터 10까지의 수 중 짝수의 합, 홀수의 합 따로 구해서 출력
		int i = 1;
		int sum1 =0;
		int sum2 =0;
		while(i<=10)
		{
			if(i%2==0)
			{
				sum1+=i;
				i++;
			} else 
			{
				sum2+=i;
				i++;
			}
		}
		System.out.println("짝수의 합 : " + sum1);
		System.out.println("홀수의 합 : " + sum2);

		
		
	}

}
