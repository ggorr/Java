package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo07 {

	public static void main(String[] args) 
			throws ClassNotFoundException, NoSuchMethodException,
			InstantiationException, IllegalAccessException,
			InvocationTargetException {
		Class<?> cls = Class.forName("reflection.K");
		Constructor<?> con0 = cls.getConstructor();
		Object obj0 = con0.newInstance();
		if (obj0 instanceof K)
			K.class.cast(obj0).f(); // ((CC) obj0).f();

		Constructor<?> con1 = cls.getConstructor(int.class, String.class);
		Object obj1 = con1.newInstance(123, "abc");
	}
}

class K {
	public K() {
	}

	public K(int x, String y) {
	}

	public void f() {
		System.out.println("f »£√‚");
	}
}