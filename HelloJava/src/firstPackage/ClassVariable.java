package firstPackage;

public class ClassVariable {
	
	static int age = 30 ;
	
	public static void testClassVariable() {
		System.out.println(" Joe doe is " +age+ "Years old");
	}
	
	public static  void testClassVar() {
		System.out.println(" Joe doe is " +age+ "Years old");
	}

	public static void main(String[] args) {
		
		ClassVariable.testClassVariable();
		ClassVariable.testClassVar();

	}

}
