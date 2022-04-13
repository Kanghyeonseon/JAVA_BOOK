package Ch04;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {

		//문제
		//국어(kor) 영어(eng) 수학(mat) 점수를 Scanner로 입력받아
		//총합과 평균을 구해보세요
		//평균값은 소수점을 포함하여 출력합니다.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 영어, 수학 점수 입력 : ");
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		double avg =  (double)(sum)/ 3;
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
		sc.close();
		
		
	
		
		
	}

}
