
public class Program {
	
	public static void main(String[] args) {
		
		String name = " Damasceno ";
		String[] letters = name.split("");
		
		// funções para String
		
		// Formatar
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		
		// Recortar
		System.out.println(name.substring(9));
		System.out.println(name.substring(6, 10));
		
		// Substituir
		System.out.println(name.replace('a', '-'));
		System.out.println(name.replace(" Damasceno ", "Fernando"));
		
		// Buscar
		System.out.println(name.indexOf('a'));
		System.out.println(name.lastIndexOf('a'));
		
		// Separar
		System.out.println(letters[1]);
		
		
	}

}
