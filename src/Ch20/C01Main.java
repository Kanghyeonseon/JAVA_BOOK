package Ch20;
//상위클래스 or 수퍼클래스 or 부모클래스
class Point2D {
	int x; int y; //기존 멤버변수
	Point2D() {
		System.out.println("2D 디폴트 생성자 호출");
	}
	void ShowXY() {
		System.out.printf("X = " + x + ", Y = " + y);		
	}
}

//하위클래스 or 서브클래스 or 자식클래스
class Point3D extends Point2D {
	int z; //추가된 멤버변수
	Point3D() {
		System.out.println("3D 디폴트 생성자 호출!");
	}
	void ShowXYZ() {
		ShowXY();
		System.out.printf(", Z = " + z);
	}
}

public class C01Main {
	public static void main(String[] args) {
		Point3D position1 = new Point3D();
		position1.x=10;
		position1.y=20;
		position1.z=30;
		position1.ShowXYZ();				
	}
}
