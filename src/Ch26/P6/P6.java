package Ch26.P6;
class Point {
	   private int x, y;
	   public Point(int x, int y) { this.x = x; this.y = y; }
	   public int getX() { return x; }
	   public int getY() { return y; }
	   protected void move(int x, int y) { this.x =x; this.y = y; }
	}
class ColorPoint extends Point {
	String color;
	public ColorPoint(int x, int y) {
		super(x, y);
	}

	public ColorPoint() {
		super(0,0);color = "Black";
	}

	public void setXY(int i, int j) {
		i = getX(); j = getY(); 
	}
	@Override
	public String toString() {
		return color + "색의" + getX() +"," + getY() + "점입니다.";
	}

	public void setColor(String string) {
		this.color = string;
	}


	
	
}
public class P6 {
	public static void main(String[] args) {
		   ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
		   System.out.println(zeroPoint.toString() + "입니다.");
		   ColorPoint cp = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
		   cp.setXY(5,5);
		   cp.setColor("RED");
		   System.out.println(cp.toString()+"입니다.");
		}
}
