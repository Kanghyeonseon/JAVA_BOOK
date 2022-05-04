package Ch44;

public class Factory extends Building implements FlyToTheSky {
	
	public FactoryAddOn Fadd;
	//외부에 노출 될 필요는없지만 public으로 설정
	
	public void AddOn(FactoryAddOn tmp) {
	}	
	
	@Override
	public void Construct() {
	}

	@Override
	public void UnderAttack(Unit u) {
	}

	@Override
	public void SetDown() {
	}

	@Override
	public void TakeOff() {
	}
}
