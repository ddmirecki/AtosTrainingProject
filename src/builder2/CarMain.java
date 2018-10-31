package builder2;

public class CarMain {

    public static void main(String[] args) {

        Car car = new Car.Builder(1).setBrand("Mazda").setModel("6").setColor("Black").build();



    }
}
