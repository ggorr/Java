package reflection;

import java.lang.reflect.Field;

public class Demo04 {
	public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
		F obj = new F();
		Class<?> cls = obj.getClass();
		Field f0 = cls.getDeclaredField("s");
		System.out.println(f0.get(obj)); // obj.s ���
		
		Field f1 = cls.getDeclaredField("x");
		if(!f1.canAccess(obj))
			f1.setAccessible(true); // private�� ����
		f1.set(obj, 123); // obj.x = 123
		System.out.println(f1.get(obj)); // obj.x ���
	}

}

class F {
	public String s = "abc";
	private int x;
}