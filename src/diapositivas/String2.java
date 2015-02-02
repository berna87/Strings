package diapositivas;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String frase = sc.nextLine();
		sc.close();
		System.out.println("La frase contiene algun numero: "+frase.matches(".*[0-9]+.*"));
		String [] fraseArray = frase.split(" ");
		System.out.println("La frase contiene "+fraseArray.length+" palabras");
		int palabrasConNum = 0;
		for (int i = 0; i < fraseArray.length; i++) {
			if(fraseArray[i].matches(".*[0-9]+.*")) palabrasConNum++;
		}
		System.out.println(palabrasConNum+" palabras contienen algun numero");
		int cantidadNumeros = 0;
		for (int i = 0; i < frase.length(); i++) {
			if(Character.isDigit(frase.charAt(i))) cantidadNumeros++;
		}
		System.out.println("Hay "+cantidadNumeros+" numeros en la frase");
		int palabrasConVocal = 0;
		for (int i = 0; i < fraseArray.length; i++) {
			if(fraseArray[i].toLowerCase().matches("^[aeiou].*")) palabrasConVocal++;
		}
		System.out.println(palabrasConVocal+" palabras empiezan por vocal");
	}

}
