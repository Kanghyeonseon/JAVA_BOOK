package Test;

import java.util.Scanner;

public class Star5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("높이를 입력하세요.");
		int i=0; int j=0; int k=0;
		int height = sc.nextInt();
		
		while(i<height) {
			if(i<height/2) {
				j=0;
				while(j<(height)/2-i) {
					System.out.printf(" ");
					j++;
				}
				k=0;
				while(k<2*i+1) {
					System.out.printf("*");
					k++;
				}				
			} else {
				j=0;
				while(j<i-height/2) {
					System.out.printf(" ");
					j++;
				}
				k=0;
				while(k<2*height-2*i-1) {
					System.out.printf("*");
					k++;
				}				
			}				
			System.out.println();
			i++;
		}
	}
}
