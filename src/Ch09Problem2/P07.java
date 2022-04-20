
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
public class P07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("이번달 스케쥴 관리 프로그램.");
		System.out.println("할일(입력:1, 보기:2, 끝내기:3)>>");
		switch (num) {
			case 1 :
				System.out.printf("날짜(1~30)? ");
				int day = sc.nextInt();
			case 2 :
			case 3 :
		}
	}

}
