package InterfaceTraining;


public class Main {

    public static void main(String[] args) {
        Flight flight = new FlyHigh();
        flight.fly();
    Jet jet = new Jet(new FlyHigh());
    jet.jetFlying();




    }


}
