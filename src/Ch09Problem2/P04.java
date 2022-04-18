/*다음 멤버를 가지고 직사각형을 표현하는 Rectangle 클래스를 작성하라.

- int 타입의 x, y, width, height 필드: 사각형을 구성하는 점과 크기 정보
- x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
- int square() : 사각형 넓이 리턴
- void show() : 사각형의 좌표와 넓이를 화면에 출력
- boolean contatins(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
- main() 메소드의 코드와 실행 결과는 다음과 같다

(2,2)에서 크기가 8x7인 사각형
s의 면적은 36
t는 r을 포함합니다.*/

package Ch09Problem2;
class Rectangle{
	int x; int y; int width; int height;

	int square() {
		return width*height;
	}
	Rectangle(int x,int y, int width, int height) {
		this.x=x;this.y=y;this.width=width;this.height=height;
	}
	void show() {
		System.out.printf("(%d, %d) 에서 크기가 %dx%d인 사각형\n", x, y,width, height);

	}

	public boolean contains(Rectangle r) {
		if((this.x<r.x)&&(this.y<r.y)) {
			if((this.x+this.width)>(r.x+r.width)&&(this.y+this.width)>(r.y+r.width)) {
				return true;
			}
		}
		return false;
	}
	

}

public class P04 {
	public static void main(String[] args) {
		   Rectangle r = new Rectangle(2, 2, 8, 7);
		   Rectangle s = new Rectangle(5, 5, 1, 1);
		   Rectangle t = new Rectangle(1, 1, 10, 10);
		   
		   r.show();
		   System.out.println("s의 면적은 "+s.square());
		   if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		   if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
		   //함수 내부의 r, s는 주소를 반환한다. r의 값은 단 하나로 정해진 수가 아니다.
		}

}
