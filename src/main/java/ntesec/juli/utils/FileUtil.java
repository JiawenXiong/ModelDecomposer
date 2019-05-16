package ntesec.juli.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by juli on 2017/3/7.
 */
public class FileUtil {
	public static String readFile(String fileName) {

		String text = new String();

		try {
			FileReader reader = new FileReader(fileName);
			BufferedReader bReader = new BufferedReader(reader);

			String tmp = new String();
			while ((tmp = bReader.readLine()) != null) {
				text += tmp;
				text += "\n";
			}
			bReader.close();
		} catch (IOException e) {
			System.out.println("Read File Error.");
			System.out.println(e.getMessage());
		}

		return text;
	}

	public static void writeFile(String text, String fileName) {
		try {
			FileWriter writer = new FileWriter(fileName);
			BufferedWriter bWriter = new BufferedWriter(writer);

			bWriter.write(text);

			bWriter.flush();
			bWriter.close();
		} catch (IOException e) {
			System.out.println("Write File Error.");
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) throws IOException {
		String str = readFile("resources/sortingExample.imc");
		writeFile(str, "resources/sortingExample_1.imc");
		System.out.println(str);
	}
}
