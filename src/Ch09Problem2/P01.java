/*----------------------------
1
----------------------------
자바 클래스를 작성하는 연습을 해보자. 다음 main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV 클래스를 작성하라.

public static void main(String[] args) {
   TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
   myTV.show();
}
LG에서 만든 2017년형 32인치 TV*/

package Ch09Problem2;
class TV {
	String model; int year; int inch;
	TV(String model, int year, int inch) {
		this.model=model; this.year=year; this.inch=inch;
	}
	void show() {
		System.out.printf("%s에서 만든 %d년 %d인치",model, year, inch);
	}
	
}

public class P01 {
	public static void main(String[] args) {
		   TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
		   myTV.show();
		}
}
