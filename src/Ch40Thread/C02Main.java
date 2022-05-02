package Ch40Thread;

public class C02Main {
	public static void main(String[] args) {
		//작업스레드 객체 생성
		C02Worker1 worker1 = new C02Worker1();
		C02Worker2 worker2 = new C02Worker2();
		
		//독립된 스레드공간에 작업스레드 전달
		//실행흐름을 분리
		Thread th1 = new Thread(worker1);
		Thread th2 = new Thread(worker2);
		
		//스레드 실행
		th1.start();
		th2.start();
		
		//메인스레드에서 해야할 일 추가
		for(int i=0; i<10; i++) {
			System.out.println("메인스레드!");
			try { Thread.sleep(1000); } catch (Exception e) { }
		}
	}
}
