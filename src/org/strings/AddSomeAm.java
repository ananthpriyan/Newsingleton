package org.strings;

import java.util.Scanner;

public class AddSomeAm {
	
	public static void main(String[] args) {
	
		
		String s="I Have 100 Rupees";
		String s="I Have 200 Rupees";  // 31122023    01Zycus
		String s="I Have 500 Rupees"; //31122023   01 Zycus B
		
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
		System.out.println(" Nila 26 th message");
		System.out.println("This message Master git Checking purpose");
		System.out.println("This message Anand first commit git Checking purpose");
		
	}
	
	
}
