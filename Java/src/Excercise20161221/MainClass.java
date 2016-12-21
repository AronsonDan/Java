package Excercise20161221;

public class MainClass {

	public static void main(String[] args) {
		MyClass m1 = new MyClass(10);
		MyClass m2 = new MyClass(10, 20);
		System.out.println(MyClass.HELLOSTRING);
		m1.printMyClass();
		m2.printMyClass();
		System.out.println(m1.equals(m2));
	}

}
