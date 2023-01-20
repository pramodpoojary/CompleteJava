import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String, Integer> empMaps = new HashMap<>();

		empMaps.put("Pramod", 12345);
		empMaps.put("Poojary", 12346);
		empMaps.put("Pro", 12347);
		empMaps.put("Mode", 12348);

		System.out.println(empMaps);

		empMaps.replace("Mode", 1345678);
		System.out.println(empMaps);

		empMaps.putIfAbsent("Pro", 15585);
		System.out.println(empMaps);
	}
}
