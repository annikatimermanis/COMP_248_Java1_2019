// ------------------------------------------------------- 
// Assignment 2
// Written by: Annika Timermanis 40131128
// For COMP 248 Section (section P) – Fall 2019
// --------------------------------------------------------

/*This program uses else/if statements to allow a user to enter any number from 1-12, and outputs which 
  month it is in the Persian Calendar, the season it falls in and outputs a kind message associated with 
  that season. If the number entered is not between 1-12, then the program will tell you the input is 
  invalid.*/

import java.util.Scanner;

public class Seasons_Conditional {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int userInput;
		System.out.print("Please enter the Month as a number 1-12: ");
		userInput = keyboard.nextInt();
		
		//a series of if else statements to determine what month and season the number entered by the user falls in
		if(userInput == 1)
		{
			System.out.println("We are in Farvardin, Happy Spring");
		}
		else if (userInput == 2)
		{
			System.out.println("We are in Ordibehesht, Happy Spring");
		}
		else if (userInput == 3)
		{
			System.out.println("We are in Khordad, Happy Spring");
		}
		else if (userInput == 4)
		{
			System.out.println("We are in Tir, Have Fun in summer");
		}
		else if (userInput == 5)
		{
			System.out.println("We are in Mordad, Have Fun in summer");
		}
		else if (userInput == 6)
		{
			System.out.println("We are in Shahrivar, Have Fun in summer");
		}
		else if (userInput == 7)
		{
			System.out.println("We are in Mehr, Ready For Fall");
		}
		else if (userInput == 8)
		{
			System.out.println("We are in Aban, Ready For Fall");
		}
		else if (userInput == 9)
		{
			System.out.println("We are in Azar, Ready For Fall");
		}
		else if (userInput == 10)
		{
			System.out.println("We are in Dey, Keep warm Yourself in Winter");
		}
		else if (userInput == 11)
		{
			System.out.println("We are in Bahman, Keep warm Yourself in Winter");
		}
		else if (userInput == 12)
		{
			System.out.println("We are in Esfand, Keep warm Yourself in Winter");
		}
		else
		{
			System.out.print("Not a valid month");
		}

		keyboard.close();

		/* Once an input is entered, the program will output the month corresponding to the number entered (if number
		   is invalid it will output "Not a valid month"), and display a kind message associated with that season, once 
		   this is displayed, the program has terminated. */
	}
}
