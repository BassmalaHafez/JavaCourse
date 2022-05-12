package firstPackage;

public class ParameterVariable {
	
	public void testParameterVar(int age ) {
		
		System.out.println("Jan Doe is " + age + " years old");
		
	}

	public static void main(String[] args) {
		ParameterVariable testparvar = new ParameterVariable();
		testparvar.testParameterVar(30);

	}

}
