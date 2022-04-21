package Ch20;
class Computer {
	String SN; String CPUSpec; String RAMSpec; String DISKSpec; 
	Computer(String SN, String CPUSpec, String RAMSpec, String DISKSpec) {
		this.SN=SN;this.CPUSpec=CPUSpec;this.RAMSpec=RAMSpec;this.DISKSpec=DISKSpec;
		//this를 하던 안 하던 상관없지만 값을 받아주어야한다.
	}
	void PowerOn() {
		System.out.println(SN + " 전원을 켭니다.");
	}
	void PowerOff() {
		System.out.println(SN + " 전원을 끕니다.");
	}
	void ShowInfo() {
		System.out.println("SN\tCPU\tRAM\tDISK");
		System.out.printf("%s\t%s\t%s\t%s\t",SN,CPUSpec,RAMSpec,DISKSpec);
	}
}
class NoteBook extends Computer {
	int battery;
	void Move() {
		System.out.println(SN + " 노트북이 이동합니다.");		
	}
	NoteBook(String SN, String CPUSpec, String RAMSpec, String DISKSpec,int battery) {
		super(SN, CPUSpec, RAMSpec, DISKSpec);
		System.out.println("노트북 생성자 호출~!");
		this.battery=battery;
	}
	
}


public class C02ComputerMain {
public static void main(String[] args) {
	
	NoteBook MyLgGram = new NoteBook("1-2-3-4","i7","16G","1T",100);
	MyLgGram.PowerOn();
	MyLgGram.PowerOff();
	System.out.println();
	MyLgGram.ShowInfo();
	System.out.println();
	MyLgGram.Move();	
}
}
