package cn.yj.object;

public class TestEncapsulation {
	public static void main(String[] args) {
		Human h = new Human();
		h.age = 13;
		h.name = "Созе";
		h.height = 230;
		
		Person4 p4 = new Person4();
		p4.age = 14;
		p4.setAge(-14);
		System.out.println(p4.getAge());
		
	}

}
class Boy extends Human{
	void sayHlello() {
		System.out.println(age);
	}
}
class Human{
	int age;
	int height;
	String name;
	
}
class Person4{
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
