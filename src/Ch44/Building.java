package Ch44;

public abstract class Building {
	//속성
	public int Health;
	public int Armmor;	
	//기능
	public abstract void Construct();
						//생성자라는 뜻이아님
	
	public abstract void UnderAttack(Unit u);	

}
