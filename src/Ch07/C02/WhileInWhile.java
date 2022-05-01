package Ch07.C02;

public class WhileInWhile {

	public static void main(String[] args) {
		// 전체구구단 (가로)
		int dan = 2;
		int i = 1;
		while(dan<=9)
		{
			System.out.printf("%d 단\n",dan);
			i = 1;		//1로 초기화시켜주는 작업 필요
			while(i<=9)
			{
				System.out.printf("%d x %d = %d\n",dan, i, (dan*i));
				i++;
			}
			System.out.println();
			dan++;
		}
		
		
		
		

	}

}
