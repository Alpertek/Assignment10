package questions;

public class Question21 {

	public static void main(String[] args) {

		String sentence = "javajavajavajavajava";
		String temporary = sentence;
		
		for(int i = 0; i < sentence.length(); i++) {
			temporary = sentence;
			int count = 0;
			
			String search = "";
			
			if(i + 1 <= sentence.length()) {
				search = sentence.substring(0,i+1);	
			}
			
			while(temporary.contains(search)) {
				count++;
				temporary = temporary.replaceFirst(search, "");
			}	
			System.out.println("count of \""+search+"\" in "+sentence +" is:" + count);
		}

		

	}

}
