package Ch25;
//추상클래스로 변경
public abstract class Employee {
	//속성
	public String name;
	public String addr;
	private String phone;
	
	//생성자
	public Employee(String name, String addr, String phone) {
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	
	//기능
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//추상메서드로 변경
	abstract void ShowInfo();
	
	
	
}
