package oop;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        System.out.println(numbers);
        System.out.println(numbers.get(2));

        for (int i = 0; i < numbers.size() ; i++) {
            System.out.println(numbers.get(i));

            numbers.remove(numbers.size()-1);
            System.out.println("Remove number " + numbers);

        }

    }
}
