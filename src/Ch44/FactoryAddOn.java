package Ch44;

public class FactoryAddOn {
	public int Health;
	
	public void UnderAttack(Unit c) {
		Health--;
		//공격을 받으면 Health가 깎이고 Health가 0이면 건물이 붕괴되고
		//결과적으로 객체가 제거된다.
	}
}
