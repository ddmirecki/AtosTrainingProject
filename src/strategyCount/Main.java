package strategyCount;

public class Main {
    public static void main(String[] args) {

//        Sorter sorter = new Sorter(new EvenNumbers());
//        int[] ints = sorter.takeInputFromuUser();
//
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(ints[i]);
//        }
        int[] extArray = new int[]{1,2,3,4,5,6,7,8,9};
        Sorter sorterExt = new Sorter(new EvenNumbers());
        int result = sorterExt.calculateFromExternalArray(extArray);
        System.out.println(result);
        Sorter sorterInternal = new Sorter(new EvenNumbers());
        sorterInternal.calculateFromUserInput();
        int internalResult = sorterInternal.getResult();
        System.out.println(internalResult);



    }
}
