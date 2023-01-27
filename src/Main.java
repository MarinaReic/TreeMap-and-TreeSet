import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Masha", "Ivanova Novikova Stepanova", 25));
        people.add(new Person("Vanya", "Ivanov-Petrov-Sobolev-Makarov", 20));
        people.add(new Person("Petya", "Romanov", 50));
        people.add(new Person("Sasha", "Gromova Fedorova", 3));
        people.add(new Person("Glasha", "Gromova Popova", 30));

        Collections.sort(people, new PersonComparator(3));
        System.out.println(people);
    }
}
