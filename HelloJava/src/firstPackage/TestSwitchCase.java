package firstPackage;

import java.util.Scanner;

public class TestSwitchCase {

	public static void main(String[] args) {
		Scanner testSwitch = new Scanner(System.in);
		System.out.println("Enter the Number please : " );
		int day = testSwitch.nextInt();
		
		switch (day) {
		case 1:
			System.out.println("Sunday is the 1st day of the week");
			break;
			
		case 2:
			System.out.println("Monday is the 2nd day of the week");
			break;
			
		case 3:
			System.out.println("Tuesday is the 3rf day of the week");
			break;
			
		case 4:
			System.out.println("Wednesday is the 4th day of the week");
			break;
			
		case 5:
			System.out.println("Thursday is the 5th day of the week");
			break;
			
		case 6:
			System.out.println("Friday is the 6th day of the week");
			break;
			
		case 7:
			System.out.println("Saturday is the 7th day of the week");
			break;

		default:
			System.out.println("Not Valid Error ");
			break;
		}
		
		 
		
		
	}

}
