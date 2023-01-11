package oop;

public class MethodOverload {
    public static void main(String[] args){
        double result ;
        OverLoad obj = new OverLoad();

        obj.demo(10);
        obj.demo(10, 20 );
        result = obj.demo(5.5);

        System.out.println("The Final Result is " + result);
    }
}
