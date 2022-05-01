package Ch06;

import java.util.Scanner;

public class C02IfProblem1 {

	public static void main(String[] args) {
		
		//score를 입력받아서
		//90점 이상이면 'A'
		//80이상 90미만이면 'B'
		//70이상 80미만이면 'C'
		//60이상 70미만이면 'D'
		//60점 미만이면 'F'
		System.out.println("점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A");
		} else if (score>=80) {
			System.out.println("B");
		} else if (score>=70) {
			System.out.println("C");
		} else if (score>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		sc.close();
		
		
	}

}
