package homework_5.cars;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Set<Person> personSet = set();
        System.out.println("These person/people can drive a car: ");
        for (Person p : personSet) {
            if (p.getAge() > 16 && p.getPenaltyPeriod() > 365 && p.isDriverLicence()) {
                System.out.println(p.getName());
            }
        }

    }

    static Set<Person> set() {
        Set<Person> people = new HashSet<>();
        Random random = new Random();

        people.add(new Person("Anton",true, 18, random.nextInt(1000)));
        people.add(new Person("Ivan",false, 21, random.nextInt(1000)));
        people.add(new Person("Dimitry",false, 15, random.nextInt(1000)));
        people.add(new Person("Andrey",false, 25, random.nextInt(1000)));
        people.add(new Person("Alex",true, 19, random.nextInt(1000)));
        return people;
    }
}
