package firstPackage;

public class MyInhertedCalculation extends InhertanceCalculation {
	public void Maltiplcation(int fNum , int sNum) {
		total = fNum * sNum ;
		System.out.println("The total Multiplcation is " + total);
		
	}

	public static void main(String[] args) {
		MyInhertedCalculation myCalc = new MyInhertedCalculation();
		myCalc.Addition(100, 50);
		myCalc.Substraction(200, 100);
		myCalc.Maltiplcation( 20 ,5);
			
	}

}
