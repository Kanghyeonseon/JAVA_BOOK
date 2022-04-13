package Ch07.C01;

public class While2 {
	public static void main(String[] args) {
		//구구단2단 출력
		System.out.println("구구단을 외자. 구구단을외자!");
		int i = 1;
		int product;
		while (i<=9)
		{
			product = 2*i;
			System.out.println("2*"+i+"="+product);
			i++;
		}
		
		
		
	}
}
