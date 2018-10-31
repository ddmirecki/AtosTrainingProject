package enumTraining;

public class DirectionsTest {
    private Directions directions;

    public DirectionsTest(Directions directions){
        this.directions = directions;
    }

    public Directions getDirections() {
        return directions;
    }

    public void setDirections(Directions directions) {
        this.directions = directions;
    }

    @Override
    public String toString(){
        return "" +directions;
    }
}
