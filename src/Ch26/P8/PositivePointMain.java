package Ch26.P8;
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
class PositivePoint extends Point {
	
	
	public PositivePoint() {
		super(0, 0);
	}

	public PositivePoint(int i, int j) {
		super(i, j);
		i = getX(); j =getY();
		if (i<0 || j<0) { move(i,j); }
		else 
		super.move(i, j);

		
	}
	@Override
	protected void move(int x, int y) 
	{
		if(x>0 && y>0) super.move(x, y);		
	}
	@Override
	public String toString() {
		return "(" + getX() +","+ + getY()+ ")의 점";
	}
	
	
	
}
public class PositivePointMain {
	public static void main(String[] args) {
//		   PositivePoint p = new PositivePoint();
//		   p.move(10, 10);
//		   System.out.println(p.toString()+"입니다.");
//		   p.move(-5,5); // 객체 p는 음수 공간으로 이동되지 않음
//		   System.out.println(p.toString()+"입니다.");
		   PositivePoint p2 = new PositivePoint(-5, 10);
		   System.out.println(p2.toString()+"입니다.");
		}
}
