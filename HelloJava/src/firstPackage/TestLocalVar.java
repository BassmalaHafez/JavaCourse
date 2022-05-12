package firstPackage;

public class TestLocalVar {
	
	public void testLocalVar() {
		int age = 34 ; 
		
		System.out.println("How old are you ? " + age );
	}
	
	public void testLocalVar1() {
		int age = 85 ; 
		
		System.out.println("How old are you ? " + age );

	}

	public static void main(String[] args) {
		TestLocalVar testClass = new TestLocalVar();
		testClass.testLocalVar();
		testClass.testLocalVar1();

	}

}
