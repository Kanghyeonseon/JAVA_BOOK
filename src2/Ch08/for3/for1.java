package Ch08.for3;

public class for1 {
	public static void main(String[] args) {
		//전체 구구단을 역순출력합니다 
		//9 x 1 = 9
		//9 x 2 = 18
		//..
		//2 x 1 = 2
		//..
		//2 x 9 = 18
		for(int i=2;i<=9;i++) {
			for(int j=1; j<=9;j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		
		
		
	}
}
