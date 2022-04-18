package Ch09Problem2;
import java.util.Scanner;

class Circle {
   private double x, y;
   private int radius;
   public Circle(double x, double y, int radius) {
      this.x=x;this.y=y;this.radius=radius; //x, y, radius 초기화
   }
   public void show() {
	   System.out.println(x + "," + y + "," + radius);
   }
}

public class P05 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언
      for(int i=0; i < c.length; i ++) {
         System.out.print("x, y, radius >>");
         double x = sc.nextInt(); // x값 읽기.
         double y = sc.nextInt(); // y값 읽기.
         int radius = sc.nextInt(); // radius값 읽기.
         c[i] = new Circle(x, y, radius); // Circle 객체 생성
      }
      for(int i=0; i<c.length; i++) 
         c[i].show(); // 모든 Circle 객체 출력
      sc.close();
   }

}



