package dziedziczenie;

public class Child extends Parent {

    private int months;

    public Child(int age, String name, int months) {
        super(age, name);
        this.months = months;
    }

    public void testing(){
        Parent parent = new Parent(4, "asd");
        parent.name = "asd";
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }
}
