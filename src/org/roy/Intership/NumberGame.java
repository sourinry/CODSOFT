package org.roy.Intership;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//O(n)
		Random r = new Random();// i used over here Random class of util package java or i can used[int number =
								// 1 + (int)(100* Math.random());]
		int number = r.nextInt(100);
		//System.out.println(number);
		System.out.println("guess the number with in 3 try you can choose your number bitween 1 to 100");
		int term = 3, i, guess;
		for (i = 0; i < term; i++) {
			System.out.println("enter your number");
			guess = sc.nextInt();

			if (guess == number) {
				System.out.println("your guessing number is correct the number is:=> " + number
						+ " & your guessed number also:=> " + guess);
				break;
			} else if (number < guess && i != term - i)
				System.out.println(guess + " number is too high");
			else if ((number ^ guess) == 0 && i != term - i){// i can bitwise operator
				System.out.println(guess + " number is too low");
			}

		}
		if (i == term) {
			System.out.println("better luck next time the number is:=> " + number);
		}
	}

}
