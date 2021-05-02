package questions;

public class Question29 {

	public static void main(String[] args) {

		String sample = "Hello";
		System.out.println(limit(sample,4));

	}
	public static String limit(String word, int charCount) {
		
		if(charCount>0 && charCount<=word.length()) {
			word = word.substring(0,charCount);
		}
		else {
			word = "";
		}
		
		
		return word ;
	}

}
