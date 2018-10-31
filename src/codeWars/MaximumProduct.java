package codeWars;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 5, 10, 2, 24, -1, -48};
        int i = adjacentElementsProduct(arr);
        System.out.println(i);

    }

    public static int adjacentElementsProduct(int[] array){
        int temp = 0;
        int result = array[0]*array[1];
        for (int i = 1; i < array.length; i++) {
            temp = array[i - 1] * array[i];
            if (temp > result) {
                result = temp;
            }
        }

        return result;
    }
}
