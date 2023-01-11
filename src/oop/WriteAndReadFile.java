package oop;

import java.io.*;

public class WriteAndReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("Hello.txt");
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Hello from file");
        fileWriter.flush();
        fileWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line ;
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);

        }
        bufferedReader.close();
    }

}
