package org.strings;

import java.util.Scanner;

public class AddsomeAmountByUser {

	public static void main(String[] args) {
		
		String s="I have 200 rupees";
		
		String op="";
		
		String[] split = s.split(" ");
		
		String s1 = split[2];
		
		int x = Integer.parseInt(s1);
		
		Scanner scan=new Scanner(System.in);
		
		int nextInt = scan.nextInt();
		
		for (int i = 0; i < split.length; i++) {
			
			if (i==2) {
				
				op=op+(x+nextInt)+" ";
		        continue;
			}
			
			String d = split[i]+" ";
			
			op=op+d;
		}
	
		System.out.println(op);
		
	}
	
}
