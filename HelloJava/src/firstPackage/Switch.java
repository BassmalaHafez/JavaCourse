package firstPackage;

public class Switch {

	public static void main(String[] args) {
		int days = 6 ; 
		switch (days) {
		case 1:
			System.out.println("Sunday is the 1st day of the week");
			break;
		case 2 :
			System.out.println("Monday is the 2nd day of the week");
			break;
		case 3 :
			System.out.println("Tuesday is the 3rd day of the week");
			break;
		case 4 :
			System.out.println("wednesday is the 4th day of the week");
			break;
		case 5 :
			System.out.println("Thursday is the 5th day of the week");
			break;
		case 6 :
			System.out.println("Friday is the 6th day of the week");
			break;
		case 7 :
			System.out.println("Saturday is the 7th day of the week");
			break;

		default:
			System.out.println("Error Not Valid");
			break;
		}
 
	}

}
