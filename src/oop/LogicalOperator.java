package oop;

public class LogicalOperator {

    public static void main(String[] args){

        boolean x= 100 > 99 , y = 99 >100 ;

        System.out.println("The result of 100 >99 " + (x&&y));

        System.out.println("The result of 100 >99 " + (x||y));

        System.out.println("The result of 100 >99 " + (x^y));

        System.out.println("The result of 100 >99 " + (!x));


    }

}
