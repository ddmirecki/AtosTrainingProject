package codeWars;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        double ceil = (int)Math.ceil(5/2.0);
        System.out.println(ceil + " ceil");

//        String[][] cities = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
//
//        for (int i = 0; i < cities.length; i++) {
//            for (int j = 0; j < cities[i].length; j++) {
//                if (cities[0][0].equals("d")) {
//                    System.out.println("tak");
//                }
//            }
//
//        }
//
//        String[][] c = new String[][]
//                {{"Chicago", "Winnipeg"}, {"Halifax", "Montreal"}, {"Montreal", "Toronto"}, {"Toronto", "Chicago"}, {"Winnipeg", "Seattle"}};
        Stack<String> stack = new Stack<>();
        stack.push("{[()()");

        System.out.println("--------");
        Map<Integer, Integer> map = new HashMap<>();
        int[] array = new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2};
        for (int i = 0; i < array.length; i++) {
            Integer put = map.put(array[i], map.getOrDefault(array[i], 0) + 1);
            System.out.println(put);
        }

        String[][] cities = new String[][]
                {{"Chicago", "Winnipeg"}, {"Halifax", "Montreal"}, {"Montreal", "Toronto"}, {"Toronto", "Chicago"}, {"Winnipeg", "Seattle"}};

//        String[] inner = new String[20];
//        for (int i = 0; i < cities.length; i++) {
//
//
//        }
//        for (int i = 0; i < inner.length; i++) {
//            System.out.println(inner[i]);
//        }

        System.out.println(findNextStops(cities));
    }

    public static String findNextStops(String[][] routes){
        String firstStop = findStart(routes);
        String finalRoute = firstStop;
        String nextStop = "";
        int counter = 0;
        while (counter < routes.length) {
            for (int i = 0; i < routes.length; i++) {
                if (firstStop.equals(routes[i][0])) {
                    nextStop = routes[i][1];
                    break;

                }

            }
            firstStop = nextStop;
            finalRoute += " " + nextStop;
            counter++;
        }

        return finalRoute;
    }

    public static String findStart(String[][] routes){
        int counter = 0;
        boolean isFirst = true;
        String destinationStart = "";
        while (counter <= routes.length) {
            for (int i = 0; i < routes.length; i++) {
                if (routes[counter][0].equals(routes[i][1])) {
                    isFirst = false;
                    break;
                }else{
                    isFirst = true;
                }
            }
            if (isFirst == true){
                destinationStart = "" + routes[counter][0];
                return destinationStart;
            }
            counter++;
            isFirst = true;
        }
       return destinationStart;

    }
}
