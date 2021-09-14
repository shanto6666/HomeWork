package myFirstcalculator;

import java.util.Scanner;

// create class

public class Version1 {

// Executable method = main
	
public static void main(String[] args) {

	
// Create Scanner for taking input from user
Scanner input = new Scanner(System.in);	


double number1,number2,calculation;	// Declare variable
// Welcome
System.out.println("Welcome to my calculator");

System.out.println("====================================");

System.out.print("Please enter First number :");
//Getting first number from user
number1 =input.nextDouble();

System.out.print("Great! now enter Second number:");
//Getting second number from user

number2 =input.nextDouble();

calculation = number1 + number2;// Addition

System.out.println("Addition of two number = "+ calculation);

calculation = number1 - number2;// Subtraction

System.out.println("Subtraction of two number = "+ calculation);

calculation = number1* number2;// Multiplication

System.out.println("Multiplication of two number = "+ calculation);

calculation = number1 / number2;//Division

System.out.println("Division of two number = "+ calculation);

System.out.println("====================================");

System.out.println("Thank you for using my calculator");


input.close();// Scanner close


}	
	
	
	
	
		
}
