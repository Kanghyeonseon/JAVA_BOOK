package Ch25;

public class Reguler extends Employee{
	//속성
	
	private	int salary;
	private String title;
	public String depart;
	//생성자
	public Reguler(String name,String addr, String phone,int salary, String title, String depart) {
		super(name,addr,phone);
		this.salary = salary;
		this.title = title;
		this.depart = depart;
	}
	
	
	//기능
	void ShowInfo() {
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + addr);
		System.out.println("연락처 : " + this.getPhone());
									//private라서
		System.out.println("연봉 : " + salary);
		System.out.println("직책 : " + title);
		System.out.println("부서 : " + depart);

	}	

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}	
}
