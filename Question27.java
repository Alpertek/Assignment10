package questions;

public class Question27 {

	public static void main(String[] args) {

		String word = "SH MASH CASH RASH";
		String coverMe = "SH";
		System.out.println(coverString(word, coverMe));

	}
	public static String coverString(String statement, String coverME) {
		String output = "";
		String temp = statement;
		if(statement.contains(coverME)) {
			
			output = statement.replace(coverME, "["+coverME+"]");
			
		}
		else {
			output = "["+statement+"]";
		}
		
		return output;
		
	}

}
