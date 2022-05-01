package Ch08.for3;

import java.util.Scanner;

public class for9 {

	public static void main(String[] args) {
		// 높이(홀수값) : 3
		//  *
		// ***
		//  *
		Scanner sc = new Scanner(System.in);
		System.out.println("다이아몬드를 출력합니다. 높이를 입력하세요");
		int high = sc.nextInt();
		if(high%2==0) { System.out.println("홀수를 입력하세요"); 
		
		}else {
			
		
		for(int i = 0; i< high ; i++) {
			if(i<high/2) {
				for(int j=0;j<(high/2 -i);j++) {
					System.out.print(" ");
				}
				for(int k=0;k<2*i+1;k++) {
//확인				System.out.print(i);
					System.out.print("*");
				}
			}else {
				for(int j=0;j<(i-high/2);j++) {
					System.out.print(" ");
				}
				for(int k=0;k<2*(high-i)-1; k++) {
					System.out.print("*");
				}
				
			}
			
			System.out.println();
			
		}
		}
		sc.close();
		
		
		
		
	}

}
