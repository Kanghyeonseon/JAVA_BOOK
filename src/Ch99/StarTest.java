package Ch99;

import java.util.Scanner;

public class StarTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("높이 입력 : ");
		int i=0; int j=0; int k=0;
		int height=sc.nextInt();		
		while(i<height) {
			j=0;
			while(j<height-i-1) {
				System.out.printf(" ");
				j++;
			}
			k=0;
			while(k<2*i+1) {
				System.out.printf("*");
				k++;
			}
			
			System.out.println();
			i++;
		}
	}
}
