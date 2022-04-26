package Ch26.P4;

import java.util.Scanner;

class Converter {
	protected double ratio;
	void run() {}
	double Convert(double km) {return km/1.6;};
	
}
class Km2Mile extends Converter{
	Km2Mile(double ratio) {
		this.ratio=ratio;
	}
	@Override
	double Convert (double km) {		
		return km/ratio;
	}
	void run() {
		System.out.println("km을 mile로 바꿉니다.");
		System.out.printf("km을 입력하세요.>>");
		Scanner sc = new Scanner(System.in);
		ratio=sc.nextDouble();
		System.out.printf("변환 결과 : %.2fmile입니다.",Convert(ratio));
		
	}
}
public class ConverterMain {
	public static void main(String args[]) {
		   Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
		   toMile.run();		   
		}
}
