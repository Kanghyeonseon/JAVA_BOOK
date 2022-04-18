package Ch09;

class C14Computer
{
	//속성
	String SN;
	String CPUSpec;
	String RAMSpec;
	
	String DISKSpec;
	
	//생성자
	C14Computer(String SN, String CPU, String RAM, String DISK) {
		this.SN=SN; this.CPUSpec=CPU; this.RAMSpec=RAM; this.DISKSpec=DISK;
	}
	
	
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
		System.out.printf("%s\n%s\n%s\n%s",SN, CPUSpec,RAMSpec,DISKSpec);
	}
	
}

public class C14ComputerMain {

	public static void main(String[] args) {
		C14Computer Lggram123 = new C14Computer("1-2-3-4","I7","16G","1TB");
		

		
		Lggram123.StartApp("크롬어쩌고");
		Lggram123.StartApp("엑셀", "메모장");
		Lggram123.ShowInfo();
	}

}
