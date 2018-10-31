package codeWars;

public class TestingMain {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(addX(x));
        for (int i = 0; i < 5; i++) {
            System.out.println("as");
        }
    }
    public static int addX(int xy){
        int a = xy;
        for (int i = 0; i < 10; i++) {
            a +=1;
        }
        return a;
    }
}
