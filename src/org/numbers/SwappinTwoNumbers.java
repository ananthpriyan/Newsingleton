package org.numbers;

public class SwappinTwoNumbers {

	public static void main(String[] args) {

		// Swapping of two numbers with using 3rd variable
		int a = 10, b = 20, temp = 0;

		System.out.println("Before swapping");
		System.out.println("A=" + a);
		System.out.println("B=" + b);

		temp = temp + a;
		a = b;
		b = temp;

		System.out.println("After swapping");
		System.out.println("A=" + a);
		System.out.println("B=" + b);

		// Swapping of two number without using 3rd variable
		
		int e = 20, f = 40;
		System.out.println("Before swapping");
		System.out.println("E=" + e);
		System.out.println("F=" + f);

		e = e + f; // 60
		f = e - f; // 20
		e = e - f; // 40

		System.out.println("After swapping");
		System.out.println("E=" + e);
		System.out.println("F=" + f);

	}

}
