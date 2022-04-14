package Ch07.C02.Star.Teacher;

public class Star_Diamond {

	public static void main(String[] args) {
		//WhileInWhile9를 푼 문제이다.
		
		int i = 0; //개행
		int j = 0; //공백
		int k = 0; //별찍기
		
		while(i<7)
		{
			if(i<4) //공백은 감소, 별찍기는 증가
			{
				j=0;
				while(j<=2-i) {System.out.print(" "); j++;}
				k=0;
				while(k<=2*i) {System.out.print("*"); k++;}
			}
			else   //공백은 증가, 별찍기는 감소
			{
				while() {}
				while() {}
			}
			
			System.out.println();
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
