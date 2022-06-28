package javaE;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DuplicateChar2 {

	public static void main(String[] args) {

		Set<Character> uniqueChar = new HashSet<>();
		Map<Character, Integer> dmap = new TreeMap<>();

		String a = "HHellollooe";
		
		int k = 1;
		
		
		
		for (int i = 0; i < a.length(); i++) {
			
			
			if(!uniqueChar.add(a.charAt(i))) {
				
				dmap.put(a.charAt(i), dmap.get(a.charAt(i)) + 1);
				
				
			}
			else {
				dmap.put(a.charAt(i), k);
			}
		}

		System.out.println(dmap);
	}
}
