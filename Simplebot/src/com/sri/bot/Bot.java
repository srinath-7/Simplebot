package com.sri.bot;

import java.util.Scanner;

public class Bot {

	final static Scanner scanner = new Scanner(System.in);

	public static void greet(String assistantName, String birthYear) {
		System.out.println("Hello! My name is " + assistantName + ".");
		System.out.println("I was created in " + birthYear + ".");
		System.out.println("Please, remind me your name.");
	}
	// reading a name

	public static void remindName() {
		String name = scanner.nextLine();
		System.out.println("What a great name you have, " + name + "!");
	}

	public static void guessAge() {
		System.out.println("Let me guess your age.");
		System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
//			Scanner sc = new Scanner(System.in);
		int remainder3 = scanner.nextInt();
		int remainder5 = scanner.nextInt();
		int remainder7 = scanner.nextInt();
		// reading all remainders
		int yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

		System.out.println("Your age is " + yourAge + ";" + "that's a good time to start programming!");

	}

	public static void count() {
		System.out.println("Now I will prove to you that I can count to any number you want.");
		int count = scanner.nextInt();

		for (int i = 0; i <= count; i++) {
			System.out.println(i);
		}
	}

	static void test() {
		System.out.println("Let's test your programming knowledge");
		System.out.println("Why do we use methods?");
		System.out.println("1. To repeat a statement multiple times.");
		System.out.println(("2. To decompose a program into several small subroutines"));
		System.out.println("3. To determine the execution of a program.");
		System.out.println("4. To interrupt the execution of the program.");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num == 2) {

		} else {
			System.out.println("Please, try again");
		}

	}

	public static void end() {
		System.out.println("Congratulations, have a nice day!");
	}
}
