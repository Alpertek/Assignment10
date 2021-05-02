package questions;

public class Question28 {

	public static void main(String[] args) {
		
		String text = "Football, basketball, volleyball";
		String dirt = "ball";
		
		System.out.println(clean(text,dirt));

	}
	public static String clean(String text,String badWord) {
		
		if(text.contains(badWord)) {
			
			text = text.replace(badWord, "");
		}
		
		return text;
	}

}
