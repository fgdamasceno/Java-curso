package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	// FileWriter e BufferedWriter
	public static void main(String[] args) {		
		
		String[] names = new String[] {"Fernando", "Maria", "Astrogildo"};
		
		String path = "C:\\Users\\fgdam\\dev\\workspace-java-completo-udemy\\arquivos\\names.txt";
		
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { // recria o arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // somente inclui novas linhas
			for (String name : names) {
				bw.write(name);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
