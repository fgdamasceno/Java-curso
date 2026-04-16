package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	// LENDO ARQUIVO TEXTO COM CLASSES FILE E SCANNER
	public static void main(String[] args) {

		File file = new File("C:\\Users\\fgdam\\dev\\workspace-java-completo-udemy\\arquivos\\in.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
