package questions;

public class Question30 {

	public static void main(String[] args) {

		String a = "Alperen";
		String b = "123";
		System.out.println(at3(a,b));
	}
	public static String at3(String first,String second) {

		first = first.substring(0,3)+second+first.substring(3,first.length());
		
		
		return first;
	}

}
