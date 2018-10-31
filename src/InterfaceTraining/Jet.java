package InterfaceTraining;

public class Jet {
    private Flight flight;


    public Jet(Flight flight) {
        this.flight = flight;
    }
    public void jetFlying(){
        flight.fly();
    }

    public Flight getFlight() {
        return flight;
    }

    public int getSpeed(){
        return flight.speed();
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
