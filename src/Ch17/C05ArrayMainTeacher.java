package Ch17;

import java.util.Scanner;

public class C05ArrayMainTeacher {
	public static void main(String[] args) {
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
		
		
		//배열형으로 바꿨다
		int [] students = new int[5];
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<scores[i].length;j++) {
				students[i] += scores[i][j];
			}
		}
		
		int subjects[] = new int[3]; //과목별 총점 저장
		for(int i=0; i<scores.length;i++) {
			for(int j=0; j<3;j++)
			subjects[j]+=scores[i][j];
			
		}
		
		
		
		//결과 출력
		System.out.println("\t국어\t영어\t수학\t총점\t평균");
		for(int i=0;i<scores.length;i++) {
			System.out.printf("%2d 학생\t",i+1);
			for(int j=0;j<scores[i].length;j++) {
				System.out.printf(scores[i][j]+"\t");
			}
			System.out.println(students[i]+ "\t" +(double)students[i]/3);
		}
		
		//결과 출력
		System.out.printf("총합\t%d\t%d\t%d\n",subjects[0],subjects[1],subjects[2]);
		System.out.printf("평균\t%.2f\t%.2f\t%.2f",(double)subjects[0]/3,(double)subjects[1]/3,(double)subjects[2]/3);
		
		

	}
}
