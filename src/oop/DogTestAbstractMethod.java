package oop;

public class DogTestAbstractMethod extends AnimalAbsrtractClass{
    @Override
    public void sound() {
        System.out.println("Woof");
    }

    @Override
    public void move() {
        System.out.println("Fast");

    }

    public static void main(String[] args){
        AnimalAbsrtractClass animal = new DogTestAbstractMethod();
        animal.sound();
        animal.move();
    }
}
