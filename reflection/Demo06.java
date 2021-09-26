package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo06 {
	public static void main(String[] args)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		Object obj = new H();
		Class<?> cls = obj.getClass();
		Method m0 = cls.getDeclaredMethod("f");
		m0.invoke(obj);
		
		Method m1 = cls.getDeclaredMethod("g", double.class);
		Object rt = m1.invoke(obj, 12.3);
		System.out.println(rt);
	}
}

class H {
	public void f() {
		System.out.println("f »£√‚");
	}

	public String g(double x) {
		return Double.toString(x);
	}
}