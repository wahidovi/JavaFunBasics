package javaE;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DuplicateChar {

	public static void main(String[] args) {

		Set<Character> uniqueChar = new HashSet<>();
		Map<Character, Integer> dmap = new TreeMap<>();

		String a = "Hello";
		int occur = 0;

		for (int i = 0; i < a.length(); i++)
			uniqueChar.add(a.charAt(i));

		// System.out.println(uniqueChar);

		for (Character c : uniqueChar) {
			// System.out.println(c);

			for (int i = 0; i < a.length(); i++) {
				if (c == a.charAt(i)) {
					occur++;
				}
			}
			dmap.put(c, occur);
			occur = 0;

		}

		System.out.println(dmap);
	}
}
