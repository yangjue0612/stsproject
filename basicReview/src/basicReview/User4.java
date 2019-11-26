package basicReview;

public class User4 {
	int id;
	String name;
	String pwd;
	
	public User4(int id,String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public void testParameterTransfer01(User4 u) {
		u.name = "yangjue";
	}
	
	public static void main(String[] args) {
		User4 u1 = new User4(100,"yangju");
		u1.testParameterTransfer01(u1);
		System.out.println(u1.name);
	}

}
