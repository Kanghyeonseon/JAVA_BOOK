package Ch08.for3;

public class for2 {
	public static void main(String[] args) {
		//전체 구구단을 역순출력합니다 
		//9 x 9 = 81
		//9 x 8 = 72
		//9 x 7 = 63
		//..
		//2 x 1 = 2
		
		for(int i=9;i>=2;i--) {
			for(int j=9; j>=1;j--) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		
		
		
	}
}
