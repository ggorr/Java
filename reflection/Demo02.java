package reflection;

public class Demo02 {
	public static void main(String[] args) {
		Class<?> cls = D.class;
		Class<?> superCls = cls.getSuperclass();
		System.out.println(superCls.getName());
		
		Class<?>[] interfaces = cls.getInterfaces();
		for(Class<?> interf : interfaces)
			System.out.println(interf.getName());
	}
}

class B {}
interface C {}
class D extends B implements C {}