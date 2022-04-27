package Ch33;

public class MemberService implements Service {

	@Override
	public void Insert() {
		System.out.println("회원 가입!");
	}

	@Override
	public void Update() {
		System.out.println("회원 수정!");		
	}

	@Override
	public void Delete() {
		System.out.println("회원 삭제!");		
	}
	//회원조회
	//회원수정
	//회원삭제
	
}
