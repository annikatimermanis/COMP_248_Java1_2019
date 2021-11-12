// ------------------------------------------------------- 
// Assignment 2
// Written by: Annika Timermanis 40131128
// For COMP 248 Section (section P) – Fall 2019
// --------------------------------------------------------

/* This program uses a switch statement to allow a user to enter any number from 1-12, and outputs which month 
   it is in the Persian Calendar, the season it falls in and outputs a kind message associated with that season. 
   If the number entered is not between 1-12, then the program will tell you the input is invalid.*/

import java.util.Scanner;

// Persian Calendar month converter 
public class Seasons_Switch {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int userInput; 

		System.out.print("Please enter the Month as a number 1-12: ");
		userInput = keyboard.nextInt();

		//declaring a switch statement which will evaluate the number entered by user
		switch (userInput) {
		case 1: 
			System.out.println("We are in Farvardin, Happy Spring");
			//the breaks in the program terminate the switch statement
			break;
		case 2:
			System.out.println("We are in Ordibehesht, Happy Spring");
			break;
		case 3:
			System.out.println("We are in Khordad, Happy Spring");
			break;
		case 4:
			System.out.println("We are in Tir, Have Fun in summer");
			break;
		case 5:
			System.out.println("We are in Mordad, Have Fun in summer");
			break;
		case 6:
			System.out.println("We are in Shahrivar, Have Fun in summer");
			break;
		case 7:
			System.out.println("We are in Mehr, Ready For Fall");
			break;
		case 8:
			System.out.println("We are in Aban, Ready For Fall");
			break;
		case 9:
			System.out.println("We are in Azar, Ready For Fall");
			break;
		case 10:
			System.out.println("We are in Dey, Keep warm Yourself in Winter");
			break;
		case 11:
			System.out.println("We are in Bahman, Keep warm Yourself in Winter");
			break;
		case 12:
			System.out.println("We are in Esfand, Keep warm Yourself in Winter"); 
			break; 
			//the default is used in the case that the user enters an invalid number
		default:
			System.out.print("Not a valid month"); 
		}	
		keyboard.close();

		/* Once an input is entered, the program will output the month corresponding to the number entered (if number
	     is invalid it will output "Not a valid month"), and display a kind message associated with that season, once 
	     this is displayed, the program has terminated. */

	}

}
