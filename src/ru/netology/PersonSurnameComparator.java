package ru.netology;

import java.util.Comparator;

public class PersonSurnameComparator implements Comparator<Person> {
    private int maxWords;

    public PersonSurnameComparator(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] so1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        String[] so2 = o2.getSurname().split("\\P{IsAlphabetic}+");
        if (so1.length > maxWords && so2.length > maxWords) {
            return Integer.valueOf(o2.getAge()).compareTo(Integer.valueOf(o1.getAge()));
        } else if (so1.length != so2.length) {
            return so1.length <= so2.length || so1.length < so2.length ? 1 : -1;
        } else {
            return Integer.valueOf(o2.getAge()).compareTo(Integer.valueOf(o1.getAge()));
        }

    }

}
