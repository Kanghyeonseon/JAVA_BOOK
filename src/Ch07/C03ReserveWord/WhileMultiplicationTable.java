package Ch07.C03ReserveWord;

public class WhileMultiplicationTable {

	public static void main(String[] args) {

		int dan = 2;
		int i = 1;
		while(dan<=9) 	{
			System.out.printf("%d 단\n",dan);
			i = 1;		//1로 초기화시켜주는 작업 필요
			while(i<=9) {
				System.out.printf("%d x %d = %d\n",dan, i, (dan*i));
				if(dan==7&i==7) break;
						//이 break문 만 출력하면 7 x 8 ~ 7 x 9 만 출력하지 않음.
				i++;				
			}
			
			System.out.println();
			if(dan==7) break; //강사님은 flag로 하셨다.
			dan++;
		}		
	}

}
