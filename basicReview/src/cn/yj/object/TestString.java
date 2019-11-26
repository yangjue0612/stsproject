package cn.yj.object;
/**
 * 测试可变字符序列
 * StringBuilder线程不安全，效率高
 * StringBuffer线程安全，效率低
 * @author yangjue
 *
 */

public class TestString {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder(32);
		StringBuilder sb3 = new StringBuilder("abcd");
		sb3.append("efg");
		sb3.append(true).append(321).append("祟拜你");
		System.out.println(sb3);
		System.out.println("###############");
		StringBuilder gh = new StringBuilder("a");
		for(int i=0;i<1000;i++) {
			gh.append(i);
		}
		System.out.print(gh);
	}

}
