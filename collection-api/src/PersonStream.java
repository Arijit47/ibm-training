import java.util.LinkedList;
import java.util.stream.Stream;

public class PersonStream {

	public static void main(String[] args) {
		LinkedList<Person> pa = new LinkedList<Person>();

		pa.add(new Person("Polo", 21));
		pa.add(new Person("Scott", 17));
		pa.add(new Person("Jack", 23));
		pa.add(new Person("Rose", 20));
		pa.add(new Person("Lilly", 16));

		pa.stream().filter(p -> p.getAge() > 18).forEach(System.out::println);
		System.out.println("-------------------------------------------");
		System.out.println(pa.stream().findFirst());

		pa.stream().sorted().forEach(System.out::println);
	}
}
