package Ch40Thread;

public class C03Task2 implements Runnable{
	C01GUI gui;
	C03Task2(C01GUI gui) {
		this.gui = gui;
	}
	
	
	@Override
	public void run() {
		while(true) {
			gui.area2.append("TASK2........\n");
			try {
				Thread.sleep(500);
				//0.5초단위
			} catch (Exception e) {
//				e.printStackTrace();
				break;
			}			
		}		
	}

}
