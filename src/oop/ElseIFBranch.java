package oop;

public class ElseIFBranch {
    public static void main (String[] args){
        int extraCustomer=2 ;
        if (extraCustomer>=3){
            System.out.println("Customer receives a discount");
        } else if (extraCustomer <=3) {
            System.out.println("No discount");

        }else {
            System.out.println("Invalid customer count");
        }
    }


}
