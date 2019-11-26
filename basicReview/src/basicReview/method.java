package basicReview;

public class method {
	
	public static void main(String[] args) {
		System.out.println (add(5,6,7));
		System.out.println(add(8,9));
		
	}
	//方法重载，方法名称相同，形参个数不同，可以同时调用
		public static int add (int a,int b,int c) {
			int sum = a+b+c;
			return sum;
			
		}
		public static  int add (int a,int b) {
			int sum = a+b;
			return sum;
	}
}


