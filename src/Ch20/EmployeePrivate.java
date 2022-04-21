package Ch20;
class Employee1 {
	//속성
	String name; String addr; private String phone;
	//아무말도없으면 public

	//생성자
	Employee1(String name, String addr, String phone) {	
		this.name=name;this.addr=addr;this.phone=phone;
	}	
	
	//기능
	public String getPhone() { return phone; }
	public void setPhone(String phone) { this.phone = phone; }
	void ShowBasicInfo () {
		System.out.println("이름\t주소\t연락처\t");
		System.out.printf("%s\t%s\t%s\n", name,addr,phone);
	}	

}
class Reguler1 extends Employee1 {
	//속성
	private int salary; private String title; 
	String depart;
	
	public int getSalary() { return salary; }
	public void setSalary(int salary) { this.salary = salary; }
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }

	//생성자
	Reguler1(String name, String addr, String phone
			, int salary, String title, String depart) {
		super(name, addr, phone);
		this.salary=salary;this.title=title;this.depart=depart;
	}	
	
	//기능
	void ShowRegInfo() {
		ShowBasicInfo(); //상위클래스의 내용을 가져다 쓰면 된다. 일일이 입력X
		System.out.println("연봉\t직책\t부서");
		System.out.printf("%d\t%s\t%s\n",salary, title, depart);
	}	
}

class Temporary1 extends Employee1 {
	//속성
	private int perPayment; private int workingHour; private int workingday;

	
	//생성자
	Temporary1(String name, String addr, String phone
			,int workingHour, int workingday) {
		super(name, addr, phone);
		this.workingHour=workingHour;this.workingday=workingday;
	}
	
	//기능
	public int getPerPayment() { return perPayment; }
	public void setPerPayment(int perPayment) { this.perPayment = perPayment; }
	public int getWorkingHour() { return workingHour; }
	public void setWorkingHour(int workingHour) { this.workingHour = workingHour; }
	public int getWorkingday() { return workingday; }
	public void setWorkingday(int workingday) { this.workingday = workingday; }
	
	void ShowTempInfo() {
		ShowBasicInfo();
		System.out.println("근로시간\t근무일수");
		System.out.printf("%d\t%d\n",workingHour, workingday);
	}

}

public class EmployeePrivate {
	public static void main(String[] args) {
		
		Reguler1 emp1 = new Reguler1("홍길동","달서구","010-1111-2222",3000,"사원","인사부");
		
		emp1.ShowRegInfo();
		System.out.println("----------------------");

		
		Temporary1 emp2 = new Temporary1("이하늘","중구","010-3333-4444",100,20);
		
		
		emp2.ShowTempInfo();
		
		
		
		
	}
}
