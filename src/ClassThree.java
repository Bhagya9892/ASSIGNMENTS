
public class ClassThree implements NewInterfce{

	@Override
	public void method1(int a) {
		System.out.println("I am inside Class three subclass"+a);
		
	}

	@Override
	public void method2(int age, String name) {
		System.out.println(age);
		System.out.println(name);
		
	}
	
	
	public static void main(String[] args) {
		ClassThree classThree = new ClassThree();
		classThree.method1(50);
		ClassFour classFour = new ClassFour();
		classFour.method1(40);
		classThree.method2(28, "Bhagya");
		classFour.method2(4, "Rithwika");
	}


	
	

}
