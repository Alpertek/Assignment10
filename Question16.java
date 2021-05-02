package questions;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample = "cjavaxpython";
		
		if(sample.length()>=4 && (sample.indexOf("java")==0 || sample.indexOf("java")==1)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
