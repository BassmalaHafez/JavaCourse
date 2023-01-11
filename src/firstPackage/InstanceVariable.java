package firstPackage;

public class InstanceVariable {
    int age = 25 ;

    public void testInstanceVariable(){
        int age= 18 ;
        System.out.println("Most people graduate from school at " + age);
    }

    public void testAgainInstanceVariable(){
        System.out.println("Most people graduate from school at " + age);
    }

    public static void main(String[] args){

        InstanceVariable instanceVariable = new InstanceVariable();
        instanceVariable.testInstanceVariable();
        instanceVariable.testAgainInstanceVariable();
    }
}
