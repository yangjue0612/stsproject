package cn.yj.object;
/**
 * ���Կɱ��ַ�����
 * StringBuilder�̲߳���ȫ��Ч�ʸ�
 * StringBuffer�̰߳�ȫ��Ч�ʵ�
 * @author yangjue
 *
 */

public class TestString {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder(32);
		StringBuilder sb3 = new StringBuilder("abcd");
		sb3.append("efg");
		sb3.append(true).append(321).append("�����");
		System.out.println(sb3);
		System.out.println("###############");
		StringBuilder gh = new StringBuilder("a");
		for(int i=0;i<1000;i++) {
			gh.append(i);
		}
		System.out.print(gh);
	}

}
