import java.util.ArrayList;
import java.util.List;

public class References {
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    private final Integer i = 0;

    public Integer getI() {
        return new Integer(i);
    }

    public ArrayList<Integer> getList1() {
        return list1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);
        System.out.println(firstList.size());
        ArrayList<Integer> secondList = firstList;
        secondList.add(55);
        System.out.println(secondList.size());
        modifyList(secondList);
        System.out.println(secondList.size());
        System.out.println("_____________________________");
        References references = new References();
        references.list1.add(1);
        references.list1.add(2);
        references.list1.add(3);
        references.list2 = references.list1;
        System.out.println(references.list2.size());
        references.modifyLists(references.list2);
        System.out.println(references.list2.size());

    }

    public static void modifyList(ArrayList<Integer> list) {
        list.add(150);
    }

    public void modifyLists(ArrayList<Integer> l) {
        l.add(1123);
        for (Integer integer : list2) {
            list2.get(integer);
        }

    }
}