
package Ch09Problem2;

import java.util.Scanner;

class MonthSchedule{
	String work;
	MonthSchedule(String Work) {
		this.work=Work;
	}

}

public class P07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이번달 스케쥴 관리 프로그램.");
		System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>");		
		int choice = sc.nextInt();
		MonthSchedule [] list = new MonthSchedule [30];




		switch (choice) {
		case 1 :
			System.out.printf("날짜(1~30)?");
			int day=sc.nextInt();
			System.out.println("할일(빈칸없이입력)?");
			String W=sc.next();
			list[day] = new MonthSchedule(W);
			System.out.println(list[1]);
			break;
			

		case 2 :
			for(int i=0;i<30;i++) {
				System.out.printf("%d 일 스케줄 : %s\n",i,list[i].work);
			}
		case 3 :
			System.out.println("끝냅니다.");
			break;
		}
		
		
		
		

	}
}
