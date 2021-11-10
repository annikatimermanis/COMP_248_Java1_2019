// ------------------------------------------------------- 
// Assignment 1
// Written by: Annika Timermanis 40131128
// For COMP 248 Section (section P) – Fall 2019
// --------------------------------------------------------

import java.util.Scanner;


/*This program takes a user's input (assuming it is a 5-digit number) and represents it as the 
number of hours, minutes and seconds. It determines if the input is a valid time (the if statement),
that is if it is 24 hours or less, and outputs the time as hh:mm:ss. If the input time is not valid, 
1) WE COULD SWAP OUR ENTIRE INPUT
2) WE COULD SWAP ONLY THE FIRST AND LAST DIGITS OF THE INPUT
The new time is calculated in hours, minutes and seconds.*/

public class TimeConverter 
{
	public static void main(String[] args) {

		Scanner Keyboard = new Scanner(System.in);
		final int SECONDS_IN_HOUR = 3600;
		final int MINUTES_IN_HOUR = 60; 
		int userinput; 		// int assigned to the 5 digit input the user will enter
		System.out.println("*************************************************"); 
		System.out.println("     Welcome to Time Converter Program"); 
		System.out.println("*************************************************\n\n");
		System.out.print("Please enter the seconds which will be converted: "); 

		userinput = Keyboard.nextInt(); 
		int total_hours = userinput / SECONDS_IN_HOUR; // total_hours represents the number of hours
		int total_mins = ((userinput - (total_hours*SECONDS_IN_HOUR))/MINUTES_IN_HOUR);// total_mins represents the number of minutes
		int total_secs = ((userinput - (total_hours*SECONDS_IN_HOUR) - (MINUTES_IN_HOUR*total_mins))); // total_secs represents the number of seconds 


		if (userinput <= 86400) /*the value entered by the user must be less than or equal to 24 hours (86400 seconds)*/
		{
			String tString = String.format("%02d:%02d:%02d", total_hours, total_mins, total_secs); /* this string allows the time format to 
																			   be expressed in double digits (00 rather than 0*/
			System.out.print("\n");
			System.out.print("The correspond hours, minutes, seconds is " + total_hours + " hrs, " + total_mins + " mins, " + total_secs + " secs.\n\n"); 
			System.out.print("The valid time is: "); 
			System.out.print(tString + ".");
			System.out.print("\n\n");
			System.out.println("Thank you for using the Time Converter Program!");
		} else {
			System.out.print("\n");
			System.out.print("The correspond hours, minutes, seconds is " + total_hours + " hrs, " + total_mins + " mins, " + total_secs + " secs.\n");
			System.out.print("\n");
			System.out.print("There is no valid time of your input.\n\n");
			int temp1 = userinput % 10; 		// temp1 allows us to isolate the last digit of the user input
			// 1) 
			// HERE WE WILL COMPLETELY SWAP THE INPUT STRING 
			// THIS WORKS FOR INPUTS > 86400
			String userinput_str = String.valueOf(userinput);
			int userinput_len = userinput_str.length();
			String divisor = "1";
			// we want to concatenate a value to divide our user input by, in order to access the first digit
			for (int i=0; i < userinput_len-2; i++) {
				divisor += "0";
			}
			char[] arr = new char[userinput_str.length()];
			for (int i = 0;i < userinput_str.length(); i++){
				arr[i] = userinput_str.charAt(i);
			}
			String invert_str = "";
			for (int i = userinput_str.length()-1;i >= 0; i--){
				invert_str+= arr[i];
			}
			int invert = Integer.parseInt(invert_str);
			int total_hours2 = invert / SECONDS_IN_HOUR; // total_hours2 represents the new number of hours after being swapped
			int total_mins2 = ((invert - (total_hours2*SECONDS_IN_HOUR))/MINUTES_IN_HOUR); //total_mins2 represents the number of minutes after being swapped
			int total_secs2 = ((invert - (total_hours2*SECONDS_IN_HOUR) - (MINUTES_IN_HOUR*total_mins2))); //total_secs2 represents the number of seconds after being swapped
			System.out.println("The swapped sequence of the input time is: " + invert_str);
			System.out.print("\n");
			System.out.println("The correspond hours, minutes, seconds is " + total_hours2 + " hrs, " + total_mins2 + " mins, " + total_secs2 + " secs.\n");
			System.out.println("Thank you for using the Time Converter Program!");
			
			// 2) 
//			// ALTERNATIVELY, WE COULD SWAP ONLY THE FIRST AND LAST DIGITS OF THE STRING INPUT
//			// THIS WORKS FOR 86400 < INPUTS < 100 000
//			int temp1 = userinput % 10;
//			int temp2 = userinput / 10000;
//			int invert = userinput - temp1 + temp2 - temp2*1000 + temp1*1000; // invert represents the new 5 digit number after switching the first and last numbers
//			int total_hours2 = invert / SECONDS_IN_HOUR; // total_hours2 represents the new number of hours after being swapped
//			int total_mins2 = ((invert - (total_hours2*SECONDS_IN_HOUR))/MINUTES_IN_HOUR); //total_mins2 represents the number of minutes after being swapped
//			int total_secs2 = ((invert - (total_hours2*SECONDS_IN_HOUR) - (MINUTES_IN_HOUR*total_mins2))); //total_secs2 represents the number of seconds after being swapped
//			System.out.println("The swapped sequence of the input time is: " + invert);
//			System.out.print("\n");
//			System.out.println("The correspond hours, minutes, seconds is " + total_hours2 + " hrs, " + total_mins2 + " mins, " + total_secs2 + " secs.\n");
//			System.out.println("Thank you for using the Time Converter Program!");
		}

		Keyboard.close();
	}

}
/* Once an input is entered, it will either produce the statements in the if condition, or the statements in the else condition,
	once the message Thank you for using the Time Converter Program! is displayed, the program has terminated. */


