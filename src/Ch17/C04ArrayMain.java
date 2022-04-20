package Ch17;

public class C04ArrayMain {
	public static void main(String[] args) {
		int [][] arr1 = new int [2][3];
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		arr1[1][0] = 40;
		arr1[1][1] = 50;
		arr1[1][2] = 60;
		
		System.out.println("행의 길이 : " + arr1.length);
		System.out.println("첫번째 행의 열의 길이 : " + arr1[0].length);
		System.out.println("두번째 행의 열의 길이 : " + arr1[1].length);
		
		for(int i =0;i<arr1.length;i++) {
					//1번째 행의 길이
			for(int j=0;j<arr1[i].length;j++) //열길이 반복
			{
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
	}
}
