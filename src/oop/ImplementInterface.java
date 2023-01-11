package oop;

public class ImplementInterface implements IAnimal{
    @Override
    public void eat() {
        System.out.println("all animals can eat");
    }

    @Override
    public void travel() {
        System.out.println("not all animals can travel");

    }

    public static void main(String[] args){
        ImplementInterface implementInterface = new ImplementInterface();
        implementInterface.eat();
        implementInterface.travel();
    }
}
