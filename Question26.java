package questions;

public class Question26 {

	public static void main(String[] args) {
		
		String word = "cybertek school ccccccc";
		System.out.println(uniqueChars(word));

	}
	public static String uniqueChars(String input) {
		
		String unique = "";
		
		while(input.length()>0) {
			String search = input.trim().charAt(0)+"";
			input = input.trim().replaceFirst(search, "");
			if(!unique.contains(search)) {
				unique += search;
			}
		}
		
		
		return unique;
	}

}
