
public class ClassFour implements NewInterfce {
	
	@Override
	public void method1(int b) {
	System.out.println(b);
	System.out.println("I am inside classfour subclass");
		
	}

	@Override
	public void method2(int age, String name) {
		System.out.println(age);
		System.out.println(name);
		
	}
}
