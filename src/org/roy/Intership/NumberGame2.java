package org.roy.Intership;

import java.util.*;

public class NumberGame2 {

	static Scanner sc = new Scanner(System.in);

	public static void numberGame2() {
		// int number = 1 + (int)(100* Math.random());
		Random r = new Random();
		int number = r.nextInt(100);
		int trem = 3;

		int i, guess;

		System.out.println("guess the number 1 to 100");

		for (i = 0; i < trem; i++) {

			System.out.println("Guess the number:");

			guess = sc.nextInt();

			if (number == guess) {
				System.out.println("Congratulations!" + " You guessed the number.");
				break;
			} else if (number > guess && i != trem - 1) 
				System.out.println("The number is " + "greater than " + guess);
			else if (number < guess && i != trem - 1) 
				System.out.println("The number is" + " less than " + guess);
			
		}

		if (i == trem) {
			System.out.println("You have exhausted" + trem +"  trials.");

			System.out.println("The number was " + number);
		}
	}

	public static void main(String arg[]) {

		numberGame2();
	}
}
