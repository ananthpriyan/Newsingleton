package org.strings;

public class Reverse {

	public static void main(String[] args) {

		String s1 = "Welcome to Automation";

		String s2 = "";

		String[] split = s1.split(" ");

		for (String eachword : split) {
			String s3 = "";

			for (int i = eachword.length() - 1; i >= 0; i--) {

				char c = eachword.charAt(i);
				s3 = s3 + c;
			}
			s2 = s2 + s3 + " ";
		}
		System.out.println("Each reversed word  :" + s2);
	}

	//
	// String s="welcome to automation interview";
	//
	// String s1= "";
	// String s5= "";
	// String[] split=s.split(" ");
	//
	// int len=s.length();
	//
	// System.out.println(len);
	//
	// for (int i = len-1; i >=0; i--) {
	//
	// char charAt = s.charAt(i);
	//
	// s1=s1+charAt+" ";
	//
	//
	// }
	//
	//
	// System.out.println(s1);
	//
	//
	//
	// for (String eachword : split) {
	//
	// String s2="";
	//
	// for (int i =eachword.length()-1 ; i >=0; i--) {
	//
	// char charAt = eachword.charAt(i);
	// s2=s2+charAt;
	//
	// }
	//
	// s5=s5+s2+" ";
	// }
	//
	//
	// System.out.println("Each word reverse :"+s5);
	//
	//
	//
	//
	//
	//

	// String s="HELLO WORLD";
	//
	// //charAt(index);---->method
	// int len = s.length();
	//
	// String op="";
	//
	// for (int j = len-1; j >=0; j--) {
	//
	// char charAt = s.charAt(j);
	// op=op+charAt;
	// }

	// System.out.println(op);

}
