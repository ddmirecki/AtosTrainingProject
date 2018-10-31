package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        File file = new File("c:/1/file.txt");

        try {
            FileReader reader = new FileReader("c:/1/file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            try {
                throw new MyFileException();
            } catch (MyFileException e1) {
                e1.printStackTrace();
            }
        }


        try {
            int[] arr = new int[2];
            System.out.println("arr" + arr[3]);
        } catch (ArrayIndexOutOfBoundsException f) {
            System.out.println("array out of bound " + f);
        }


    }
}
