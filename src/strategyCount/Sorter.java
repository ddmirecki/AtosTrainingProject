package strategyCount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sorter {
    private Calculate calculate;
    private int result;

//    public Sorter(Calculate calculate) {
//        this.calculate = calculate;
//        int calculatedNumbers = calculate.evaluate(takeInputFromuUser());
//        System.out.println(calculatedNumbers);
//    }
//    public Sorter(Calculate calculate, int[] intarray){
//        result = calculate.evaluate(intarray);
//    }
    public Sorter(Calculate calculate){
        this.calculate = calculate;

    }
    public void calculateFromUserInput(){
    result = calculate.evaluate(takeInputFromuUser());
    }

    public int calculateFromExternalArray(int[] intArray){
       return result = calculate.evaluate(intArray);
    }

    private int[] takeInputFromuUser() {
        List<Integer> integers = new ArrayList<>();
        int[] numbers;
        while (nextNumber()) {
            System.out.println("podaj liczbe");
            Scanner scanner = new Scanner(System.in);
//              int x = scanner.nextInt();
            integers.add(scanner.nextInt());

        }
        numbers = new int[integers.size()];

        for (int i = 0; i < integers.size(); i++) {
            numbers[i] = integers.get(i);
        }

        return numbers;
    }

    private boolean nextNumber() {
        boolean nextNumber = true;
        System.out.println("Czy chcesz podać następny number? t/n");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        if (s.equals("t")) {
            nextNumber = true;
        } else if (s.equals("n")) {
            nextNumber = false;
        } else {
            throw new IllegalArgumentException("zły argument! -> t/n");
        }

        return nextNumber;
    }

    public int getResult() {
        return result;
    }
}
