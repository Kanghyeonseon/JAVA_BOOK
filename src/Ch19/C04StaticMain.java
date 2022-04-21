package Ch19;

class Client {
	String name;
	String phone;
	Client(String name, String phone) {
		this.name = name; this.phone=phone;
	}
}
class Restaurant {
	String Storename;	
	int roomcnt; 				//현재 지점의 룸의 수
	static int totalroomcnt;	//전체레스토랑 룸의 수 
	Client list[]; 				//아직 배열의 크기가 정해지지 않았다.
	int idx;					//list배열에 저장 될 객체의 위치 변동
	
	Restaurant(String name, int roomcnt) {
		Storename=name;				//지점 명 저장
		this.roomcnt=roomcnt;		//방 개수 저장
		totalroomcnt+=roomcnt;		//전체 방 개수 누적
		list = new Client[roomcnt]; //예약 손님 정보 저장용 배열
		idx =0;
	}
	
					//참조변수 불러오기
	void setReserve(Client client) {
		//roomcnt --
		//totalroomcnt --
		//배열참조변수에 client객체 연결
		if(roomcnt!=0) {
			roomcnt--;
			totalroomcnt--;
			
			//배열참조변수에 client 객체 연결
			list[idx]=client;
			idx++;			
		} else {
			System.out.println("예약 불가");
		}
	}
	void ShowClientInfo() {
		System.out.println("-----------------------------");
		System.out.println("지점명 : " + Storename);
		for(int i=0;i<idx;i++) {
			System.out.printf("%d . %s : %s\n",i+1,list[i].name
					,list[i].phone);
		}
		System.out.println("-----------------------------");
		
	}
	void Showinfo() {
		System.out.println("-----------------------------");
		System.out.println("지점명 : " + Storename);
		System.out.println("지점 잔여 Room : " + roomcnt);
		System.out.println("전체 잔여 Room : " + totalroomcnt);
		System.out.println("-----------------------------");

	}
}

public class C04StaticMain {
	public static void main(String[] args) {
		Restaurant 서가앤쿡반월당 = new Restaurant("반월당점", 10);
		Restaurant 서가앤쿡감삼점 = new Restaurant("감삼점", 10);
		
		서가앤쿡반월당.setReserve(new Client("홍길동1","010-1111-5555"));
		서가앤쿡반월당.setReserve(new Client("홍길동2","010-1111-5555"));
		서가앤쿡반월당.setReserve(new Client("홍길동3","010-1111-5555"));
		서가앤쿡감삼점.setReserve(new Client("홍길동4","010-1111-5555"));
		
		
		서가앤쿡반월당.Showinfo();
		서가앤쿡감삼점.Showinfo();
		
		서가앤쿡반월당.ShowClientInfo();
		서가앤쿡감삼점.ShowClientInfo();
		

		
	}
}
