package dziedziczenie;

public class Nobody {

    private Child child;
    private String description;

    public Nobody(Child child, String description){
        this.child = child;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
