import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {

    public Integer bigInteger(int x, Integer y){
        return x+y;
    }

    public int smallInteger(int x, Integer y){
        return x+y;
    }

    public int smallInt(int x, int y){
        return x+y;
    }

    public Integer bigIntegers(Integer x, Integer y){
        return x+y;
    }

    public static void main(String[] args) {


        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        List<String> stringList = new ArrayList<>();
        stringList.add("asd");
        List rawList = new ArrayList();

        rawList = stringList;
        rawList = integerList;

        for (Object o : stringList) {
            System.out.println(o);
        }


        System.out.println(stringList);
        System.out.println(integerList);
        System.out.println(rawList);

    }
}
