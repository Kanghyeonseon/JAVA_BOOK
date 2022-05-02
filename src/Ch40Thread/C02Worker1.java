package Ch40Thread;

public class C02Worker1 implements Runnable {

	@Override
	public void run() {
		//일꾼1이 해야할 일
		for(int i=0;i<5;i++) {
			System.out.println("TASK1");
			try {
				Thread.sleep(500);
				//0.5초단위
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}
}
