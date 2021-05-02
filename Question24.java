package questions;

public class Question24 {

	public static void main(String[] args) {

		String sentence = "What's the difference between java, javascript and python?";
		String temp = sentence;
		String java = "java";
		String python = "python";
		int counterJava = 0;
		int counterPython = 0;
		while(temp.contains(java)) {
			counterJava++;
			temp = temp.replaceFirst(java, "");
		}
		temp = sentence;
		while(temp.contains(python)) {
			counterPython++;
			temp = temp.replaceFirst(python, "");
		}
		if(counterJava==counterPython) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
