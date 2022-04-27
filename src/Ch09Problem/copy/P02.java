/*----------------------------
2.
----------------------------
--Position.java--
class Position{

}
--Main2.java--
public static void main(String[] args) {
   Position pos1 = new Position(10); //x좌표(int x)
   Position pos2 = new Position(30,40); //x좌표(int x),y좌표(int y)
   pos1.showpos();
   pos2.showpos();
}
[출력]
X : 10 , Y : 0
X : 30 , Y : 40

*/
package Ch09Problem.copy;
class Position{
	int x; int y;
	
	
	Position(int x, int y) {
		this.x=x;this.y=y;
	}
	Position(int x) {
		this.x=x;
	}
	
	void showpos() {
		System.out.printf("X : %d , Y : %d\n",x,y);
	}
	
	
}

public class P02 {
	public static void main(String[] args) {
		   Position pos1 = new Position(10); //x좌표(int x)
		   Position pos2 = new Position(30,40); //x좌표(int x),y좌표(int y)
		   pos1.showpos();
		   pos2.showpos();
		}	
}
