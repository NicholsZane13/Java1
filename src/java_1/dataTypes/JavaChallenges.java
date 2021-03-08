package java_1.dataTypes;
import java.util.*;
import java.lang.Math;

public class JavaChallenges {

	public static void main(String[] args) {
		//solve the code challenges found in the static methods on this class
		JavaChallenges javaChallenges = new JavaChallenges();
		System.out.println(printMsg("Hello World ", 5));
		nthFibonacci(4);
		calcPay(1, 250, 2);
		solveQuadratic(5,6,9);
		countQuarters(19.75);
		reverseString("Hello Marcelo");
		shuffleMessage();
		calcGPA(new int[]{64, 88, 33});

	}




	static String printMsg(String msg, int repeats) {
		/* print the message to the console the amount of repeats specified for the 2nd parameter
		printMsg("hello world",3) =>
		hello world
		hello world
		hello world
		 */
		StringBuilder sb = new StringBuilder(msg.length() * repeats);
		for (int i = 0; i < repeats; i++)
			sb.append(msg);
		return sb.toString();
		};


	static int nthFibonacci(int n) {
		/*calculate the nth fibonacci number and return the value.  The first 4 fibonacci numbers are : 1, 1, 2, 3...  learn more : http://bit.ly/fibonacci-agile
		example : nthFibonacci(7) => 13
		 */
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		fibonacci.add(0);
		fibonacci.add(1);
		fibonacci.add(1);
		fibonacci.add(2);
		fibonacci.add(3);
		fibonacci.add(5);
		fibonacci.add(8);
		fibonacci.add(13);
		fibonacci.add(21);
		fibonacci.add(34);
		fibonacci.add(55);
		fibonacci.add(89);
		fibonacci.add(144);
		System.out.println(fibonacci.get(n));
		return fibonacci.get(n);
		}


	static double calcPay(int hrsPerPeriod, double hourlyRate, int payPeriods) {
/*		calculate the total payout to based on the hours worked for a given pay period, the hourly rate, and the # of pay periods.  return the total pay as output.
		12 hours / period, $50.00 / hr , 4 periods => calcPay(80,50.00,4) => 16000.00
		80 hours / period , $50.00 / hr, 8 periods => calcPay(80,25.00,8) => 16000.00
		1 hr / period, $250.00 / hr, 2 periods => calcPay(1,250.00,2) => 500.00
 */
		double payday = (hrsPerPeriod * hourlyRate) * payPeriods;
		System.out.println(payday);
		return payday;
	}

	static long solveQuadratic(int x, int y, int z) {
		/* compute a quadratic equation using the input parameters.  Recall that a quadratic equation has the format :  x^2 + y + z */
		double powerOfX = Math.pow(x, 2);
		double quad = powerOfX + y + z;
		System.out.println(quad);
		return (long) quad;

	}

	static int countQuarters(double amount) {
//		calculate the number of quarters that can be changed for the given amount.
//		$10.50 => countQuarters(10.50) => 42
		double quarters = (amount / .50);
		System.out.println(quarters);
		return (int) quarters;
	}

	static String reverseString(String str) {
		//reverse the input string and return it.
		StringBuilder output = new StringBuilder(str).reverse();
		System.out.println(output.toString());
		return output.toString();
	}

	 static void shuffleMessage() {
//		Create a String message by randomly combining the elements of the strings in the messages array.  The output should be randomized.
/*		["hi", "dear", "friend"] => shuffleMessage() => "hi dear friend";
		["hi", "dear", "friend"] => shuffleMessage() => "dear hi friend";
		["hi", "dear", "friend"] => shuffleMessage() => "friend dear hi";
*/
		 ArrayList<String>  messages = new ArrayList<>();
		 messages.add("how");
		 messages.add("was");
		 messages.add("your");
		 messages.add("weekend");
		 messages.add("lol");
		 messages.add("bye");

		 Collections.shuffle(messages);
		 System.out.println(messages);



	 }

	static double calcGPA(int[] scores) {
			/*calcGpa accepts an array of scores, representing a student's scores for a list of classes, and returns that student's
			overall GPA. The GPA ranges between 0.0 and 4.0 . Ignore any scores are outside the range of 0 to 100.
			Grading Scale :
			0 - 59 = 0.0
			60 - 69 - 1.0
			70 - 79 - 2.0
			80 - 89 - 3.0
			90 - 100 - 4.0
		 */
		int sum = 0;
		int i;
		for (i = 0; i < scores.length; i++)
			sum += scores[i];
		return sum;
//		System.out.println(sum);
//		avg = total/6;
//		System.out.print("The student Grade is: ");
//		if(avg>=80)
//		{
//			System.out.print("A");
//		}
//		else if(avg>=60 && avg<80)
//		{
//			System.out.print("B");
//		}
//		else if(avg>=40 && avg<60)
//		{
//			System.out.print("C");
//		}
//		else
//		{
//			System.out.print("D");
	};

	static void printEgg() {
		/*printEgg() => displays the following output:
			  _______
			 /       \
			/         \
			-"-'-"-'-"-
			\         /
			 \_______/

		*/
	}

	static class Item {
		String item;
		double cost;

		public Item(String item, double cost) {
			this.item = item;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Item{" +
					"item='" + item + '\'' +
					", cost=" + cost +
					'}';
		}
	}

		static double totaledReceipt(Item[] transactions) {

	//		Calculate the total amount of all items in the transactions array.  Note that each element of the transactions array is of type Item.
	//		[Item{ item : "pants" , cost : 20.00} , Item{ item : "iPhone", cost : 1100.00} ] => totaledReceipt() => 1120.00
			return 0.0;

		}
	}