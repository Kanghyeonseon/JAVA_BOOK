package Ch23;
class Animal {
	void Sound() {
		System.out.println("소리를 냅니다.");
	}
}
class Dog extends Animal {
	void Sound() {
		System.out.println("개 멍멍 짖습니다.");
	}
}
class Cat extends Animal {
	
	@Override
	void Sound() {
		System.out.println("고양이는 야옹~");
	}
	
}
public class C01OverridingMain {
	public static void main(String[] args) {
		Dog poppi = new Dog();
		Cat yummi = new Cat();
		
		poppi.Sound();
		yummi.Sound();
	}
}
