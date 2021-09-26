package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Demo03 {
	public static void main(String[] args) {
		Object obj = new E();
		Class<?> cls = obj.getClass();
		Field[] fields = cls.getDeclaredFields();
		
		for (Field f:fields) {
			System.out.println(f.getName());
			if(Modifier.isPrivate(f.getModifiers()))
				System.out.println("private field");
			else
				System.out.println("non-private field");
			Class<?> c = f.getType();
			System.out.println(c.getName());
			System.out.println(f.canAccess(obj));
			System.out.println();
		}
	}
}

class E {
	private int x;
	public String y;
}