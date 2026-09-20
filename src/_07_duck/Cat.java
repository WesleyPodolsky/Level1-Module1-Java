package _07_duck;

public class Cat {

	private int age;
	private String furColor;

	public Cat(int age, String furColor) {
		this.age = age;
		this.furColor = furColor;
	}

	void meow() {
		System.out.println("meow");
	}
	void eatTreat() {
		System.out.println("nom nom");
	}

}
