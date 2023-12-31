package org.strings;

public class LowerandUppercasecount {

	public static void main(String[] args) {

		String s = "Hello World";
		String s = "Hello World";  // 3112023  01ZycusB
		String s = "Hello World"; //31122023    01Zycus

		String lowercase = "";
		String uppercase = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (Character.isUpperCase(c)) {

				uppercase = uppercase + c;

			}

			else if (Character.isLowerCase(c)) {

				lowercase = lowercase + c;

			}

		}
		System.out.println("Upper case :" + uppercase);
		System.out.println("Lower case :" + lowercase);

		String s2 = "automation testing";
		String s3 = "";
		String[] split = s2.split(" ");

		for (String s4 : split) {
			char charAt = s4.charAt(0);
			char c = Character.toUpperCase(charAt);
			String substring = s4.substring(1);
			s3 = s3 + c + substring + " ";
		}
		System.out.println(s3);
	}

}
