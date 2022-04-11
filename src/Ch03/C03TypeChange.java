package Ch03;

public class C03TypeChange {

	public static void main(String[] args) {
int num1 = 129;
//00000000 00000000 00000000 10000001 int는 4바이트
//							 10000001 byte는 1바이트. 음수로 저장될 수 밖에 없다.

int num2 = 130;
//00000000 00000000 00000000 10000010
//							 10000010 byte는 1바이트. 음수로 저장될 수 밖에 없다.

byte ch1 = (byte)num1;
byte ch2 = (byte)num2;

System.out.println(ch1);
System.out.println(ch2);
		
	}

}


