package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(11);
        intList.add(22);
        intList.add(33);
        intList.add(44);
        intList.stream().map(x -> 1 + x).forEach(x -> System.out.println(x));
        System.out.println("---------------");
        intList.stream().filter(x -> x < 30).forEach(x -> System.out.println(x));
        System.out.println("----------------");

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Mateusz", 5, false));
        personList.add(new Person("Daniel", 34, true));

        for (Person person : personList) {
            if (person.isMarried == true)
                System.out.println(person);
        }


        personList.stream().filter(x -> x.isMarried == true).forEach(x -> System.out.println(x));

        personList.stream().mapToDouble(x -> x.getAge()).forEach(x -> System.out.println(x));
        List<String> mappedNameAge = personList.stream().map(x -> x.getName() + " map " + x.getAge()).collect(Collectors.toList());
        mappedNameAge.stream().forEach(x -> System.out.println(x));

        intList.stream().map(x -> x +1).collect(Collectors.toList());

        personList.stream().filter(x -> x.isMarried() == true).findAny();



    }
}
