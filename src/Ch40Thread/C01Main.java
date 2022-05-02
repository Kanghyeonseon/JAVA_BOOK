package Ch40Thread;

public class C01Main {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println("TASK1");
			try {
				Thread.sleep(500);
				//0.5초단위
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		for(int i=0;i<5;i++) {
			System.out.println("TASK2");
			try {
				Thread.sleep(500);
				//0.5초단위
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
