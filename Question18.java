package questions;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = scan.next();
		System.out.println("Enter the separator word");
		String sep = scan.next();;
		System.out.println("Enter the count");
		int count = scan.nextInt();
		String output ="";
		
		for(int i = 0; i < count ; i++) {
			output += word+" ";
		}
		output = output.trim().replace(" ", sep);
		System.out.println(output);
		

	}

}
