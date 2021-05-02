package questions;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String result = "";
		System.out.println("Enter the first character");
		String first = scan.next();
		first = first.charAt(0) + "";
		System.out.println("Enter the second character");
		String second = scan.next();
		second = second.charAt(0) + "";
		
			
		if (first.equals(first.toLowerCase())) {
			result = createOutput(first,second);
		} else {
			result = createOutput(first, second);
		}
		System.out.println(result);		

	}
	public static String createOutput(String f, String s) {
		int first = f.charAt(0); 
		int second = s.charAt(0);
		String output = "";
		if (first <= second) {
			for (int i = first; i <= second; i++) {
				output += (char)i +"";
			}
		} else {
			for (int i = first; i >= second; i--) {
				output += (char)i +"";
			}
		}
		return output;	
	}

}
