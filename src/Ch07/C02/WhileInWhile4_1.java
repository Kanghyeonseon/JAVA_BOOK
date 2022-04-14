package Ch07.C02;

import java.util.Scanner;

public class WhileInWhile4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int i = 1; //개행에 사용되는 변수
		int j = 1; //별개수에 사용되는 변수
		System.out.println("높이와 별 개수를 차례로 입력하세요.");
		int high = sc.nextInt();
		int star = sc.nextInt();

		
		while (i<=high)
		{
			j=1;
			while(j<=star)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
