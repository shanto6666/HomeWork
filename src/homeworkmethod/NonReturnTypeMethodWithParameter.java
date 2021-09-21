package homeworkmethod;

public class NonReturnTypeMethodWithParameter {

	public static void main(String[] args) {
		NonReturnTypeMethodWithParameter nrtwp = new NonReturnTypeMethodWithParameter();

		NonReturnTypeMethodWithParameter.doAddition(500, 50);
		NonReturnTypeMethodWithParameter.doSubtraction(500, 50);
		NonReturnTypeMethodWithParameter.doMultiphication(500, 50);
		nrtwp.doDivition(500, 50);
		nrtwp.doReminder(500.00, 30.00);

	}
//NonReturn Type Method With Parameter	

	public static void doAddition(int number1, int number2) {
		int addition = number1 + number2;
		System.out.println("Two number of addition : " + addition);

	}

	public static void doSubtraction(int number1, int number2) {
		int subtraction = number1 - number2;
		System.out.println("Two number of subtraction : " + subtraction);

	}

	public static void doMultiphication(int number1, int number2) {
		int multiphly = number1 * number2;
		System.out.println("Two number of Multiphication : " + multiphly);

	}

	public void doDivition(int number1, int number2) {
		int divition = number1 / number2;
		System.out.println("Two number of divition : " + divition);

	}

	public void doReminder(double number1, double number2) {
		double reminder = number1 % number2;
		System.out.println("Two number of reminder : " + reminder);

	}

}
