package homework_5.cars;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        final Set<Person> personSet = personService.getPersonList(set());
        System.out.println("These person/people can drive a car: ");
        for (Person p : personSet) {
            if (p.getAge() > 16 && p.getPenaltyPeriod() > 365) {
                System.out.println(p.getName());
            }
        }

    }

    static Set<Person> set() {
        Set<Person> people = new HashSet<>();
        Random random = new Random();

        people.add(new Person("Anton", 18, random.nextInt(1000)));
        people.add(new Person("Ivan", 21, random.nextInt(1000)));
        people.add(new Person("Dimitry", 15, random.nextInt(1000)));
        people.add(new Person("Andrey", 25, random.nextInt(1000)));
        people.add(new Person("Alex", 19, random.nextInt(1000)));
        return people;
    }
}
