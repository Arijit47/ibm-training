import java.util.Arrays;
import java.util.HashMap;

public class MapsDemo {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("scott", "tiger");
		map.put("jack", "jili");
		map.put("polo", "lili");
		map.put("jack", "rose");

		System.out.println("Scott: " + map.get("scott"));
		System.out.println("Polo: " + map.get("polo"));
		System.out.println("Jack: " + map.get("jack"));
		System.out.println("----------------------------------");
		// print all keys and values without manually feeding keys

		System.out.println(Arrays.toString(map.entrySet().toArray()));
		System.out.println("----------------------------------");

		for (var entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("----------------------------------");
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
	}

}
