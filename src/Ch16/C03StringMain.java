package Ch16;

public class C03StringMain {
	public static void main(String[] args) {
		String str = "Twinkle Twinkle Little Star";
		System.out.println("길이 출력 : " + str.length());
		System.out.println("2,3,4 인덱스 추출 : " + str.charAt(2)
		+ "+" + str.charAt(3) + "+" + str.charAt(4));
		System.out.println("대문자로 출력 : " + str.toUpperCase());
		System.out.println("소문자로 출력 : " + str.toLowerCase());
		
	}
}
