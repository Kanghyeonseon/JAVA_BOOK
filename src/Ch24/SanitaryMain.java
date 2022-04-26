package Ch24;
abstract class Sanitary { 
	//추상메서드 1개 이상 포함, 자체적으로 객체생성 불가
	//업캐스팅상태에서 하위객체 연결 시 재정의한 함수 접근 가능
	protected static int SharpPenCnt = 100;
	protected static int PencilCnt = 100;
	//protected : 상속관계에서 접근 가능
	
	abstract public void write();
	
	//추상클래스에서도 완성된 함수를 쓸 수 있다.
	void ShowInfo() {
		System.out.println("샤프 개수 : " + SharpPenCnt);
		System.out.println("연필 개수 : " + PencilCnt);
	}
	
}
class Pencil extends Sanitary {

	Pencil() {
		PencilCnt--;
		//Pencil객체를 불러왔을 때 PencilCnt를 하나 감소시키겠다.
	}
	@Override
	public void write() {
		System.out.println("연필을 씁니다.");
	}
}
class SharpPencil extends Sanitary {
	SharpPencil() {
		SharpPenCnt--;
	}
	
	@Override
	public void write() {
		System.out.println("샤프를 씁니다.");
	}	
}
public class SanitaryMain {
	public static void SanitaryWrite(Sanitary sa) {
									//참조변수
		sa.write();
		sa.ShowInfo();
		System.out.println();
	}
	public static void main(String[] args) {
//		Sanitary parentobject = new Sanitary();
		//부모클래스로 자체적으로 객체생성이 불가능하다.
		
//		Sanitary up;
//		up = new Pencil(); //하위객체 연결
//		up.write();			//Pencil에서 재정의한 write사용 가능
//		up = new SharpPencil(); //하위객체연결
//		up.write();			//Sharppen에서 재정의한 write사용 가능
		
		SanitaryWrite(new Pencil());
		SanitaryWrite(new Pencil());		
		SanitaryWrite(new SharpPencil());
	}
}
