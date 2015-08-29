package strategies.FizzBuzz;

public class LoopStrategy implements FizzBuzz {

	private int lowerBound;
	private int upperBound;
	
	public void doFizzBuzz() {
		
		for (int x = lowerBound; x < upperBound; x++) {
			if (x % (5*3) == 0)
				System.out.println("FizzBuzz");
			else if (x % 5 == 0)
				System.out.println("Buzz");
			else if (x % 3 == 0)
				System.out.println("Fizz");
			else
				System.out.println(x);
		}
		
	}

}
