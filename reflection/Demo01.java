package reflection;

public class Demo01 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<A> cls0 = A.class;
		System.out.println(cls0.getName());

		Class<?> cls1 = Class.forName("reflection.A");
		System.out.println(cls0 == cls1);

		A a = new A();
		Class<?> cls2 = a.getClass();
		System.out.println(cls0 == cls2);
	}
}

class A {
}