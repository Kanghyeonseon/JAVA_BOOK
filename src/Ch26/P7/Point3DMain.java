package Ch26.P7;
class Point {
	   private int x, y;
	   
	   public Point(int x, int y) { this.setX(x); this.setY(y); }
	   
	   public int getX() { return x; }
	   public int getY() { return y; }
	   protected void move(int x, int y) { this.setX(x); this.setY(y); }
	   //move라는 메소드를 건드리지 않고 같은 기능을 하는 메소드를 만들기 위해서
	   //상속기능을 이용하였다.
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	} 
}
class Point3D extends Point {
   int z;   
   public Point3D(int x, int y, int z) {
	   super(x,y);
	   this.z=z;
   }
   public int getZ() { return z; }
   protected void move(int x, int y, int z)  { 
	   this.setX(x);this.setY(y);this.z=z;
	   }


   public void moveUp() {
	   move(getX(),getY(),getZ()+1);
}

   public void moveDown() {
	   move(getX(),getY(),getZ()-1);
}

@Override
public String toString() {
	return "("+getX() +","+ getY() +"," + z +")의 점" ; }	   
}
public class Point3DMain {
	public static void main(String[] args) {
		   Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z축의 값.
		   System.out.println(p.toString()+"입니다.");
		   p.moveUp(); // z 축으로 위쪽 이동
		   System.out.println(p.toString()+"입니다.");
		   p.moveDown(); // z 축으로 아래쪽 이동
		   p.move(10, 10); // x, y 축으로 이동
		   System.out.println(p.toString()+"입니다.");
		   p.move(100,  200, 300); // x, y, z축으로 이동
		   System.out.println(p.toString()+"입니다.");
		}
}
