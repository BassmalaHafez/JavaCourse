package firstPackage;

public class InstanceVariable {
	
	int age = 32 ;
	
	public void testInstanceVariable() {
		System.out.println("Joe Doe is " +age+ " years old");
	}
	
	public void testInstancevar() {
		System.out.println("Joe Doe is " +age+ " years old");

	}

	public static void main(String[] args) {
		InstanceVariable instanceVarTest = new InstanceVariable();
		instanceVarTest.testInstanceVariable();
		instanceVarTest.testInstancevar();

	}

}
