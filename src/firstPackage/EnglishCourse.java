package firstPackage;
//Class Name
public class EnglishCourse {
    // Declare Variables
    int students ;
    int weeks ;
    int days ;
    // Method
    public static void main (String[] args){

        // object
        EnglishCourse englishCourse = new EnglishCourse();
        // Declare Variable
        int totalDays ;
        // Initialize variables
        englishCourse.students=10;
        englishCourse.weeks= 4;
        englishCourse.days=3;

        totalDays = englishCourse.weeks * englishCourse.days ;

        System.out.println(" The English Course is a total of " + totalDays + " Days");
    }
}
