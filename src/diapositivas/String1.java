package diapositivas;

public class String1 {
	public static void main(String[] args) {
		String str1 = "Hola mundo";
		String str2 = "Hola mundo";
		String str3 = new String("Hola mundo");
		String str4 = new String(new char [] {'H','o','l','a',' ','m','u','n','d','o'});
		//usando el comparador ==
		System.out.println("str1 == str2: "+(str1 == str2));
		System.out.println("str1 == str3: "+(str1 == str3));
		System.out.println("str1 == str4: "+(str1 == str4));
		System.out.println("str3 == str4: "+(str3 == str4));
		//usando equals
		System.out.println("str1.equals(str2): "+str1.equals(str2));
		System.out.println("str1.equals(str3): "+str1.equals(str3));
		System.out.println("str1.equals(str4): "+str1.equals(str4));
		System.out.println("str3.equals(str4): "+str3.equals(str4));
		//usando compare to
		System.out.println("str1.compareTo(str2): "+str1.compareTo(str2));
		System.out.println("str1.compareTo(str3): "+str1.compareTo(str3));
		System.out.println("str1.compareTo(str4): "+str1.compareTo(str4));
		System.out.println("str3.compareTo(str4): "+str3.compareTo(str4));
		System.out.println("str1.compareTo(str2): "+str1.compareTo(str2.toUpperCase())); //diferencia del valor en unicode en cuanto encuentra un valor diferente
		System.out.println("str1.compareTo(str2): "+str1.compareToIgnoreCase(str2.toUpperCase()));
		//metodo startsWith
		System.out.println("str1.startsWith(\"H\"): "+str1.startsWith("H"));
		System.out.println("str1.startsWith(\"Hola\"): "+str1.startsWith("Hola "));
		System.out.println("str1.startsWith(\"la\"): "+str1.startsWith("la"));
		System.out.println("str1.endsWith(\"mundo\"): "+str1.endsWith("mundo"));
		System.out.println("str1.endsWith(\"mundo \"): "+str1.endsWith("mundo "));
		System.out.println("str1.endsWith(\"mundo.trim()\"): "+str1.endsWith("mundo ".trim()));
		//metodos length, concat y charAt
		System.out.println("str1.length(): "+str1.length());
		System.out.println("str1.concat(\" \").concat(str4): "+str1.concat(" ").concat(str4));
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i)+" ");
		}
		System.out.println();
		for (int i = str1.length()-1; i >= 0; i--) {
			System.out.print(str1.charAt(i)+" ");
		}
		System.out.println();
		String aux = "";
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == ' ') aux = str1.substring(i+1);
		}
		
		System.out.println(aux);
	}
}
