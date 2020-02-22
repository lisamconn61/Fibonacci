package interview;

import java.util.ArrayList;

public class FibonacciSequence {

	
	public static void main(String[] args) {
	/* Modified Fibonacci Sequence with 26 elements with 
	 * alterations of sequence for any value > 26
	 */
		int compareNbr = 26;
		int prevVal = 0;
		int nextVal = 1;
		int sum = 0;
		ArrayList<Integer> fibonacciSequence = new ArrayList<Integer>();
		
		/* Loop through 26 elements, checking for values > 26, subtracting by 26
		 * and replace the value with the remainder
		 */
		
		while (fibonacciSequence.size() < 26) {

			if (nextVal <= compareNbr) {
				sum = prevVal + nextVal;
			} else {
				sum = nextVal - compareNbr;
			}
			
			if (sum <= compareNbr) {
				System.out.println("sum add: " + sum);
				fibonacciSequence.add(sum);
			}

			prevVal = nextVal;
			nextVal = sum;

		}
		
		for (Integer val : fibonacciSequence) {
			System.out.println(val.toString());
		}
	}
}
