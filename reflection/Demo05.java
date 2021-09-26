package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Demo05 {
	public static void main(String[] args) {
		Object obj = new G();
		Class<?> cls = obj.getClass();
		Method[] methods = cls.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println(m.getName());
			System.out.println(m.getReturnType().getName());
			System.out.print("parameters: ");
			if(m.getParameterCount() > 0) {
				Parameter[] params = m.getParameters();
				for (Parameter p :params)
					System.out.print(p.getType().getName() + ", ");
			} else
				System.out.print("no parameters");
			System.out.println();
		}
	}
}


class G {
	public void f() {}
	public String g(double x) {
		return Double.toString(x);
	}
}