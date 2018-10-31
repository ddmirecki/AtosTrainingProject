package assesmentTests;

public class Edder {
    private Cedder cedder;

    public Edder(Cedder cedder) {
        this.cedder = cedder;
    }

    private void bar(){
        System.out.println(cedder.cde());
    }

    public static void main(String[] args) {
        Edder edder = new Edder(new Cedder());
        edder.bar();

    }
}
