package Ch19;
class Rectangle {
	static int x;
	static int y; //기준 좌표 x와 y를 스태틱으로 잡는다.
	int width;
	int height;
	
	Rectangle(int width, int height) {
		//스태틱을 제외한 변수만 생성자함수로 받아주면 된다.
		this.width=width;
		this.height=height;
	}
	
	//끝점 확인 기능
	void ShowEndPoint() {
		System.out.printf("끝점의 좌표는 (%d, %d)\n\n",x+width,y+height);
	}
	
	//모든 정보(시작점, 너비, 높이, 끝점, 넓이) 확인
	void ShowInfo() {
		System.out.printf("시작점 : (%d, %d)\n", x, y);
		System.out.printf("끝점 : (%d, %d)\n", x+width, y+width);
		System.out.printf("너비 : %d\n",width);
		System.out.printf("높이 : %d\n",height);
		System.out.printf("넓이 : %d\n\n",width*height);
		
		for(int j=0;j<20;j++) {
			for(int i=0;i<20;i++) {
				if(i==x) System.out.printf("*");
				else System.out.printf(" ");
				
			}
			System.out.println();
			if(j==y) System.out.printf("*");
			else System.out.printf(" ");
			
		}
		System.out.println("\n");
	}
}
public class C02StaticMain {
	public static void main(String[] args) {
		Rectangle.x = 7;
		Rectangle.y = 4;
		
		Rectangle rec1 = new Rectangle(10,10);
		Rectangle rec2 = new Rectangle(5,7);
		Rectangle rec3 = new Rectangle(6,5);
		rec1.ShowEndPoint();
		rec2.ShowEndPoint();
		rec3.ShowEndPoint();
		
		rec1.ShowInfo();
		rec2.ShowInfo();
		rec3.ShowInfo();
		
		
		
	}
}
