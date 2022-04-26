package Ch26.P5TEST;

//toString이뭘까? object라는 이름의 클래스는 기본적으로 상속으로만들어진다.
//객체 안의 내용을 보여주기 위한 용도로만든다.
class Simple {
	int x; int y; int z;

	public Simple(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		return "Simple [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	//저장된멤버들을 보여준다.
	
	
}
public class TestMain {
	public static void main(String[] args) {
		Simple tmp = new Simple(10,20,30);
		System.out.println(tmp.toString());
	}
}
