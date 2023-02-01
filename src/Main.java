import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Masha", "Ivanova Novikova Stepanova", 25));
        people.add(new Person("Vanya", "Ivanov-Petrov-Sobolev-Makarov", 20));
        people.add(new Person("Petya", "Romanov", 50));
        people.add(new Person("Sasha", "Gromova Fedorova", 3));
        people.add(new Person("Glasha", "Gromova Popova", 30));


        Comparator<Person> comparator = (Person o1, Person o2) -> {
            String[] surname1 = o1.getSurname().split("\\P{IsAlphabetic}+");
            String[] surname2 = o2.getSurname().split("\\P{IsAlphabetic}+");

            if (surname1.length >= 3 && surname2.length >= 3 || surname1.length == surname2.length) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
            return surname2.length > surname1.length ? 1 : -1;
        };

        Collections.sort(people, comparator);
        System.out.println(people);
    }
}
