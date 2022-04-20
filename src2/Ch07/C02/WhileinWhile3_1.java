package Ch07.C02;

public class WhileinWhile3_1 {

	public static void main(String[] args) {
		int dan = 9;
		int i = 1;
		while(dan>=2)
		{
			i=1;
			while(i<=9)
			{
				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
				i++;
			}
			
			System.out.println();
			dan--;
		}

		
	}

}
