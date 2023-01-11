package firstPackage;

public class ParameterVariable {

    public void testParameterVariable(int age){
        System.out.println("Jone Dow is " + age);
    }

    public void passArgument(){
        ParameterVariable parameterVariable = new ParameterVariable();
        parameterVariable.testParameterVariable(43);
    }
    public static void main(String[] args){
        ParameterVariable parameterVariable = new ParameterVariable();
        parameterVariable.passArgument();

    }
}
