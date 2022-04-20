package Ch18;

public class C03ArrayCopy {
	public static void main(String[] args) {
		int arr1[] = {10, 20, 30};
		//arr1은 배열이고, 참조변수이다.
		int arr2[];
		
		arr2 = arr1;
		//얕은복사 : 주소값복사
		//arr1이 가지고있던 힙 영역에 접근한다.
		//같은 객체를 가리키고있는 두 개의 참조변수이다.
		
		//깊은 복사
		arr2=new int[3];
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = arr1[i];
		}
		
		
		for(int i = 0;i<arr2.length;i++) {
			System.out.printf("arr[%d]=%d\n",i,arr2[i]);
		}
		
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		System.out.println();
		for(int i=0;i <arr2.length;i++) {
			System.out.printf("arr[%d]=%d\n",i,arr2[i]);
		}
	}
}
