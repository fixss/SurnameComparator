import ru.netology.Person;

import java.util.ArrayList;
import java.util.List;

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

        people.sort((Person o1, Person o2) -> {
            String[] so1 = o1.getSurname().split("\\P{IsAlphabetic}+");
            String[] so2 = o2.getSurname().split("\\P{IsAlphabetic}+");
            if (so1.length > 6 && so2.length > 6) {
                return o2.getAge() - o1.getAge();
            } else if (so1.length != so2.length) {
                return so2.length - so1.length;
            } else {
                return o2.getAge() - o1.getAge();
            }
        });

        System.out.println(people.toString());
    }
}
