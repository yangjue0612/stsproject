package cn.yj.object;

public class TestExtends {
	public static void main(String[] args) {
		
	
	Student Stu = new Student();
	Stu.name = "杨珏";
	Stu.height = 178;
	Stu.rest();
	
	
	
	}
}
class Person{
	String name;
	int height;
	public void rest() {
		System.out.println("我要休息一会");
		
	}
}
class Student extends Person{
	
	public void study() {
		System.out.println("我要学习一小会");
	}
	
}
