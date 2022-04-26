package Ch26.P5;
class Point {
	   private int x, y;
	   
	   public Point(int x, int y) { this.x = x; this.y = y; }
	   
	   public int getX() { return x; }
	   public int getY() { return y; }
	   protected void move(int x, int y) { this.x =x; this.y = y; }
	   //move라는 메소드를 건드리지 않고 같은 기능을 하는 메소드를 만들기 위해서
	   //상속기능을 이용하였다.

	   
}
class ColorPoint extends Point {
	String color;
	public ColorPoint(int x, int y, String color) {
		super(x, y); this.color=color;
	}
	@Override
	public int getX() {
		return super.getX();
	}
	@Override
	public int getY() {
		return super.getY();
	}
	@Override
	protected void move(int x, int y) {
		super.move(x, y);
	}
	void setXY(int x, int y) {
		move(x,y);
	}
	void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Point [x=" + getX() + ", y=" + getY() + "]";
	}
	
	
	
}

public class PointMain {
	public static void main(String[] args) {
		   ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		   cp.setXY(10, 20);
		   cp.setColor("RED");
		   String str = cp.toString();
		   System.out.println(str+"입니다. ");
		}
}
