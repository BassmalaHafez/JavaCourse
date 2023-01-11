package oop;

public class MyCalc extends Calculation{
    public void multiplication(int firstNum ,int secNum){
        total = firstNum * secNum ;
        System.out.println("the result of the given numbers " + total);
    }

    public static void main(String[] args){
        MyCalc myCalc = new MyCalc();
        myCalc.additions(5 , 5);
        myCalc.subtraction(10, 5);
        myCalc.multiplication(5 , 5);
    }
}
