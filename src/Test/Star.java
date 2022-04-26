package Test;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		int i=0; int j=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("높이를 입력하세요.");
		int height=sc.nextInt();
		while(i<height) {
			j=0;
			while(j<=i) {
				System.out.printf("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}
