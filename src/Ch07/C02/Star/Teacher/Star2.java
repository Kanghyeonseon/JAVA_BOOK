package Ch07.C02.Star.Teacher;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		//트리만드는 문제 나온다. 다이아몬드는 안 나온다.
		Scanner sc = new Scanner(System.in);
		System.out.println("역순 반쪽 트리를 출력합니다.");
		System.out.println("높이를 입력하세요.");
		int high = sc.nextInt();
		int i = 0;
		int j = 0;
		while (i<high+1)
		{
			j=0;
			while(j<=high-i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			
			
		}
		
	
	}

}
