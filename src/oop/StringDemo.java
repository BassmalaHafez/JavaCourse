package oop;

public class StringDemo {
    public static void main(String[] args){
        String greeting = "Hello World !" ;
        System.out.println("The Length of the string is " + greeting.length());

        String firstName= "Bassmala";
        String lastName= " Hafez";
        String fullName = firstName.concat(lastName);

        System.out.println(fullName);
    }
}
