package ru.netology;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String setName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String setSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int setAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person: " + "\n"
                + "Surname = " + getSurname() + "\n"
                + "Name    = " + getName() + "\n"
                + "Age     = " + getAge() + "\n"
                + "\n";
    }
}
