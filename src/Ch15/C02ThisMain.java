package Ch15;
class C02Simple {
	//멤버
	int x;
	int y;
	int z;
	
	C02Simple(int x, int y, int z) {
		this.x=x;this.y=y;this.z=z;
	}
	
}


public class C02ThisMain {
	public static void main(String[] args) {
		C02Simple ob = new C02Simple(10,20,30);
	}
}
