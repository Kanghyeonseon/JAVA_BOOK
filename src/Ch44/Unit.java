package Ch44;

public abstract class Unit {
	public String name; public int health;
	
	public abstract void Move();
	public abstract void UnderAttack(Unit c);
}
