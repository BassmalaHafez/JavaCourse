package firstPackage;

public class LocalVariable {

    public void testLocalVariable(){
        int age = 34 ;
        System.out.println("How old is Joe ? " + age);
    }

    public void testSameLocalVariable(){
        int age = 38 ;
        System.out.println("How old is Jone ? " + age);
    }

    public static void main (String[] args){
        LocalVariable localVariable = new LocalVariable();
        localVariable.testLocalVariable();
        localVariable.testSameLocalVariable();

    }
}
