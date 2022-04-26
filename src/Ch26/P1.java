package Ch26;
class TV1{
	   private int size;
	   public TV1(int size) { this.size = size; }
	   protected int getSize() { return size; }
	   void printProperty() {}
	}
class ColorTV extends TV1 {
	int color;
	public ColorTV(int size, int color2) {
		super(size);
		this.color = color2;
	}
	@Override
	void printProperty() {
		System.out.printf("%d인치 %d컬러",getSize(),color);
	}	
}


public class P1 {
	public static void main(String[] args) {
		   ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty();
		}
}
