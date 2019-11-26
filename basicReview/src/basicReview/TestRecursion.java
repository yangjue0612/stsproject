package basicReview;

public class TestRecursion {
	public static void main(String[] args) {
		System.out.println(fac(10));
		
		
	} 
	static long fac(int n) {
		if(n==1) {
			return 1;
			
		}else
			return n*fac(n-1);
	}
	

}
