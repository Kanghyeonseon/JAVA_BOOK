package Ch32;

import java.util.ArrayList;
import java.util.List;

class Profile {
	String name; String addr; String phone;
	
	Profile(String name, String addr, String phone) {
		this.name=name; this.addr=addr; this.phone=phone;
	}

	@Override
	public String toString() {
		return "Profile [name=" + name + ", addr=" + addr + ", phone=" + phone + "]";
	}	
}

public class C03ArrayList {
	public static void main(String[] args) {
		List<Profile> list = new ArrayList();
		list.add(new Profile("홍길동", "대구", "010-2222-4444"));
		list.add(new Profile("정우균", "서울", "010-2232-4444"));
		list.add(new Profile("이태수", "대구", "010-5772-4444"));
		
		for(Profile temp : list) {
			System.out.println(temp.toString());
			//temp.name, temp.addr 이런식으로 접근하지 않게 toString해줌
		}
	}
}
