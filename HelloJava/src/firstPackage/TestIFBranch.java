package firstPackage;

import java.util.Scanner;

public class TestIFBranch {

	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in) ;
		System.out.println("Enter the number: ");
		int extraCustomers = myobj.nextInt() ; 
		if (extraCustomers >= 3) {
			
			System.out.println("Customers recevies a Discount ");
			
		}

	}

}
