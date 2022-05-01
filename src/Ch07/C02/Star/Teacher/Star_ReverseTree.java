package Ch07.C02.Star.Teacher;

import java.util.Scanner;

public class Star_ReverseTree {

	public static void main(String[] args) {
		//역트리
		Scanner sc = new Scanner(System.in);
		System.out.println("역트리를 출력합니다.\n높이를 입력해보세요.");
		int high = sc.nextInt();
		int i = 0; //개행
		int j = 0; //공백
		int k = 0; //별찍기
		while (i<high)
		{
			j=0;
			while(j<=i-1) { System.out.print(" "); j++;  }			
			k=0;
			while(k<=2*(high-i-1)) {System.out.print("*"); k++; }	
						//이부분이 가장 생각하기 어렵다!!		
			System.out.println();
			i++;
		}

	}

}
