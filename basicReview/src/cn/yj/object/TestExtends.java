package cn.yj.object;

public class TestExtends {
	public static void main(String[] args) {
		
	
	Student Stu = new Student();
	Stu.name = "����";
	Stu.height = 178;
	Stu.rest();
	
	
	
	}
}
class Person{
	String name;
	int height;
	public void rest() {
		System.out.println("��Ҫ��Ϣһ��");
		
	}
}
class Student extends Person{
	
	public void study() {
		System.out.println("��ҪѧϰһС��");
	}
	
}
