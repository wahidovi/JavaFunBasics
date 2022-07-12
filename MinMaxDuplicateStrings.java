package javaE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MinMaxDuplicateStrings {

	public static void main(String[] args) {

		String text = "heRRRRRRelllooz";

		Set<Character> uChar = new HashSet<>();
		Map<Character, Integer> dmap = new HashMap<>();
		for (int i = 0; i < text.length(); i++) {

			if (!uChar.add(text.charAt(i))) {
				dmap.put(text.charAt(i), dmap.get(text.charAt(i)) + 1);

			} else {
				dmap.put(text.charAt(i), 1);
			}

		}

		System.out.println(dmap);

		Map<Character, Integer> max = new HashMap<>();
		
		List<Integer> list = new ArrayList<>(dmap.values());

		Collections.sort(list);

		System.out.println(list);

		int ls = list.size();

		for (Map.Entry<Character, Integer> pair : dmap.entrySet()) {

			
			if(pair.getValue()==list.get(ls-1)) { //max
				max.put(pair.getKey(), pair.getValue());
			}
			if(pair.getValue()==list.get(0)) { //min
				max.put(pair.getKey(), pair.getValue());
			}
			
			
		}
		
		System.out.println(max);
	}
}
