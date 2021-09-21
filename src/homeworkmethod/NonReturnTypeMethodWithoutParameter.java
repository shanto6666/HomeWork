package homeworkmethod;

// create class
public class NonReturnTypeMethodWithoutParameter {

// create main method	
	public static void main(String[] args) {

		NonReturnTypeMethodWithoutParameter nrtm = new NonReturnTypeMethodWithoutParameter();
		NonReturnTypeMethodWithoutParameter.getName();
		NonReturnTypeMethodWithoutParameter.getAge();
		NonReturnTypeMethodWithoutParameter.getPersonalInf();
		nrtm.getProfessionalInformation();
		nrtm.getAddressInf();

	}
// Non Return  Type Method without Parameter:

	public static void getName() {

		String name = "Shanto";
		System.out.println("My Name is :" + name);

	}

	public static void getAge() {
		int age = 41;
		System.out.println("I am " + age + " " + "years old");

	}

	public static void getPersonalInf() {
		String gender = "Male";
		System.out.println("Gender:" + " " + gender);
	}

	public void getProfessionalInformation() {

		String Profession = "QA Automation Engineer";
		double Salary = 100000.00;

		System.out.println("My Profession is: " + Profession);
		System.out.println("Salary: " + Salary);

	}

	public void getAddressInf() {

		int HouseNumber = 15015;
		String RoadName = "107 Ave";
		String City = "Jamaica";
		System.out.println("My House Number : " + HouseNumber);
		System.out.println("Road Name : " + RoadName);
		System.out.print("City: " + City);

	}

}
