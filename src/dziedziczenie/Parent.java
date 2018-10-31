package dziedziczenie;

public class Parent {
    private int age;
    protected String name;

    public Parent(int age, String name) {
        this.age = age;
        this.name = name;
    }



    private void foo() {
        System.out.println("foo");
    }

    protected void bar(){
        System.out.println("bar");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
