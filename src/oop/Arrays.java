package oop;

public class Arrays {

    public static void main(String[] args){
        int[] arr = new int[10];
        for(int i=0; i <arr.length; i++){
            System.out.println(arr[i]);
        }

        String[] arr2={"volvo","bmw","ford","mazda"};
        for (String i : arr2){
            System.out.println(i);
        }

        int[] arr3 = new int[10];
        for(int i :arr3){
            i=1 ;
            i=2;
            i=3;
            System.out.println(i);
        }
    }

}
