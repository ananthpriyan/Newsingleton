package org.strings;

public class NotepadProgram {
	
	public static void main(String[]  args){


		String s="welcome to automation interview";

		String s1="";
		String[] split=s.split(" ");

		for(String s2:split){
		 char s3=s2.charAt(0);
		 char s4=Character.toUpperCase(s3);
		String s5=s2.substring(1);

		s1=s1+s4+s5+" ";

		}

		System.out.println("First letter should be in caps:"+s1);
		}


}
