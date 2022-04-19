package Ch16;

public class C02StringMain {
	public static void main(String[] args) {
		String str1 = "자바는 ";
		String str2 = "참 재미가 있네요~~ㅎㅎ";
		String str3 = str1 + str2;
		
		System.out.println("문자열 길이 : " + str3.length());
		System.out.println("다섯 번째 문자 " + str3.charAt(4));
		System.out.println("\"자바\" 포함여부 : " + str3.contains("자바"));
		System.out.println("문자열 바꾸기 :" + str3.replace("자바", "JAVA"));

		String [] arr = str3.split(" ");
		System.out.println("나눠진 문자열 배열의 길이 : " + arr.length);
		System.out.println("나눠진 문자열 배열의 arr[0] : " + arr[0]);
		System.out.println("나눠진 문자열 배열의 arr[1] : " + arr[1]);
		System.out.println("나눠진 문자열 배열의 arr[2] : " + arr[2]);
		System.out.println("나눠진 문자열 배열의 arr[3] : " + arr[3]);
	}
}
