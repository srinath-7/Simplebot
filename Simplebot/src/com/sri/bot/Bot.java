package com.sri.bot;

import java.util.Scanner;

public class Bot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Hello! My name is Aid.");
		System.out.println("I was created in 2018.");
		System.out.println("Please, remind me your name.");

		// reading a name

		String yourName = sc.nextLine();

		System.out.println("What a great name you have " + yourName + "!");
		System.out.println("Let me guess your age.");
		System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
		int remainder3 = sc.nextInt();
		int remainder5 = sc.nextInt();
		int remainder7 = sc.nextInt();
		// reading all remainders
		int yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

		System.out.println("Your age is " + yourAge + ";" + "that's a good time to start programming!");
		System.out.println("Now I will prove to you that I can count to any number you want.");

		int count = sc.nextInt();

		for (int i = 0; i <= count; i++) {
			System.out.println(i + "!");
		}
	}

}
