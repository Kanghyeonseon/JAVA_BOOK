/*[출력]
이름 : 홍길동
부서 : 인사부
직책 : 사원
급여 : 3000

이름 : 홍길동
부서 : 총무부
직책 : 대리
급여 : 4000
*/

package Ch09Problem.copy;
class Employee {
	//name,dept,role,salary
	String name; String dept; String role; String salary;
	
	Employee(String name, String dept, String role, String salary) {
		this.name = name; this.dept = dept; this.role = role; this.salary=salary;
	}
	void showInfo() {
		System.out.println("이름 : " + name );
		System.out.println("부서 : " + dept);
		System.out.println("직책 : " + role);
		System.out.println("급여 : " + salary);
		System.out.println();
	}
	void setDept(String dept) {
		this.dept = dept;
//		System.out.println("부서 : " + dept);
	}
	void setRole(String role) {
		this.role = role;
//		System.out.println("직책 : " + role);
	}
	void setSalary(String salary) {
		this.salary=salary;
//		System.out.println("급여 : " + salary);
	}
}

public class P04 { 

	public static void main(String[] args) {
		   Employee emp1 = new Employee("홍길동","인사부","사원","3000");//name,dept,role,salary
		   emp1.showInfo();
		   System.out.println();
		   emp1.setRole("대리");
		   emp1.setDept("총무부");
		   emp1.setSalary("4000");
		   emp1.showInfo();
		}

}
