package codeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WhichAreIn {
    public static void main(String[] args) {

        String[] a1 = new String[]{"arp", "live", "strong"};
        String[] a2 = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
        String[] a3 = new String[]{"tarp", "mice", "bull"};

        String[] strings = inArray(a1, a2);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }



    public static String[] inArray(String[] array1, String[] array2){
        boolean contains = false;
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j].contains(array1[i])){
                    contains = true;
                }
            }
            if(contains==true){
                stringList.add(array1[i]);
            }
            contains = false;
        }
        Collections.sort(stringList);
        String[] stingArray = new String[stringList.size()];
        for (int i = 0; i < stringList.size(); i++) {
            stingArray[i] = stringList.get(i);
        }


        return stingArray;
    }

}
