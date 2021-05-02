package questions;

public class Question23 {

	public static void main(String[] args) {
		
		String sandwich = "xbreadjam breadyyy";
		
		if(sandwich.indexOf("bread")==sandwich.lastIndexOf("bread")) {
			System.out.println("nothing");
		}
		else {
			int begin = sandwich.indexOf("bread")+"bread".length();
			int end = sandwich.lastIndexOf("bread");
			String leftover = sandwich.substring(begin,end).trim();
			System.out.println(leftover);
		}

	}

}
