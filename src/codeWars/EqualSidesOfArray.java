package codeWars;

public class EqualSidesOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 3, 2, 1};

        System.out.println(findEqualIndex(arr));

    }


    public static int findEqualIndex(int[] arr) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j < i) {
                    leftSum += arr[j];
                }
                if (j > i) {
                    rightSum += arr[j];
                }
            }
            if (leftSum == rightSum) {
                return i;
            }
            leftSum = 0;
            rightSum = 0;
        }


        return -1;
    }

}
