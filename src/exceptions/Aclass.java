package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Aclass {

    public void readFileA(String path) throws FileNotFoundException {

        FileReader reader = new FileReader(path);
    }

    public void array() {

        try {
            int[] arr = new int[2];
            System.out.println("arr" + arr[3]);
        } catch (MyException a) {
            throw new MyException("asd");


        }
    }

    public int arrayUp() throws CheckedException {


        throw new CheckedException("asd");


    }



    public void array123() {

        throw new MyException("asd");

    }

    public static void main(String[] args) {
        Aclass aclass = new Aclass();
//        try {
//            aclass.array123();
//        } catch (MyException ex) {
//            System.out.println("zadzialalo");
//        }

        try {
            System.out.println("drugi " + aclass.arrayUp());
        } catch (CheckedException e) {
            e.printStackTrace();
            System.out.println("checked exception" + e.getMessage());
        }

    }

}
