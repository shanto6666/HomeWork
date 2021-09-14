package myFirstcalculator;

import java.util.Scanner;

// create class

public class Version1 {

// Executable method = main
	
public static void main(String[] args) {

	
// Create Scanner for taking input from user
Scanner input = new Scanner(System.in);	


int num1,num2,calculation;	// Declare variable
// Welcome
System.out.println("Welcome to my calculator");

System.out.print(" Pleasee enter First number :");
//Getting first number from user
num1 =input.nextInt();


System.out.print("Great! now enter Second number:");
//Getting second number from user
num2 =input.nextInt();

calculation = num1 + num2;// Addition

System.out.println("Addition of two number = "+ calculation);

calculation = num1 - num2;// Subtraction

System.out.println("Subtraction of two number = "+ calculation);

calculation = num1* num2;// Multiplication

System.out.println("Multiplication of two number = "+ calculation);

calculation = num1 / num2;//Division

System.out.println("Division of two number = "+ calculation);


System.out.println("Thank you for using my calculator");

input.close();// Scanner close


}	
	
	
	
	
		
}
