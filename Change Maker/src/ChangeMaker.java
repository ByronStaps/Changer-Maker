

/**
 * 
 * @author Byron Staples
 * @version 1.0
 *Project 1 - Change Maker

Problem: 

you have to give someone change 

what coins do you give that person? 

Requirements: 

takes user input 

displays the change breakdown as output

1. Understand and Define the Problem 

 ask user for input, US coins (quarter, dime, nickel, penny),  max change: 99¢  display coin output ,

 What’s involved?  

interview users. What are their expectations? What data do they need to access? write a requirements analysis report


2. Determine Input and Output 

Typed input by user: amount of change requested (an integer between 1 and 99) 

Printed output:  

Number of quarters given  

Number of dimes given  

Number of nickels given  

Number of pennies given
 *
 *
 */
import java.util.Scanner;
public class ChangeMaker {
	/**
	 *  The user expectations is to have a program that tells the user how much 
	 *  change someone should recieve in Quaters, Dimes, Nickles, Penny. 
	 *  The data needed for this program to run is the user input and output would 
	 *  tell the user the correct change. 
	 * @param args No args
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a change amount ");
		int money = input.nextInt();

		if(money >= 100) {
			System.out.print("error enter a number 1-99 ");
		}else{

			int numofQuaters = money/25;
			System.out.println("Number of Quaters " + numofQuaters);
			money-= numofQuaters * 25;

			int numofDimes = money/10;
			System.out.println ("Number of Dimes " + numofDimes);
			money-= numofDimes * 10;

			int numofNickles = money/5;
			System.out.println ("Number of Nickles " + numofNickles);
			money-= numofNickles * 5;

			int numofPenny = money/1;
			System.out.println ("Number of Pennys " + numofPenny);
			money-= numofPenny * 1;
		}
	}



}
