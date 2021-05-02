package questions;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = searchWordinWord("java","javaxjavajavaapplepearjavaegg");
		System.out.println(count);
	}

	public static int searchWordinWord(String searchWord, String inWord) {
		// look for "searchWord" in "inWord" and return
		// how many searchword are there in inWord.
		int wordCount = 0;

		if (searchWord.equals(inWord)) {
			return 1;
		} else if (searchWord.equals("")) { // even counting emtpy string("") in any word!
			return inWord.length() + 1;
		} else if (searchWord.length() > 0 && searchWord.length() <= inWord.length() && inWord.length() > 0) {
			for (int i = 0; i < inWord.length(); i++) {
				if (searchWord.charAt(0) == inWord.charAt(i)) {
					if (i + searchWord.length() <= inWord.length()) {
						if (searchWord.equals(inWord.substring(i, i + searchWord.length()))) {
							wordCount++;
						}
					}
				}
			}
		}

		return wordCount;
	}
}
