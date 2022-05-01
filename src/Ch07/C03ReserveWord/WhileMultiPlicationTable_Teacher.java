package Ch07.C03ReserveWord;

public class WhileMultiPlicationTable_Teacher {

	public static void main(String[] args) {
		//구구단출력 while in while 예제를 복사했다.
		//7 x 7 = 49까지 출력하고 빠져나가고 싶다.
		int dan = 2;
		int i = 1;
		boolean flag = false;
		while(dan<=9) 	{
			System.out.printf("%d 단\n",dan);
			i = 1;		//1로 초기화시켜주는 작업 필요
			while(i<=9) {
				System.out.printf("%d x %d = %d\n",dan, i, (dan*i));
				if(dan==7&i==7) {flag = true; break;}
						//이 break문 만 출력하면 7 x 8 ~ 7 x 9 만 출력하지 않음.
				i++;				
			}
			
			System.out.println();
//			if(dan==7) break;
			if (flag==true) break;
			dan++;
		}		
		
	}

}
