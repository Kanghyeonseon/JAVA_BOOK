package Ch06;

public class C03Switch2 {

	public static void main(String[] args) {
		int rank = 3;
		String medalColor;
		
		switch(rank)
		{
			case 1:
				medalColor = "금메달";
//				break;
			case 2:
				medalColor = "은메달";
//				break;
			case 3:
				medalColor = "동메달";
//				break;
			default:
				medalColor = "순위권 외";
		
		
		}
		System.out.println("메달 : " + medalColor);
	}

}
