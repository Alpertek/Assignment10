package questions;

public class Question20 {

	public static void main(String[] args) {

		int result = 1;
		int factorial = 5;

		for (int i = 1; i <= factorial; i++) {

			result *= i;

		}

		System.out.println(factorial + "! = " + result);

	}

}
