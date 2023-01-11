package oop;

public class PolymorphismOverride extends Polymorphism {

    @Override
    public void sound() {

        System.out.println("Meow");
    }

    public static void main (String[] args){
        Polymorphism polymorphism = new PolymorphismOverride();
        polymorphism.sound();
    }

}
