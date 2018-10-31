package enumTraining;

public enum WeightEnum {

    HEAVY(100),
    LIGHT(1),
    MEDIUM(10);
    private final int x;

    WeightEnum(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
