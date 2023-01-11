package oop;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args){
        ArrayList<String> obj = new ArrayList<>();
        obj.add("Bassmala");
        obj.add("Hana");
        obj.add("Ziena");
        obj.add("Yassin");

        System.out.println("Array List contents " + obj);

        //Add Element to the given index
        obj.add(0 , "Sahar");
        obj.add(3 , "Salah");

        System.out.println("ArrayList after updating " + obj);

        //Remove element from the arraylist
        obj.remove("Salah");
        System.out.println("ArrayList after remove element " + obj);

        //Remove element from the given index
        obj.remove(0);
        System.out.println("ArrayList after remove element from the given index  " + obj);

    }
}
