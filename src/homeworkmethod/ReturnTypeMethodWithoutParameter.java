package homeworkmethod;

public class ReturnTypeMethodWithoutParameter {

	
	
	
public static void main(String[] args) {
	
ReturnTypeMethodWithoutParameter rtmwp=new ReturnTypeMethodWithoutParameter();	

rtmwp.doAddition();
rtmwp.doSubtraction();	
rtmwp.doMultiphication();	
ReturnTypeMethodWithoutParameter.getName();	
ReturnTypeMethodWithoutParameter.doHomeWork();	
	
	
}	
	
	
public int doAddition() {
	int number1=500;
	int number2=50;
	int number3  =number1+number2;
	System.out.println("Two number of addition : "+number3);
	return number3;
}	
	
	
public int  doSubtraction() {
	int number1=500;
	int number2=50;
	int number3  =number1-number2;
	System.out.println("Two number of subtraction : "+number3);
	return number3;
}		
	
	
	
public double  doMultiphication() {
	int number1=500;
	double number2=24.87;
	double number3  =number1*number2;
	System.out.println("Two number of multiphication : "+number3);
	return number3;
}		
	
public static String getName() {
	int age=41;	
	String name="Shanto";
	System.out.println("My Name is : "+name);
		return name ;
}		
	
public static String doHomeWork() {
	int quantity= 20;	
	String homeworkname=" Method";
	System.out.println("Our Homework Name is :"+homeworkname);
		return homeworkname ;
}			
	
	
	
	
	
}
