package JDK8Features.Optional;

import java.util.ArrayList;
import java.util.List;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "'}";
    }
}

public class ObjOrElse {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person(1, "svcljdsfhuyhd"));
        persons.add(new Person(2, "sdkjhciufh"));
        persons.add(new Person(3, "mdscbs"));

        findPersonById(persons, 2);

        findPersonById(persons, 4);
    }

    public static void findPersonById(List<Person> persons, int id) {
        persons.stream()
            .filter(person -> person.getId() == id)
            .findFirst()
            .ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Person not found"));
    }
}


