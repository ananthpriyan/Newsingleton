package org.strings;

import java.util.Scanner;

public class AddsomeAmountByUser {

	public static void main(String[] args) {
		
		String s="I have 200 rupees";
		String s="I have 300 rupees"; // 31122023   01Zycus
		String s="I have 400 rupees";   //3112023 01ZycusB
		
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
