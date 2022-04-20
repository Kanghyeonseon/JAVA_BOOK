package Ch17;

import java.util.Scanner;

public class C05ArrayMain {
	public static void main(String[] args) {
		//1. 문제
		//5명의 학생의 국, 영, 수학 점수를 입력받아 출력합니다.
		//2차원 배열을 사용합니다.
		//int scores[][] = new int [5][3]
		//학생별 총점과 평균
		//국어, 영어, 수학별 총점과 평균도 함께 출력합니다.
		//[출력예]
		//1. 학생점수입력(국/영/수 순서) : 100 70 60
		//2. 학생점수입력(국/영/수 순서) : 87 54 61
		//3. 학생점수입력(국/영/수 순서) : ...
		//4. 학생점수입력(국/영/수 순서)
		//5. 학생점수입력(국/영/수 순서)
		
		//1. 학생 총점 : ?, 평균 : ?
		//...
		
		//국어 총점 : ?, 평균 : ?
		Scanner sc = new Scanner(System.in);
		int scores[][] = new int [5][3];
		System.out.println("입력해보세요.");
		for(int i =0;i<scores.length;i++) {
					//행 수 만큼 반복 (5행임)
			System.out.printf("학생 %d 점수 입력 : ",i+1);
			for(int j=0;j<scores[i].length;j++) {
					//i행의 수 만큼 반복 (3과목임)
				scores[i][j] = sc.nextInt();
			}
		}System.out.println();	
		
		
		

		
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<scores[i].length;j++) {
				sum+=scores[i][j];
			}					
			System.out.printf("학생 %d 총점 : %3d, 평균 : %5.1f\n",i+1,sum,(double)sum/scores[i].length);
			sum=0;
		}
		System.out.println();		
		
		for(int j=0;j<scores[j].length;j++) {
			for(int i=0;i<scores.length;i++) {
				sum+=scores[i][j];
			}
		System.out.printf("과목 %d 총점 : %3d, 평균 : %5.1f\n", j, sum,(double)sum/scores.length);
		sum=0;
		}		
	}
}
