package javaE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateChars {

	public static void main(String[] args) {
		
		String text = "Hello";
		
		Set<Character> characters = new HashSet<>();
		Map<Character, Integer> dmap = new HashMap<>();
		
		for(int i=0; i<text.length(); i++) {
			
			if(!characters.add(text.charAt(i))) {
				
				dmap.put(text.charAt(i), dmap.get(text.charAt(i))+1);
			}
			else {
				dmap.put(text.charAt(i), 1);
			}
		}
		
		System.out.println(dmap);
		
		List<Entry<Character, Integer>> list = new ArrayList<>(dmap.entrySet());
		
		System.out.println(dmap.entrySet());
		System.out.println(list);
		
		Collections.sort(list, new Comparator<Entry<Character, Integer>>(){

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			
			}
			
		});
		
		
		System.out.println(list);
		System.out.println(list.get(list.size()-1));
		
	}
	
	
}
