package Ch25;

public class Main {
	public static void main(String[] args) {
	
		Employee emp1 = new Reguler("홍길동","달서구","010-111-2222",3000,"사원","인사부");
		//이름,주소,연락처,연봉,직책,부서 를 초기화 할 수 있는 생성자 구현 (super 예약어로 상위클래스 생성자호출할 것!)
		Temporary emp2 = new Temporary("이하늘","중구","010-333-4444",20000,100,20);
		//이름,주소,연락처,시급,근로시간,근로일수를 초기화 할 수 있는 생성자 구현(super 예약어로 상위클래스 생성자호출할 것!)

		emp1.ShowInfo();
		System.out.println();
		emp2.ShowInfo();
	}
}
