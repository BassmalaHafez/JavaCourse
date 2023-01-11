package oop;

public class Calculation  {
    int total ;
    public void additions(int firstNum , int secNum){
        total = firstNum + secNum ;
        System.out.println("the sum of the given numbers " + total);
    }

    public void subtraction(int firstName , int secName){
        total= firstName - secName ;
        System.out.println("the subtraction of the given numbers " + total );
    }
}
