import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadAndWriteToFile {

	public static void main(String[] args) {

		File file = new File("readAndWrite.txt");

		// Write your name and height and save to the file
		try {
			PrintWriter output = new PrintWriter(file);
			output.println("Henrik");
			output.println(195);
			output.close();
		} catch (IOException ex) {
			System.out.printf("Error: %s\n", ex);

		}

		try {
			Scanner input = new Scanner(file);
			String name = input.nextLine();
			int height = input.nextInt();

			System.out.printf("Name: %s\nHeight %d cm\n", name, height);
		} catch (FileNotFoundException ex) {
			System.out.printf("Error: %s\n", ex);

		}

	}
}
