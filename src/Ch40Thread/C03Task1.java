package Ch40Thread;

public class C03Task1 implements Runnable {
	//스윙의 컴포넌트에 접근하기 위해 생성자함수를추가
	C01GUI gui; //gui객체의 주소알고있는 참조변수를 추가했다.
	C03Task1(C01GUI gui) {
		this.gui = gui;
	}
	
	
	
	@Override
	public void run() {
		while(true) {
			gui.area1.append("TASK1........\n");
			try {
				Thread.sleep(500);
				//0.5초단위
				//인터럽트 발생 시 예외객체 생김 -> catch로 넘겨짐
				//sleep이 없어도 인터럽트는 걸린다.
				//sleep이 없으면 예외처리를 놓치게된다. catch이후의 구문이 실행되지 않는다.
				//안전하게 스레드를 종료시킨다는 말 자체가 예외를 처리할 수 있다는 말이다.
			} catch (Exception e) {
				break; //인터럽트가 발생하면 while문을 벗어난다.
			}
			
		}		
	}

}
