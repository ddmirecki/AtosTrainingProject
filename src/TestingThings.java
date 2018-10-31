import java.util.ArrayList;
import java.util.List;

public class TestingThings {


    private static int $;

    public static void main(String[] args) {
        String a_b;
        int x;
//        System.out.println($);
//        System.out.println(a_b);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.set(1, 55);
//        System.out.println(list);



    }

    public String getTestingEnumSingleton(){
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.setValue(2);
        enumSingleton.setType("drugi");
        int value = enumSingleton.getValue();
        String type = enumSingleton.getType();

        return "type = " + type + " value = " + value;
    }

}
