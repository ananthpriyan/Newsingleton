package org.numbers;

public class AddorEven {

	public static void main(String[] args) {

		// To print sum and count of given odd or even number
		int count = 0, sum = 0;

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 1) {

				System.out.println(i);
				count++;
				sum = sum + i;

			}

		}
		System.out.println("sum    :" + sum);
		System.out.println("count    :" + count);

		// To print odd or even number

		int a = 10;
		if (a % 2 == 0) {

			System.out.println("Even");

		}

		else {
			System.out.println("odd");
		}
	}
}
