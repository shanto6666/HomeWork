package homeworkmethod;

public class ReturnTypeMethodWithParameter {

	
	
public static void main(String[] args) {
	
ReturnTypeMethodWithParameter rtmwp=new ReturnTypeMethodWithParameter();	
	
rtmwp.doAddition(72, 28);	
rtmwp.doSubtraction(500.00, 60.65, 2.88);	
rtmwp.doMultiplyValueUsingFourNumber(20, 10.33, 30, 12.12);
ReturnTypeMethodWithParameter.getJobDetails("QA Automation Engineer", 100000.00);	
ReturnTypeMethodWithParameter.isTicketAvailable("ticket", 'D', 50);
	
	
	
}	
	
//Return Type Method With Parameter/Dynamic method	
	
public int doAddition(int number1, int number2) {
	int number3  =number1+number2;
	System.out.println("Two Number of Addition : "+number3);
	return number3;
}	

public double doSubtraction(double number1, double number2, double number3) {
	double calculation=number1-number2-number3;
	System.out.println("Three Numbers of subtraction : "+calculation);
	return calculation;
}

public double doMultiplyValueUsingFourNumber(int num1, double num2, int num3, double num4) {
	double calculation=num1*num2*num3*num4;
	System.out.println("Four Numbers of multiphication : "+calculation);
	return calculation;
}

public static String getJobDetails(String jobname, double salary) {
	

	System.out.println("Job  Name : "+jobname);
	System.out.println("salary : "+salary);
	return jobname ;
}

public static boolean isTicketAvailable(String ticket, char day, int price) {
	
	char dayticket=day;
	int ticketPrice=price;
	
	if (dayticket=='N') {
		System.out.println("Yes Day ticket is avaialable");
	} else {
		System.out.println("No Day ticket is not avaialable");
	}
	
	return dayticket=='D';
}


}
