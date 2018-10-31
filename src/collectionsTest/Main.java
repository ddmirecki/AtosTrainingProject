package collectionsTest;

import codeWars.PrinterError;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//        list.add("aaa");
//        list.add("bbb");
//        list.add("ccc");
//
//        list.iterator().forEachRemaining(x-> System.out.println(x.matches("a")));

int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = fibonaci(i);
            System.out.println(numbers[i]);
        }


    }

    public static int fibonaci(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        else return fibonaci(n-1) + fibonaci(n-2);

    }
}
