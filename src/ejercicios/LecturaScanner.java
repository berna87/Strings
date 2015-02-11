package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LecturaScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamañoMax=0;
		int tamañoMin=Integer.MAX_VALUE;
		String s = "";
		String palabra = "";
		while(sc.hasNext()){
			palabra = sc.next();
			if(palabra.length()>tamañoMax) tamañoMax = palabra.length();
			if(palabra.length()<tamañoMin) tamañoMin = palabra.length();
			s += palabra+"/";
		}
		sc.close();
		String [] texto = s.split("/");
		if(args.length == 0){
			List<String> empiezanPorA = new ArrayList<String>();
			List<String> noAcabanEnVocal = new ArrayList<String>();
			List<String> pConMenosLetras = new ArrayList<String>();
			List<String> pConMasLetras = new ArrayList<String>();
			for (int i = 0; i < texto.length; i++) {
				if (texto[i].toLowerCase().matches("^[a].*")) empiezanPorA.add(texto[i]);
				if (!texto[i].matches(".*[aeiou]$")) noAcabanEnVocal.add(texto[i]);
				if (texto[i].length() == tamañoMax) pConMasLetras.add(texto[i]);
				if (texto[i].length() == tamañoMin) pConMenosLetras.add(texto[i]);
			}
			System.out.println("Nombres que empiezan por A");
			System.out.println(empiezanPorA.toString());
			System.out.println("Nombres que no terminan en vocal");
			System.out.println(noAcabanEnVocal.toString());
			System.out.println("Numero de palabras leidas : "+texto.length);
			System.out.println("Nombres con menos letras");
			System.out.println(pConMenosLetras.toString());
			System.out.println("Nombres con mas letras");
			System.out.println(pConMasLetras.toString());
		} else {
			String comprobacion = args[0];
			boolean condicion = true;
			for (int i = 0; i < texto.length; i++){
				if(texto[i].equals(comprobacion)){
					System.out.println("El nombre "+comprobacion+" se encuentra en el fichero");
					condicion= false;
					break;
				} 
			}	
			if(condicion){
				for (int i = 0; i < texto.length; i++){
					if(args[0].substring(0,2).equals(texto[i].substring(0,2))){
						System.out.println("Nombre no encontrado, nombre sugerido : "+texto[i]);
						break;
					}
				}		
			}
		}
	}
}