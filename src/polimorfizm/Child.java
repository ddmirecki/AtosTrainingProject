package polimorfizm;

public class Child extends polimorfizm.Parent {

    private int months;
    private String name;

    public Child(String parentName, String name) {
        super(parentName);
        this.name = name;
    }

    @Override
    public void printName(){
        System.out.println("child: " + name);
    }

    public void printChildName(){
        System.out.println("Child: " + name);
    }
    public void printParentFromChild(){
        System.out.print("child prints parent ");
        super.printName();
    }


    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }
}