package Ch33;

public class BookService implements Service {

	@Override
	public void Insert() {
		System.out.println("도서 등록!");
	}

	@Override
	public void Update() {
		System.out.println("도서 수정!");
		
	}

	@Override
	public void Delete() {
		System.out.println("도서 삭제!");
		
	}
	//도서등록
	//도서수정
	//도서삭제
	
}
