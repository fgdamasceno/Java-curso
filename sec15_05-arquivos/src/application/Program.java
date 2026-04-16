package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	// Manipulando pastas com File
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String folderPath = "C:\\Users\\fgdam\\dev\\workspace-java-completo-udemy\\arquivos";		
		File path = new File(folderPath);
		
		File[] folders = path.listFiles(File::isDirectory);		
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		System.out.println();
		
		boolean success = new File(path + "\\teste4").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();

	}

}
