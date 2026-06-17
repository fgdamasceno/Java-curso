package application;

public class Program {

	public static void main(String[] args) {
		
		String a = "Maria";
		String b = "Alex";
		String c = "Maria";
		String d = "alex";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(d));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
		System.out.println();
		
		// Limitações do .hashCode() - colisão
		String x = "Aa";
		String y = "BB";
		
		if (x.hashCode() == y.hashCode()) {
			System.out.println("X & Y have same hashcode");
			System.out.println("X hashcode = " + x.hashCode());
			System.out.println("Y hashcode = " + y.hashCode());
			
			if (x.equals(y) == true) {
				System.out.println("And X & Y are equals");				
			}
			else {
				System.out.println("But X & Y are different");
			}
		}
		else {
			System.out.println("X & Y are definetely different");
		}
	}

}
