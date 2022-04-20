package Ch17;

public class C04ArrayMain2 {
	public static void main(String[] args) {
		int [][] arr2 = 
			{
					{10,20,30},//0번 행
					{40,50,60},//1번 행
					{70,80,90}, //2번 행
					{70,80,90}
			};
		System.out.println("전체 행의 길이 : " + arr2.length);
		System.out.println("0번째 행의 길이 : " + arr2[0].length);
		System.out.println("1번째 행의 길이 : " + arr2[1].length);
		System.out.println("2번째 행의 길이 : " + arr2[2].length);
		System.out.println("3번째 행의 길이 : " + arr2[3].length);
	}
	
}
