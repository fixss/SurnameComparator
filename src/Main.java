import ru.netology.Person;
import ru.netology.PersonSurnameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Potter.Potter.Potter", "Harry", 15));
        people.add(new Person("Granger-Granger", "Hermione", 15));
        people.add(new Person("Weasley", "Ron", 16));
        people.add(new Person("Severus Severus Severus Severus", "Snape", 40));
        people.add(new Person("Dumldore.Dumldore/Dumldore", "Albus", 99));
        people.add(new Person("Malfoy.Malfoy.Malfoy.Malfoy.Malfoy.Malfoy.Malfoy.Malfoy", "Draco", 15));
        people.add(new Person("Malfoy.Malfoy.Malfoy.Malfoy.Malfoy.Malfoy.Malfoy", "Lucius", 55));
        people.add(new Person("Lord.Lord.Lord.Lord.Lord.Lord.Lord.Lord.Lord", "voldemort", 99));

        Predicate<Person> isBelow18 = p -> p.getAge() < 18;
        people.removeIf(isBelow18);

        Collections.sort(people, new PersonSurnameComparator(6));
        System.out.println(people);
    }
}
