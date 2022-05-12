package firstPackage;

public class StringDemo {

	public static void main(String[] args) {
		String greeting = "Hello World!";
		String firstName = "Bassmala";
		String lastName = "Hafez";
		
		int len = greeting.length();
		String fullName = firstName.concat(lastName);
		
		System.out.println(len);
		System.out.println(fullName);

	}

}
