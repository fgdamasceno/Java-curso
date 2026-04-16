package application;

import java.io.File;

public class Program {

	// Informações do caminho do arquivo
	public static void main(String[] args) {
		
		String folderPath = "C:\\Users\\fgdam\\dev\\workspace-java-completo-udemy\\arquivos";		
		File path = new File(folderPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		System.out.println("getAbsolutePath: " + path.getAbsolutePath());
		
		String filePath = "C:\\Users\\fgdam\\dev\\workspace-java-completo-udemy\\arquivos\\names.txt";		
		File file = new File(filePath);
		
		System.out.println("getName: " + file.getName());
		System.out.println("getParent: " + file.getParent());
		System.out.println("getPath: " + file.getPath());
		System.out.println("getAbsolutePath: " + file.getAbsolutePath());

	}

}
