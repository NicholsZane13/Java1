package java_1.dataTypes;

public class DataTypes {

		int number = 2021;
		String yearOfBirth = "1977";
		int[] nums = {3,4,5,6,7,8,10,12};
		String movieName = "Meet The Parents";
		char male = 'm';
		long triplet = 3L;
		char female = 'f';
		float decimalVal = .0000000000001f;
		String halfByte = "0101";


	public static void main(String[] args) {
		//the class fields defined in this DataTypes class have mistakes with either the data type, or the syntax.  Fix the data types so the main method correctly displays the value of all of the variables
		//For the methods below in this DataTypes class, determine the appropriate datatypes for the inputs and the outputs
		DataTypes dataType = new DataTypes();
		dataType.yearsToMonths(2);
		dataType.monthsToHours(8);
		dataType.daysToSeconds(5);
		dataType.centuriesToSeconds(3);
		dataType.dollarsToBitcoin(54000);
		dataType.canDrive(16);
		dataType.getDataTypes(1,true, 593);
	}

	public int yearsToMonths(int years){
			//	convert years to months using appropriate data types for the inputs and the outputs, 2 years => 24 months
			int monthsInYear = (years * 12);
		System.out.println(monthsInYear);
			return (monthsInYear);

		}


	public int monthsToHours(int months) {
		//	convert months to hours using appropriate data types for the inputs and the outputs, 8 months => 17520 hours
		int monthsToHours = (730 * months);
		System.out.println(monthsToHours);
		return (monthsToHours);
	}

	public int daysToSeconds(int days) {
		//	convert days to seconds using appropriate data types for the inputs and the outputs, 2 years => 17520 hours
		int dayToSeconds = (86400 * days);
		System.out.println(dayToSeconds);
		return (dayToSeconds);
	}

	public double centuriesToSeconds(double centuries) {
		//	convert centuries to seconds using appropriate data types for the inputs and the outputs, 1 century => 3.1556952 x 10^9 Seconds

		double centuriesToSeconds = centuries * (3.1556952);
		System.out.println(centuriesToSeconds);
		return (centuriesToSeconds);
	}

	public double dollarsToBitcoin(double dollars) {
		//	convert (usd) dollars $ to bitcoin using appropriate data types for the inputs and the outputs, $35,000 dollars  3.1556952 x 10^9 Seconds
		double dollarsToBitcoin = dollars * 0.000021;
		System.out.println(dollarsToBitcoin);
		return dollarsToBitcoin;
	}

	public boolean canDrive(int age) {
		//determine if the age passed in is ready to drive, return a value indicating whether or not the age passed in is ready to drive.
		if (age >= 16)
		{
			System.out.println("Can Drive!");
			return true;
		} else {
			System.out.println("Wait a while to get behind the wheel...");
			return false;
		}
	}

	public String[] getDataTypes(int num1, boolean bool1, long long1) {
//		get the data type of the three input variables; and return a string representation of the data types of the three variables as an array.
		return new String[]{null,null,null};

	}

}