package Ch20;
class Employee {
	String name; String addr; String phone;

	Employee(String name, String addr, String phone) {
		this.name=name;this.addr=addr;this.phone=phone;
	}
	void ShowBasicInfo () {
		System.out.printf("이름 : %s, 연락처 : %s", name, phone);
	}
}
class Reguler extends Employee {
	int salary; String title; String depart;
	void ShowRegInfo() {
		System.out.printf("이름 : %s, 주소 : %s, 연락처 : %s\n",name,addr,phone);
		System.out.printf("연봉 : %d, 직책 : %s, 부서 : %s\n",salary, title, depart);
	}
	Reguler(String name, String addr, String phone
			, int salary, String title, String depart) {
		super(name, addr, phone);
		this.salary=salary;this.title=title;this.depart=depart;
	}
}

class Temporary extends Employee {
	int perPayment; int workingHour; int workingday;
	Temporary(String name, String addr, String phone
			,int workingHour, int workingday) {
		super(name, addr, phone);
		this.workingHour=workingHour;this.workingday=workingday;
	}
	void ShowTempInfo() {
		System.out.printf("이름 : %s, 주소 : %s, 연락처 : %s\n",name,addr,phone);
		System.out.printf("근로시간 : %d, 근무일수 : %d",workingHour, workingday);
	}

}

public class EmployeeMain {
	public static void main(String[] args) {
		
		Reguler emp1 = new Reguler("홍길동","달서구","010-1111-2222",3000,"사원","인사부");
		emp1.ShowRegInfo();
		System.out.println();
		
		Temporary emp2 = new Temporary("이하늘","중구","010-3333-4444",100,20);
		emp2.ShowTempInfo();
		
	}
}
