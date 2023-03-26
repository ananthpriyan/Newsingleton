package org.strings;

import java.util.Scanner;

public class AddSomeAm {
	//this is not singleton program
	
	
	String single="jgjgjgdsjhg";
	
	
	
	
	
	
	public static void main(String[] args) {
	
		String s="I Have 100 Rupees";
		
		String add = "";
		String[] split = s.split(" ");
		
		
		String string = split[2];
		
		int int1 = Integer.parseInt(string);
		
		
		System.out.println(split[3]);
		
		
		Scanner scan=new Scanner(System.in);
		
		int nextInt = scan.nextInt();
		
		
		for (int i = 0; i < split.length; i++) {
			
			
			if (i==2) {
			
				add=add+(int1+nextInt)+" ";
				continue;
			}
			
	
		String d=split[i]+" ";
		
		add=add+d;
		
	}
		System.out.println(add);
		
		
	}
	
	
}
