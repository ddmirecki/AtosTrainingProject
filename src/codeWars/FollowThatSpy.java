package codeWars;

import java.util.*;

public class FollowThatSpy {
    public static void main(String[] args) {

        String[][] cities = new String[][]
                {{"Chicago", "Winnipeg"}, {"Halifax", "Montreal"}, {"Montreal", "Toronto"}, {"Toronto", "Chicago"}, {"Winnipeg", "Seattle"}};
        Map<String, String> map = new HashMap<>();
        for (String[] route :cities) {
            map.put(route[0], route[1]);
        }

        Set<String> set = new HashSet<>(map.keySet());
        set.removeAll(map.values());
        System.out.println(map);
        String place = set.iterator().next();
        System.out.println("---------");
        System.out.println(place);


        String routes = findRoutes(cities);
        System.out.println(routes);

        System.out.println("---------");
        System.out.println(findStart(cities));

    }

    public static String findRoutes(String[][] routes) {
        int iCounter = 0;
        int jCounter = 0;
        int counter = 0;
        int position = 0;
        String wynik = "";
        boolean isFirst = true;


        while (counter < routes.length) {
            for (int i = 0; i < routes.length; i++) {
                if (routes[iCounter][0].equals(routes[i][1])) {
                    isFirst = false;
                    if (wynik.contains(routes[i][0])){
                        wynik += routes[iCounter][0] + ", ";
                    }
                }

            }
            if (isFirst == true) {
                wynik += routes[iCounter][0] + ", ";
            }
            iCounter++;
            counter++;
            isFirst = true;

        }
        return wynik;
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
