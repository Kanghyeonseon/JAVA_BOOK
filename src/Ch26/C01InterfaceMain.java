package Ch26;
interface RemoteControler {
	int MAXVOL = 100; //public static final
	int MINVOL = 0;	  //public static final
	void On(); //추상메서드
	void Off();//추상메서드
	void SetVol(int num); //추상메서드
}
class TV implements RemoteControler {
	int volume;
	@Override
	public void On() {
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void Off() {
		System.out.println("TV를 끕니다.");
	}
	@Override
	public void SetVol(int num) {
		if(num>MAXVOL) volume = MAXVOL; 
		else if(num<MINVOL) volume = MINVOL;
		else volume=num;
		System.out.println("볼륨 : " + num);
	}
	
}
class Radio implements RemoteControler {
	int volume;
	@Override
	public void On() {
		System.out.println("라디오를 켭니다.");
	}
	@Override
	public void Off() {
		System.out.println("라디오를 끕니다.");
	}
	@Override
	public void SetVol(int num) {
		if(num>MAXVOL) volume = MAXVOL; 
		else if(num<MINVOL) volume = MINVOL;
		else volume=num;
		
		System.out.println("볼륨 : " + num);
	}
	
}
public class C01InterfaceMain {
	public static void 아빠의오른팔(RemoteControler remocon, int num) {
		remocon.On();
		remocon.Off();
		remocon.SetVol(num);
		System.out.println();
	}
	public static void main(String[] args) {
		아빠의오른팔(new TV(), 101);
				//리모콘에 연결 할 객체를 TV로 한다.
		아빠의오른팔(new Radio(), 10);
	}
}
