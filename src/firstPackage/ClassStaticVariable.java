package firstPackage;

public class ClassStaticVariable  {
    static int age = 32 ;

    public static void testStatic(){
        System.out.println("Hello static Method");
    }

    public static void main (String[] args){
        System.out.println("My age is " + ClassStaticVariable.age + " years old");
        ClassStaticVariable.testStatic();
    }
}
