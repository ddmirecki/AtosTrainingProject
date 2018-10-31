package abstractInterfaceClass;

public class Main {
    public static void main(String[] args) {
        Sound sound = new Tekno();
        String checkedSound = sound.checkSound();
        System.out.println(checkedSound);
    }
}
