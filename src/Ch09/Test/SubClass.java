package Ch09.Test;

import java.util.Scanner;

public class SubClass {
	//속성
	Scanner sc = new Scanner(System.in);
	//1번
	int sub1(int x, int y) {
		if(x>y) { return x-y; }
		else { return y-x; }
	}
	//2번
	void sub2() {
		System.out.println("두 수를 입력하세요.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int subt2 = 0;
		if(x>y) { subt2 = x-y; }
		else { subt2 = y-x; }
		System.out.println(subt2);
	}
	//3번
	void sub3(int x, int y) {
		int subt3;
		if(x>y) { subt3 = x-y; }
		else { subt3 = y-x; }
		System.out.println(subt3);
	}
	//4번
	int sub4() {
		System.out.println("두 수를 입력하세요.");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x>y) { return x-y; }
		else { return y-x; }
	}
}
