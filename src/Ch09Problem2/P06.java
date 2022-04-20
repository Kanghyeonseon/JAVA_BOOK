package Ch09Problem2;

import java.util.Scanner;

class Circle2 {
	double x, y;
	int radius;
	int max;
	public Circle2(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius; // x, y, radius 초기화
	}
	public void show() {
		System.out.printf("%4.2f %4.2f %d",x,y,radius);
//		System.out.printf(x + "," + y + "," + radius);
	}


}
//가장 면적인 큰 원은 (2.5,2.7)6

public class P06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle2 c[] = new Circle2[3]; // 3개의 Circle 배열 선언
		
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			int x = sc.nextInt(); // x값 읽기.
			int y = sc.nextInt(); // y값 읽기.
			int radius = sc.nextInt(); // radius값 읽기.
			c[i] = new Circle2(x, y, radius); // Circle 객체 생성
			}
		for(int i=0; i<c.length; i++)  c[i].show();		
		int [] area = new int [3];		
		for(int i=0; i<c.length; i++) {
			area[i] = c[i].radius;
		}
		int max=area[0];
		for(int i=0;i<area.length;i++) {
			if(max<area[i]) max=area[i];
		}
		System.out.printf("가장 면적이 큰 원의 반지름은  : %d",max);

		
		
			
		
	sc.close();
		}

}
