package questions;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String html = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";

		if (html.contains("<html>")) {
			String search = "\"";
			int begin = html.indexOf(search);
			int end = html.lastIndexOf(search);
			String result = html.substring(begin + 1, end);
			System.out.println(result);
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
