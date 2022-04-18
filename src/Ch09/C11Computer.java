package Ch09;


public class C11Computer{
	String SN;
	String CPUSpec;
	String RAMsepc;
	String DISKSpec;

public String StartApp(String app1) {
	System.out.println("실행 앱 개수 : 1");
	System.out.println(app1 +"을 실행합니다.");
	return app1;
}

public String StartApp(String app1, String app2) {
	System.out.println("실행 앱 개수 : 2");
	System.out.println(app1 + app2 + "를 실행합니다.");
	return app1 + app2;
}
}