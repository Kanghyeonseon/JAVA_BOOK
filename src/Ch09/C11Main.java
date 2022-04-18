package Ch09;

public class C11Main {

	public static void main(String[] args) {
		C11Computer Lggram123 = new C11Computer();
		Lggram123.SN = "1-2-3-4";
//		Lggram123.CPUspec = "I7";
//		Lggram123.RAMspec = "16G";
		Lggram123.DISKSpec="1TB";
		
		Lggram123.StartApp("크롬어쩌고");
		Lggram123.StartApp("엑셀", "메모장");
//		Lggram123.showinfo();
	}

}
