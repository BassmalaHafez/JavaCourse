package oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundDemo {
    public static void main(String[] args) {
        try {
            File file = new File("C//fle.txt");

            FileReader fileReader = new FileReader(file);
        }catch (FileNotFoundException f){
            System.out.println(" 404 not found ");
        }



    }
}