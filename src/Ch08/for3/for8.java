package Ch08.for3;

import java.util.Scanner;

public class for8 {
	public static void main(String[] args) {
		// 높이 : 3
		// *****
		//  ***
		//   *
		Scanner sc = new Scanner(System.in);
		System.out.println("역삼각트리를 생성합니다.");
		System.out.println("높이를 입력하세요.");
		int high = sc.nextInt();
		for(int i=0; i<high ; i++) {
			for( int j=0;j<i+1;j++) {
				System.out.print(" ");
			}	
			for(int k=0; k<2 *(high-i)-1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		sc.close();
		
		
	}

}
