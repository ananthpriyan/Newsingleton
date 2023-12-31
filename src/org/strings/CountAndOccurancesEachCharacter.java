package org.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountAndOccurancesEachCharacter {
	
	
	public static void main(String[] args) {
		
		String s="Hello Anandharaj";
		String s="Hello Anandharaj"; // 31122023  01ZycusB
		 
		String output="";
		
		Map<Character,Integer> m=new LinkedHashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			
			char c=s.charAt(i);
			
			if (m.containsKey(c)) {
				m.put(c, m.get(c)+1);
				
			}
			else {
				m.put(c,1);
			}
			
		}
		
		Set<Entry<Character, Integer>> entrySet = m.entrySet();
		
		//System.out.println(entrySet);
		
	for (Entry<Character, Integer> entry : entrySet) {
		
			output=output+entry.getKey()+"------>"+ entry.getValue()+" ";
			
		}
		
		System.out.println(output);
		
	}

}
