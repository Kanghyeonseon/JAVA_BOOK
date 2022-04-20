package Ch17;

import java.util.Scanner;

public class C03ArrayMain {
	public static void main(String[] args) {
		//1. 5칸 짜리 int 배열 생성 후
		//정수값을 각 배열요소에 차례대로 저장한 다음
		//모든 수의 합과 평균을 출력하세요.
		//2. 5칸 짜리 int 배열 생성 후
		//정수값을 각 배열요소에 차례대로 저장한 다음
		//최대값과 최소값을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("5칸 짜리 정수 배열을 만들어봅시다.");
		System.out.println("다섯개의 정수를 입력하세요.");
		
		int [] arr1 = new int [5];
				
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		int sum = 0; double avg;
		int max = arr1[0]; int min = arr1[0];

		for(int i=1;i<arr1.length;i++)
		//0부터 비교할 필요 없다.
		{
			sum+=arr1[i];			
			if(arr1[i]>max) max = arr1[i];
			if(min>arr1[i]) min = arr1[i]; 
		}
		avg = (double) sum/arr1.length;
		System.out.println("합은 : " + sum);
		System.out.println("평균은 : " + avg);
		System.out.printf("최대값은 : %d\n", max);
		System.out.printf("최소값은 : %d\n", min);
		
		
		
	}
}
