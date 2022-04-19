package Ch13.C00;

class TeokbokkiRecip {
	private void soakingteok() {System.out.println("떡불리기");}
	private void mixingsauce() {System.out.println("소스만들기");}
	private void knife() {System.out.println("야채손질");}
	private void boiling() {System.out.println("떡, 야채, 소스넣고 끓이기");}

	public void TCooking() {
	System.out.println("떡볶이 만들기!");
	soakingteok();
	mixingsauce();
	knife();
	boiling();
}
}
class Cook {
	TeokbokkiRecip Trecp = new TeokbokkiRecip();
	void Cooking() {
		Trecp.TCooking();
	}
}
public class CookMain {
	public static void main(String[] args) {
		Cook MrJung = new Cook();
		MrJung.Trecp.TCooking();
	}
}
