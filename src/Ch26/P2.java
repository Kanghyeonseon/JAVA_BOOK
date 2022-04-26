package Ch26;
class TV3 {
	   private int size;
	   public TV3(int size) { this.size = size; }
	   protected int getSize() { return size; }
	   //getSize하지않으면 size를 받아올 수 없다. 은닉
	   void printProperty() { }
}
class ColorTV2 extends TV3 {
	int color;
	ColorTV2(int size, int color2) {
		super(size);
		this.color = color2;
	}
}
class IPTV extends ColorTV2 {
	String IP;
	IPTV(String IP, int size, int color2) {
		super(size, color2);
		this.IP=IP;
	}
	@Override
	void printProperty() {
		System.out.printf("나의 IPTV는 %s 주소의 %d인치 %d컬러", IP, getSize(), color);
	}
	
	
}
public class P2 {
	public static void main(String[] args) {
		   IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
		   iptv.printProperty();
		}
}
