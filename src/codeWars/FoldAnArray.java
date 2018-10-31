package codeWars;

import java.util.Arrays;

public class FoldAnArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] two = new int[]{1,2,3,4};
        int[] twoArray = foldOnce(two);
        for (int i = 0; i < twoArray.length; i++) {

            System.out.println(twoArray[i]);
        }
        System.out.println("****************");

        int[] ints = foldArrayElse(arr, 3);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

//        System.out.println("------");
//        int[] foldArray = foldArray(arr, 2);
//        for (int i = 0; i < foldArray.length; i++) {
//            System.out.println(foldArray[i]);
//        }
    }

    public static int[] foldArrayElse(int[] a, int r) {
        int[] f = java.util.Arrays.copyOfRange(a,0,(int)Math.ceil(a.length/2.));
        for (int i=0; i<a.length/2; i++) f[i] += a[a.length-1-i];
        return f.length==1|r==1 ? f : foldArray(f,--r);
    }

    public static int[] foldArray(int[] array, int runs) {
        if (array.length == 1) {
            return array;
        } else {
            int[] temp = array;
            int[] temp2 = array;
            for (int i = 0; i < runs; i++) {

                temp2 = foldOnce(temp);
                temp = temp2;

                if (i == runs - 1) {
                    return temp2;
                }
            }
        }

        return null;
    }


    public static int[] foldOnce(int[] array) {
        int[] leftPart = new int[]{};
        if (array.length == 2) {
            leftPart = new int[1];
        } else {
            leftPart = new int[(int) Math.ceil(array.length / 2.0)];
        }

        int[] rightPart = new int[array.length - leftPart.length];
        int[] resultArray = new int[leftPart.length];
        for (int i = 0; i < leftPart.length; i++) {
            leftPart[i] = array[i];
        }
        int counter = 0;
        if (array.length > 2 && array.length%2!=0) {
            for (int j = array.length - 1; j > rightPart.length; j--) {
                rightPart[counter] = array[j];
                counter++;
            }
        }else if(array.length > 2 && array.length%2==0){
            for (int j = array.length - 1; j >= rightPart.length; j--) {
                rightPart[counter] = array[j];
                counter++;
            }
        } else if(array.length==2) {
            rightPart[0] = array[1];
        }else{
            return array;
        }
        for (int x = 0; x < resultArray.length; x++) {
            if (leftPart.length == rightPart.length) {
                resultArray[x] = leftPart[x] + rightPart[x];
            } else if (leftPart.length != rightPart.length) {
                if (x < rightPart.length) {
                    resultArray[x] = leftPart[x] + rightPart[x];
                } else {
                    resultArray[x] = leftPart[x];
                }
            }
        }
        return resultArray;
    }


}
