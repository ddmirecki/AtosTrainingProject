import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        StringSpeed stringSpeed = new StringSpeed();
//        Modifiers.foobar();
//
//        stringSpeed.usingString();
//        System.out.println("_______________________________________");
//        stringSpeed.usingStringBuilder();
//        System.out.println("______________________________");
//        stringSpeed.usingStringBuffer();



        for (int i = 0; i < 1; i++) {
            System.out.println("licze " + i);
        }

        String abc = "ABC";
        int length = abc.replaceAll("[a-m]", "").length();
        System.out.println(length);

        AutoBoxing autoBoxing = new AutoBoxing();

        System.out.println(autoBoxing.bigInteger(5, 5));
        System.out.println(autoBoxing.bigIntegers(5, 5));
        System.out.println(autoBoxing.smallInteger(5, 5));
        System.out.println(autoBoxing.smallInt(5, 5));


        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

        enumSingleton.setType("pierwszy");
        enumSingleton.setValue(1);

        TestingThings testingThings = new TestingThings();
        System.out.println(testingThings.getTestingEnumSingleton());

        Date date = new Date();
        System.out.println(date);
        System.out.println("------------");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        long milis = System.currentTimeMillis();
        List<Double> integerList = new ArrayList<>();


        double x = 2;
        double y = 1;
        double z = 0;
        for (int i = 0; i < 10_000_000; i++) {
            z += Math.pow(x, y);
            integerList.add(z);
            y++;
        }

        long milisEnd = System.currentTimeMillis();
        long difference = milisEnd - milis;
        System.out.println(milisEnd);
        System.out.println(difference);
        System.out.println(integerList.get(1_000_0));

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "jeden");
        mapa.put(2, "dwa");
        mapa.put(3, "trzy");
        mapa.put(4, "cztery");
        mapa.put(4, "pięć");
        mapa.put(5, "pięć-sześć");
        mapa.put(6, "jeden");

        System.out.println("---------------------------------------");
        int t = 0;
        for (Map.Entry<Integer, String> para : mapa.entrySet()) {
            System.out.println(para.getKey() + " " + para.getValue());
            t++;
        }

        Map<HaszyszCode, String> haszyszMapa = new HashMap<>();
        HaszyszCode hasz1 = new HaszyszCode();
        HaszyszCode hasz2 = new HaszyszCode();
        haszyszMapa.put(hasz1, "jeden");
        haszyszMapa.put(hasz2, "dwa");
        for (Map.Entry<HaszyszCode, String> mapEntry : haszyszMapa.entrySet()) {
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }
        System.out.println(haszyszMapa.get(hasz2));
        System.out.println(hasz1.equals(hasz2));


    }
}
