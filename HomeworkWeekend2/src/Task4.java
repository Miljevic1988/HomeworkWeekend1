public class Task4 {

	public static void main(String[] args) {
		TextIO.readFile("src/encodedFile.in");

		int numOfLines = TextIO.getlnInt();
		String line = "";
		char character = '0';

		for (int i = 0; i < numOfLines; i++) {
			line = TextIO.getln();
			for (int j = 0; j < line.length(); j++) {
				character = (char) (line.charAt(j) - 1);
				System.out.print(character);
			}
			System.out.println();
		}

	}

}
