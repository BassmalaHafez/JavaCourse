package oop;

public class RunEncap {
    public static void main(String[] args){
        EncapTest encapTest= new EncapTest();
        encapTest.setAge(32);
        encapTest.setName("Bassmala");
        encapTest.setIdNum("123456789");

        System.out.println("My name is " + encapTest.getName() + "My age is " + encapTest.getAge() +
                " My ID Number is " + encapTest.getIdNum());
    }
}
