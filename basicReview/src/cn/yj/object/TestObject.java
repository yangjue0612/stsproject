package cn.yj.object;

public class TestObject {
	public static void main(String[] args) {
		TestObject to = new TestObject();
		System.out.println(to.toString());
	}
	public String toString() {
		return "���Զ���";
	}

}
class Person2{
	String name;
	int age;
	@Override
	public String toString() {
		return name+"����:"+ age;
	}
	public Person2(String name,int age) {
		this.name = name;
		this.age = age;
	}
}
