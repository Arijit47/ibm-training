import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {

	public static void main(String[] args) {

		Comparator<Person> compAge = (p1, p2) -> p1.getAge() - p2.getAge();

		Comparator<Person> compName = (p1, p2) -> p1.getName().compareTo(p2.getName());

		TreeSet<Person> people = new TreeSet<>(compAge);
		people.add(new Person("Polo", 21));
		people.add(new Person("Jack", 25));
		people.add(new Person("Lili", 23));
		people.add(new Person("Scott", 22));

		for (Person p : people)
			System.out.println(p);

		System.out.println("--------------------------------");

		TreeSet<Person> people2 = new TreeSet<>();
		people2.add(new Person("Polo", 21));
		people2.add(new Person("Jack", 25));
		people2.add(new Person("Lili", 23));
		people2.add(new Person("Scott", 22));

		for (Person p2 : people2)
			System.out.println(p2);
	}
}
