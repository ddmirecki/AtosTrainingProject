package lambda;

public class Check {
    public interface Checker<T> {
        boolean check(T object);
    }
    public static void main(String[] args) {


        Checker<Integer> isOddAnonymous = new Checker<Integer>() {
            @Override
            public boolean check(Integer object) {
                return object % 2 != 0;
            }
        };


        System.out.println(isOddAnonymous.check(100));
    }


}
