package Ch08.for3;

public class for7 {
	public static void main(String[] args) {
		// 높이 : 3
		//   *
		//  ***
		// *****	
		int high=3;
			
		
		for(int i=0; i<high; i++) {
			for(int j = 0; j <high-i ;j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*i +1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
