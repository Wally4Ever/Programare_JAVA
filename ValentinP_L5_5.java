
/*Define a String Array. Using lambda expressions sort it by the following criteria: length (small->large), inverse length
(large->small), alphabetical order, the strings which start with the letter M are first, then come the rest.*/

import java.util.Arrays;
import java.util.Comparator;

public class ValentinP_L5_5 {
	public static void main(String[] args) {
		String[] strings = { "Apple", "Orange", "Mango", "Strawberry", "Dingleberry", "Fig" };

		// small to large
		Arrays.sort(strings, Comparator.comparing(String::length));
		System.out.println(Arrays.toString(strings));

		// large to small
		Arrays.sort(strings, Comparator.comparing(String::length).reversed());
		System.out.println(Arrays.toString(strings));

		// Sort alphabetically
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));

		// first letter M
		Arrays.sort(strings, (s1, s2) -> {
			if (s1.startsWith("M") && !s2.startsWith("M")) {
				return -1;
			} else if (!s1.startsWith("M") && s2.startsWith("M")) {
				return 1;
			} else {
				return s1.compareTo(s2);
			}
		});
		System.out.println(Arrays.toString(strings));
	}
}
