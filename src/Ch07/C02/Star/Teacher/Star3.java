package Ch07.C02.Star.Teacher;

import java.util.Scanner;

public class Star3 {
	public static void main(String[] args) {
//		정삼각트리출력문제
//--------------------------
//		트리를 출력합니다.
//		높이를 입력하세요.
//		6
//		     *
//		    ***
//		   *****
//		  *******
//		 *********
//		***********
		
		int i = 0; //행증가
		int j = 0; //공백
		int k = 0; //별
		Scanner sc = new Scanner(System.in);
		System.out.println("트리를 출력합니다.");
		System.out.println("높이를 입력하세요.");
		int high = sc.nextInt();
		
		while(i<high)
		{
			//공백찍기
			j = 0 ;
			while(j<=(high-2)-i) //high-2라는 점이 생각하기 어렵다.
			{
				System.out.print(" ");
				j++;
			}			
			//별찍기
			k = 0;
			while(k<=2*i) //별을 짝수개 출력하는 것 같아보이지만 아니다. 0부터니까 홀수개임.
			{
				System.out.print("*");
				k++;
			}			
			System.out.println();
			i++;
		}
		
		
		
	}
}
