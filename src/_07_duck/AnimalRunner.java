package _07_duck;

public class AnimalRunner {
public static void main(String[] args) {
	
	Duck duck = new Duck(5, "Gerald");
	Cat cat = new Cat(1, "Omegatron The Twenty-Third, Destroyer Of Worlds");
	
	cat.meow();
	duck.quack();
	
	cat.eatTreat();
	duck.waddle();
	
	
}
}
