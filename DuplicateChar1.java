package javaE;

import java.util.HashMap;

public class DuplicateChar1 {

	public static void main(String[] args) {
		String a = "hhelloloy";
		char d = '\0';

		int k = 1;
		int num = 0;
		
		HashMap<Character, Integer> dmap = new HashMap<>();
		
		/*
		 *    Select a char and scan the whole char array (string) 
		 *    to see how many time it occurs
		 *    
		 *    
		 */
		
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != d) { 
				/*  search for each individual char 
				 *  means if we count how many 'l' we have
				 *  we do not need to count it again
				 * */
				
				num = 0; //reset n
				for (int j = 0; j < a.length(); j++) {

					if (a.charAt(i) == a.charAt(j)) {
						
						k++; // k count the occurrence. how many of same char we have
						num = k;
						d = a.charAt(j); // d holds the current char we checked
										// it helps the above to avoid counting 
										// for same char multiple times
					}
				}
				k = 1;
				num = num - 1;
				dmap.put(d, (num)); // dmap is a hashMap that holds the duplicate 
			}
		} System.out.println(dmap);
	} 

}
