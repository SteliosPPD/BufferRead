package bufferread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferRead {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String filename = "C:\\Users\\stpap\\Documents\\JavaExamples\\hello.txt.txt";

        fileName(filename); //1os Tropos

        //File file = new File(filename); //2os Tropos
        // Scanner input = new Scanner(file);
        // String line = input.nextLine();
        //System.out.println(line);
        //  input.close();
        
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = input.next();
        System.out.println("Your name is: " + name);
        System.out.println("Ok " + name + ", what is your age?");
        int age = input.nextInt();
        System.out.println(name + " your age is " + age);
        input.close();

    }

    public static void fileName(String a) throws FileNotFoundException, IOException {

        BufferedReader reader = new BufferedReader(new FileReader(a));
        String line = reader.readLine();

        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();

    }
}
