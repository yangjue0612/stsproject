package cn.yj.object;

public class TestPolym {
	public static void main(String[] args) {
		Animal a = new Animal();
		animalCry(a);
		Dog d = new Dog();
		animalCry(d);
	}
	
	static void animalCry(Animal a) {
		a.shout();
	}

}
class Animal{
	public void shout() {
		System.out.println("½ĞÁËÒ»Éù");
		
	}
}
class Dog extends Animal{
	public void shout() {
		System.out.println("ÍôÍôÍô£¡");
		
	}
}
class Cat extends Animal{
	public void shout() {
		System.out.println("ß÷ß÷ß÷£¡");
		
	}
}
