
package Ch09Problem2;

import java.util.Scanner;

class Day {
   private String work; //하루의 할 일을 나타내는 문자열   
   public void set(String work) { this.work = work; }   
   public String get() { return work; }   
   public void show() {
      if(work == null) System.out.println("없습니다.");
      else System.out.println(work+"입니다.");
   }
}

class MonthSchedule{
	String work;
	int day;
	Day list[] = new Day[30];
	int order=0;
	
	MonthSchedule(String work, int day) {
		this.work=work; this.day=day;
	}
	
	void input(Day day) {
		list[day]=day;
	}
	
	void view() {
		for(int i=0;i<30;i++) {
			System.out.printf("%d : %s\n",i+1, list[i]);
		}
	}
//	finish() {}
//	run() {}
}

public class P07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이번달 스케쥴 관리 프로그램.");
		System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>");		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 :
			System.out.printf("날짜(1~30)?");
			int day=sc.nextInt();
			System.out.println("할일(빈칸없이입력)?");
			String work=sc.next();					
			
			MonthSchedule april = new MonthSchedule(work,day);
			april.view();
			break;
		case 2 :
		case 3 :		
		}
		
		
		
		

	}
}
