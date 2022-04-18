package Ch09;

class C11Computer1
{
	String SN;
	String CPUSpec;
	String RAMSepc;
	String DISKSpec;
	//기능
	int StartApp(String app1) {
		System.out.println(app1 + "을 실행합니다.");
		return 1; 
		//!!!!!!!!!!!!!!!!!!!!몰랐던 부분
		//문자를 출력하면서 함수값은 1을가지는방법이다.
	}
	int StartApp(String app1, String app2) {
		System.out.println(app1 +", " + app2 + "을 실행합니다.");
		return 2;
	}
	void ShowInfo() {
		System.out.printf("%s\n%s\n%s\n%s",SN, CPUSpec,RAMSepc,DISKSpec);
	}
	
}

public class C11ComputerMain {

	public static void main(String[] args) {
		C11Computer1 Lggram123 = new C11Computer1();
		
		Lggram123.SN = "1-2-3-4";
		Lggram123.CPUSpec = "I7";
		Lggram123.RAMSepc = "16G";
		Lggram123.DISKSpec="1TB";
		
		Lggram123.StartApp("크롬어쩌고");
		Lggram123.StartApp("엑셀", "메모장");
		Lggram123.ShowInfo();
	}

}
