package polimorfizm;

public class Main {

    public static void main(String[] args) {
        Child child = new Child("Darek", "Daniel");
        Parent parent = new Parent("Dariusz");

        child.printChildName();
        child.printParentFromChild();
        parent.printName();
        System.out.println("---------------");

        Parent something = new Child("parent Thing ", "the thing");
        something.printName();

//        System.out.println("--------");
//        Child someChild = (Child) new Parent("thing Parent");
//        someChild.printParentFromChild();
//
        // zad dom: klasa abstrakcyjna jakies metody, klasa zwykla rozszerzona o klase abstrakcyjna plus tez jakies metody
        // oraz interfejs 1 metoda ktory bedzie implementowany w klasie abstrakcyjnej, ta metoda bedzie zaimplementowana w kl. zwyklej
        // w klasie abstrakcyjnej uzyc tej zaimplementowanej metody ze zwyklej klasy




    }

}
