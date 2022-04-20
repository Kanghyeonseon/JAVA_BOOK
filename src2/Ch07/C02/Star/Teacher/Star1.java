package Ch07.C02.Star.Teacher;

import java.util.Scanner;

public class Star1 {
	public static void main(String[] args) {
		
		

//		*
//		**
//		***
//		i	j : j : 0~i까지 반복한다.
//		0	0-0
//		1	0-1
//		2	0-2
//		3	0-3
		
		Scanner sc = new Scanner(System.in);
		System.out.println("대각 별찍기를 수행합니다.");
		System.out.println("높이를 입력하세요.");
		
		int i = 0; //0~3 개행에 필요한 변수
		int j = 0; //0~i 별찍기에 필요한 변수
		

		int high = sc.nextInt();		
		
		while(i<high)
		{
			j=0;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}			
			System.out.println();
			i++;
		}		
		
		
	}
}
