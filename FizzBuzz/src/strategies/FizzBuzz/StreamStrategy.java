package strategies.FizzBuzz;

import java.util.stream.IntStream;

public class StreamStrategy implements FizzBuzz {

	private int lowerBound;
	private int upperBound;
	
	public void doFizzBuzz() {
		
		IntStream.rangeClosed(lowerBound, upperBound).mapToObj(x -> "" + x).map(x -> {
		    if (Integer.parseInt(x) % (5 * 3) == 0) return "Fizzbuz";
		    if (Integer.parseInt(x) % 5 == 0) return "Buzz";
		    if (Integer.parseInt(x) % 3 == 0) return "Fizz";
		    return x;
		}).forEach(System.out::println);
	}

}
