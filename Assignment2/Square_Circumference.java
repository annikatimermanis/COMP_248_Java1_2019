// ------------------------------------------------------- 
// Assignment 2
// Written by: Annika Timermanis 40131128
// For COMP 248 Section (section P) – Fall 2019
// --------------------------------------------------------

/* This program calculates the circumference of a square, by prompting the user to enter the length of one side,
   it uses a for loop to present the square visually using '\' 's and 'X' 's. */

import java.util.Scanner;

public class Square_Circumference {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int length; // this int holds the length the user enters
		int circumference; // this int holds the value of the circumference calculated

		System.out.println("----------------------------------------------------");
		System.out.println("          Circumference Calculator");
		System.out.println("----------------------------------------------------");
		System.out.print("\n");
		System.out.println("Please enter the length of the side! ");
		length = keyboard.nextInt();

		circumference = length * 4; // this is the operation used to calculate the circumference
		System.out.println("The Circumference of the Square is " + circumference);

		int width = 0; // this int holds the value of the width
		int height = 0; // this int holds the value of the height

		/* the outer for loop is used for the height of the square (increments square vertically (adding one to the height)
		   once the value of the width is equivalent to the value of the length) */
		
		for (height = 1; height <= length; height++) {
			System.out.print("\t\t\t\t\t ");
			// we must fill in one row (specified by the height) at a time
			for (width = 1; width <= length; width++) { 
				// when the width == height, we mark '\' (our diagonal line), else we mark 'X'
				if (width == height) 
					System.out.print("\\ "); 
				else
					System.out.print("X ");
			}
			System.out.print("\n");
		}
		keyboard.close();

		/* Once a length is entered, the program will calculate and output the circumference, and represent it 
		   visually with X's and \'s. Once the Square has been produced, the program has terminated  */

	}
}

