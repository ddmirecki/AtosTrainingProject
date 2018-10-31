package codeWars;

import java.util.*;

public class DeleteOccurancesOfElementIfMoreThanN {
    public static void main(String[] args) {

        int n = 1;
        int[] array = new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2};
        int[] ints = deleteNth(array, n);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        Set<Integer> types = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            types.add(array[i]);
        }

    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Set<Integer> types = new HashSet<>();
        for (int i = 0; i < elements.length; i++) {
            types.add(elements[i]);
        }


        Iterator<Integer> it = types.iterator();
        while (it.hasNext()) {
            int counter = 0;
            Integer value = it.next();
            for (int j = 0; j < elements.length; j++) {
                if (elements[j] == value && counter < maxOccurrences) {
                    counter++;
                } else if (elements[j] == value && counter >= maxOccurrences) {
                    elements[j] = -1;
                    counter++;
                }
            }

            counter = 0;
        }

        List<Integer> temp = new LinkedList<>();
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != -1)
            temp.add(elements[i]);
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp.get(i);
        }


        return result;
    }
}