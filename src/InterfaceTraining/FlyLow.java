package InterfaceTraining;

public class FlyLow implements Flight {
    @Override
    public void fly() {
        System.out.println("fly low");
    }

    @Override
    public int speed() {
        return 0;
    }
}
