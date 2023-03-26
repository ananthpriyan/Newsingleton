package org.strings;

public class Reverse {
	
	
	public static void main(String[] args) {
		
		String s="HELLO WORLD";
		
		//charAt(index);---->method 
		int len = s.length();
		
		String op="";
		
		for (int j = len-1; j >=0; j--) {
			
			char charAt = s.charAt(j);
			op=op+charAt;
		}
		
		System.out.println(op);
		
	}
	

	

}
