/*----------------------------
3.
----------------------------
--Simple--
class Simple{

}
--Main3.java--
public static void main(String[] args) {
   Simple pos1 = new Position(10); //x좌표(int x)
   Simple pos2 = new Position(30,40); //x좌표(int x),y좌표(int y)
   pos1.showpos();
   pos2.showpos();
}
*/

package Ch09Problem;
class Simple{
	int x; int y;
	
	Simple(int x, int y) { 
		this.x = x; this.y=y;
	}
	Simple(int x) { 
		this.x = x;
	}
	
	void showpos() {
		System.out.printf("x좌표 : %d, y좌표 : %d\n",x,y);
	}
	
	
	
}


public class P03 {

	public static void main(String[] args) {
		Simple pos1 = new Simple(10); //x좌표(int x)
		Simple pos2 = new Simple(30,40); //x좌표(int x),y좌표(int y)
		pos1.showpos();
		pos2.showpos();
		}

}
