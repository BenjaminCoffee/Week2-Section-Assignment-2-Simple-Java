import acm.program.*;

/*
 * Fibonacci.java extends ConsoleProgram.
 * This class contains a method which will print each sum
 * of the Fibonacci sequence up to 10,000.
 */
public class Fibonacci extends ConsoleProgram {
	
	private static final int MAX_TERM_VALUE = 10000;
	
	
	public void run() {
		int sum1 = 0;
		int sum2 = 1;
		int sum3 = 0;
		
		println("Display the Fibonacci sequence up to 10,000.");
		
		
		while(sum1 <= MAX_TERM_VALUE) {
			
			println(sum1);
			
			sum3 = sum1 + sum2;
			sum1 = sum2;
			sum2 = sum3;
		}
	}

}
