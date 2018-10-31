package InterfaceTraining;

public class FlyHigh implements Flight {
    @Override
    public void fly() {
        System.out.println("fly high");
    }

    @Override
    public int speed() {
        return 100;
    }
}
