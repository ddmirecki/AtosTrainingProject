package enumTraining;

public class Main {
    public static void main(String[] args) {
        for (Directions directions : Directions.values()) {
            if (directions.toString().equals("EAST")) {
                System.out.println(directions.EAST);
            }
        }

        Directions direction = Directions.SOUTH;
        DirectionsTest testDir = new DirectionsTest(Directions.SOUTH);

        if(direction.toString().equals(testDir.toString())){
            System.out.println("true");
        }
        System.out.println(testDir.toString());
        System.out.println(direction.toString());

        WeightEnum weigh = WeightEnum.HEAVY;
        int x = weigh.getX();
        System.out.println(x);


    }
}
