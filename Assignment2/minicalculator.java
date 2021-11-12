// ------------------------------------------------------- 
// Assignment 2
// Written by: Annika Timermanis 40131128
// For COMP 248 Section (section P) – Fall 2019
// --------------------------------------------------------

/* This program prompts a user to enter any number (converted to string "operand1"), followed by one of the four operations, 
   "+" (addition), "-" (subtraction), "x" (multiplication), "/" (division), followed by a final number (converted to string 
   "operand2"). We also assume the user enters their input "operand1operationoperand2" with no spaces. The program calculates
    the user input using a while loop and outputs the the calculated answer. The program will only terminate once 'q' is pressed.*/

import java.util.Scanner;

public class minicalculator {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hello to mini calculator program.");

		String userInput = " "; //initial value of string user input (the default)
		String operand1; // this string holds the value of operand1 in the userInput string, it is obtained using the substring method
		String operand2; // this string holds the value of operand2 in the userInput string, it is obtained using the substring method
		double answer; // this double holds the value of the answer of the operation that the user inputs

		//the while loop allows the program to continue asking the user to enter numbers along operation until 'q' is entered
		while(!userInput.equals("q")) {
			System.out.print("\n");
			System.out.println("Please enter the numbers along operation (press q to exit): "); 
			System.out.print("\n");
			userInput = keyboard.next();

			if (userInput.contains("+")) {
				int plus = userInput.indexOf('+'); //locating the index of the '+' character in userInput string
				/*using the substring method to obtain operand1 and operand2 from userInput string (the same method is 
				applied in the following else if statements)*/
				operand1 = userInput.substring(0,plus); 
				operand2 = userInput.substring(plus + 1, userInput.length());
				answer = Integer.parseInt(operand1) + Integer.parseInt(operand2); //converts numerical string to an integer
				System.out.print("\n");
				System.out.print("The answer is: " + answer);
			}
			else if (userInput.contains("-")) {
				int minus = userInput.indexOf('-'); //locating the index of the '-' character in userInput string
				operand1 = userInput.substring(0,minus);
				operand2 = userInput.substring(minus + 1, userInput.length());
				answer = Integer.parseInt(operand1) - Integer.parseInt(operand2); //converts numerical string to an integer
				System.out.print("\n");
				System.out.print("The answer is: " + answer);
			}
			else if (userInput.contains("x")) { 
				int multiplier = userInput.indexOf('x'); //locating the index of the 'x' character in userInput string
				operand1 = userInput.substring(0,multiplier);
				operand2 = userInput.substring(multiplier + 1, userInput.length());
				answer = Integer.parseInt(operand1) * Integer.parseInt(operand2); //converts numerical string to an integer
				System.out.print("The answer is: " + answer);
			}
			else if (userInput.contains("*")) { 
				int multiplier = userInput.indexOf('*'); //locating the index of the 'x' character in userInput string
				operand1 = userInput.substring(0,multiplier);
				operand2 = userInput.substring(multiplier + 1, userInput.length());
				answer = Integer.parseInt(operand1) * Integer.parseInt(operand2); //converts numerical string to an integer
				System.out.print("The answer is: " + answer);
			}
			else if (userInput.contains("/")) {
				int divider = userInput.indexOf('/'); //locating the index of the '/' character in userInput string
				operand1 = userInput.substring(0,divider);
				operand2 = userInput.substring(divider + 1, userInput.length());
				answer = Integer.parseInt(operand1)/ Integer.parseInt(operand2); //converts numerical string to an integer
				System.out.print("\n");
				System.out.print("The answer is: " + answer);
			}
		}
		if(userInput.equals("q")) {
			System.out.print("\n");
			System.out.println("Thanks for using mini calculator program. ");
		}
		keyboard.close();

		// Once 'q' has been pressed, the program has terminated.
	}
}



