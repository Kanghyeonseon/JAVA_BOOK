package Ch07.C02;

public class WhileinWhile4 {

	public static void main(String[] args) {
		//전체 구구단 가로
		int i = 1;
		int j = 2;
		while(i<=9)
		{
			j=2;
			while(j<=9)
			{
				System.out.printf("%d x %d = %d\t",j, i,i*j);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
