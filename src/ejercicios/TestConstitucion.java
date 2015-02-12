package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestConstitucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> listaPalabras = new ArrayList<String>();
		String palabra="";
		while(sc.hasNext()){
			palabra = sc.next();
			if(palabra.matches(".*[\\p{Punct}]")) palabra = palabra.substring(0,palabra.length()-1);
			listaPalabras.add(palabra);
		}
		sc.close();		
		StringBuilder palabrasElegidas = new StringBuilder();
		
		for (int i = 0; i < 500; i++) {
			int posicionPalabra = (int)(Math.random()*listaPalabras.size());
			palabrasElegidas.append(listaPalabras.get(posicionPalabra)+" ");
		}
		System.out.println("Numero de preposiciones en las palabras escojidas : "+UtilidadesString.numeroPreposiciones(palabrasElegidas.toString().toLowerCase()));
		System.out.println("Numero de articulos determinados en las palabras escojidas : "+UtilidadesString.articulosDeterminados(palabrasElegidas.toString().toLowerCase()));
		System.out.println("Numero de articulos indeterminados en las palabras escojidas : "+UtilidadesString.articulosIndeterminados(palabrasElegidas.toString().toLowerCase()));
		System.out.println("Cambiar un conjunto de caracteres a mayuscula: "+UtilidadesString.devolverMayuscula(1000,2000,palabrasElegidas.toString()));
	
	
	}

}
