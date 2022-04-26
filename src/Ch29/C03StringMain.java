package Ch29;

public class C03StringMain {
	public static void main(String[] args) {
		String obj = new String("JAVA is Powerful");
		System.out.println(obj);
		System.out.println(obj.toString());
		//Object를 그대로 쓰는게 아니라재정의된거다. 주소가 나오는게 아니라문자열이나온다.
		System.out.println(obj.hashCode());
		//Object클래스에서 그대로 쓰는게 아니라 재정의된것이다.
		
		
	}
}
