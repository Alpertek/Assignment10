package questions;

public class Question31 {

	public static void main(String[] args) {
		

		String pal = "race car";
		System.out.println(isPalindrome(pal));
	}
	public static boolean isPalindrome(String word) {
		boolean result = false;
		
		String reverse ="";
		word = word.replace(" ", "");  // removing white spaces
		for(int i = word.length()-1;i>=0;i--) {
			reverse += word.charAt(i)+"";
		}
		
		if(word.equalsIgnoreCase(reverse)) {
			result = true;
		}
		return result;
	}

}
