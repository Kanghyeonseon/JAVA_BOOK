package Ch07.C03ReserveWord;

import java.util.Scanner;

public class WhileBreak {

	public static void main(String[] args) {
		//break
		//-1을 입력하기 전 까지 수를 계속 입력받아 입력된 수의 합을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요. 입력된 수의 합을 출력합니다.");
		int temp = 0;
		long sum = 0L; //누적용 변수
		while(true) {
			
			temp = sc.nextInt();
			
			if(temp==-1) {
				break; //가장 가까이에 있는 반복문을 탈출한다. 여기서는 while을 탈출한다.
			 			}
			sum+=temp;
			
		}
		System.out.println("총합 : " + sum);
		
		
		
		
	}

}
