package basicReview;

public class User2 {
	int id;
	String name;
	String pwd;
	static String company="舒娅特家纺";
	
	
	public User2(int id,String name) {//非静态方法
		this.id=id;
		this.name=name;
	}
	
	
	public void login() {//普通方法
		System.out.println("登录："+name);
	}
	
	
	public static void printCompany() {//静态方法
		System.out.println(company);
	}
	
	
	public static void main(String[] args) {
		User2 u = new User2(101,"杨林先");
		User2.printCompany();
		User2.company="安徽农业大学";
		User2.printCompany();
				
	}
			
			

}
