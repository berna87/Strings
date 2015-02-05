package ejercicios;

import java.util.Scanner;

public class TestPalabraLeida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce una palabra");
			String palabra = sc.next();
			sc.close();
			PalabraLeida p = new PalabraLeida(palabra);
			System.out.println("Numero de letras : "+p.numeroDeLetras());
			System.out.println("Empieza por vocal : "+p.empiezaPorVocal());
			System.out.println("Acaba en vocal : "+p.acabaEnVocal());
			System.out.println("Numero de vocales : "+p.numeroVocales());
			System.out.println("Contiene h : "+p.contieneH());
			System.out.println("Es un palindromo : "+p.esUnPalindromo());
			if (args.length > 0)
			System.out.println("Es igual a "+args[0]+" :"+p.sonIguales(args[0]));
	}

}
