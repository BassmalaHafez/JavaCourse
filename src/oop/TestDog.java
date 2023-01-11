package oop;

public class TestDog {
    public static void main(String[] args){
        Animal animal = new Animal() ;
        Animal dogAnimal = new Dog();

        animal.move();
        dogAnimal.move();
    }
}
