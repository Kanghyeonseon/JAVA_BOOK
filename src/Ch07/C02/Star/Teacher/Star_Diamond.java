package Ch07.C02.Star.Teacher;

import java.util.Scanner;

public class Star_Diamond {

	public static void main(String[] args) {
		//WhileInWhile9를 푼 문제이다.
		
		int i = 0; //개행
		int j = 0; //공백
		int k = 0; //별찍기
		Scanner sc = new Scanner(System.in);
		System.out.println("다이아몬드를 출력합니다.\n높이를 입력하세요.\n홀수만 입력받습니다.");
		int high = sc.nextInt();
		
		
		while(i<high)
		{
			if(i<high/2) //공백은 감소, 별찍기는 증가
				//매우어렵다 매우!!
			{
				j=0;
				while(j<=(high/2)-i-1) {System.out.print(" "); j++;}
				k=0;
				while(k<=2*i) {System.out.print("*"); k++;}
			}
			else   //공백은 증가, 별찍기는 감소
			{
				j=0;
				while(j<=i-(high/2+1)) {System.out.print(" "); j++;}
						//!!!!!!!!!!!!!!!!
				k=0;
				while(k<=(high-1-i)*2) {System.out.print("*"); k++;}
						//!!!!!!!!!!!!!!!!!
			}
			
			System.out.println();
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
