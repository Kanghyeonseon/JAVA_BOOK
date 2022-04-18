package Ch09Problem2;

import java.util.Scanner;

class Circle2 {
	private double x, y;
	private int radius;
	int max;
	

	public Circle2(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius; // x, y, radius 초기화
	}
				
	
	public void show() {
		System.out.println(x + "," + y + "," + radius);
		System.out.println(); }

}



public class P06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Circle2 c[] = new Circle2[3]; // 3개의 Circle 배열 선언

		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			int x = sc.nextInt(); // x값 읽기.
			int y = sc.nextInt(); // y값 읽기.
			int radius = sc.nextInt(); // radius값 읽기.
			c[i] = new Circle2(x, y, radius); // Circle 객체 생성
		}
//		Circle2 max= c[0];
		for (int c; c) {
			if(c[i][3]<max) {
				max = c[i];
			}
			c[i].show(); // 모든 Circle 객체 출력		
		}

	
		System.out.println("최대값 :" + max);
		

		sc.close();
	}

}
