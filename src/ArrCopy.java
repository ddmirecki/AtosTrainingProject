public class ArrCopy {
    public static void main(String[] args) {

        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int counter = 0;
        int[] newArr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[counter] = arr[i][j];
                counter++;
            }
        }

        for (int i = 0; i < newArr[i]; i++) {
            System.out.println(newArr[i]);
        }


    }
}
