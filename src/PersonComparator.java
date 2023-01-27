import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    private int maxWords;

    public PersonComparator(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] surname1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        String[] surname2 = o2.getSurname().split("\\P{IsAlphabetic}+");

        if (surname1.length >= maxWords && surname2.length >= maxWords || surname1.length == surname2.length) {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
        return surname2.length > surname1.length ? 1 : -1;
    }
}
