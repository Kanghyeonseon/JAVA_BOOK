package Test;

import java.util.Scanner;

public class Star2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("높이를 입력하세요.");
		int i=0; int j=0; int height = sc.nextInt();
		while(i<height) {
			j=0;
			while(j<height-i) {
				System.out.printf("*");
				j++;
			}
			
			System.out.println();
			i++;
		}
	}
}
