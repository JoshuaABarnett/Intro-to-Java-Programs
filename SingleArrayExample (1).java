
public class SingleArrayExample {
	public static void main(String[] args) {

		// declare and create an array of size 10
		double[] myList = new double[5];

		java.util.Scanner input = new java.util.Scanner(System.in);
		// System.out.print("Enter " + myList.length + " values: ");

		// initialize array
		for (int i = 0; i < myList.length; i++) {
			// myList[i] = input.nextDouble();

			myList[i] = Math.random() * 100;
		}

		// print values in the array
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}

		// summing all elements in array
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}

		// find the max value within array
		double max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max)
				max = myList[i];
		}

		// another way to loop through array
		max = myList[0];
		for (double d : myList) {
			if (d > max)
				max = d;
		}

	}
}
