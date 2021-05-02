package questions;

public class Question25 {

	public static void main(String[] args) {
		String first = "1234";
		String second = "cybertek";
		
		String output = mergeStrings(first, second);
		System.out.println(output);
		

	}
	public static String mergeStrings(String first, String second) {
		String merged = "";
		
		int uplimit = first.length() >= second.length() ? second.length() : first.length() ;
		
		for(int i = 0; i < uplimit;i++) {
			if(first.length()!=0 && second.length()!=0) {
				merged += first.charAt(0)+""+second.charAt(0);
				first = first.replaceFirst(first.charAt(0)+"", "");
				second = second.replaceFirst(second.charAt(0)+"", "");
			}	
		}
		merged = merged + first + second ;
		
		return merged;
	}

}
