package firstPackage;

public class RunEncap {

	public static void main(String[] args) {
		TestEncap encapTest = new TestEncap();
		encapTest.setName("Bassmala");
		encapTest.setidName("Hafez");
		encapTest.setAge(32);
		
		System.out.println("Name: " + encapTest.getName()  +  " Age: " + encapTest.getAge() + " ID Name: " + encapTest.getidName());

	}

}
