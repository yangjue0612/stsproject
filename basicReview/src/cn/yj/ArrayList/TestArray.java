package cn.yj.ArrayList;

public class TestArray {
	Object[] value;
	int size;
	
	public TestArray() {
		value = new Object[16];
	
	}
	public TestArray(int size) {
		value = new Object[size];
		
	}
	public void add(Object obj) {
		value[size] = obj;
		size++;
		if(size>value.length) {
			int newCapacity = value.length*2;
			Object[] newList = new Object[newCapacity];
			for(int i=0;i<value.length;i++) {
				newList[i] = value[i];
			}
			value = newList;
		}
	}
	public Object get(int index) {
		if(index<0||index>size-1) {
			try {
				throw new Exception();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return value[index];
		
	}
	public static void main(String[] args) {
		TestArray list = new TestArray(2);
		list.add("aaa");
		list.add(new Human("Созе"));
		System.out.println(list.get(0));
	}

}
