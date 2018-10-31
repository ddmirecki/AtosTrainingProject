package polimorfizm;

public class Parent {

    private String parentName;

    public Parent(String parentName) {
        this.parentName = parentName;
    }

    public void printName(){
        System.out.println("Parent: " +  parentName);
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
}
