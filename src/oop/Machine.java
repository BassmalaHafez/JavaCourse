package oop;

public class Machine {
    private String name ;
    private int code;
    public Machine(){
        System.out.println("Constructor running");
    }
    public Machine(String name){
        System.out.println("The 2nd machine is running " + name);
    }
    public Machine(String name , int code){
        this.name = name ;
        this.code=code ;
        System.out.println("The 3rd constructor is running " + name  +  code );

    }
}
