package ejercicios;
/**
 * @author Bernabe Fernandez Ogayar
 * @version 1.0
 * 
 * 
 * */
public class UtilidadesString {
	public static final String[] ARTICULOS_DETERMINADOS = {"el","la","los","las"};
	public static final String[] ARTICULOS_INDETERMINADOS = {"un","unos","una","unas"};
	public static final String[] PREPOSICIONES = {"a","ante","bajo","cabe","con","contra","de","desde","durante","en","entre","hacia","hasta","mediante","para","por","según","sin","so","sobre","tras","versus"};
	/**
	 * @return devuelve el numero de palabras que contiene la frase
	 * @param frase sobre la que vamos a trabajar
	 * */
	public static int numeroPalabras(String frase){
		String [] palabras = arrayPalabras(frase);
		return palabras.length;
	}
	/**
	 * @return devuelve el numero de preposiciones que contiene la frase
	 * @param frase sobre la que vamos a trabajar
	 * */
	public static int numeroPreposiciones(String frase){
		int contador =0;
		String [] palabras = arrayPalabras(frase);
		for (int i = 0; i < palabras.length; i++) {
			for (int j = 0; j < PREPOSICIONES.length; j++) {
				if(palabras[i].equals(PREPOSICIONES[j])) contador++;
			}
		}
		return contador;
	}
	/**
	 * @return devuelve el numero de articulos determinados que contiene la frase
	 * @param frase sobre la que vamos a trabajar
	 * */
	public static int articulosDeterminados(String frase){
		int contador =0;
		String [] palabras = arrayPalabras(frase);
		for (int i = 0; i < palabras.length; i++) {
			for (int j = 0; j < ARTICULOS_DETERMINADOS.length; j++) {
				if(palabras[i].equals(ARTICULOS_DETERMINADOS[j])) contador++;
			}
		}
		return contador;
	}
	/**
	 * @return devuelve el numero de articulos indeterminados que contiene la frase
	 * @param frase sobre la que vamos a trabajar
	 * */
	public static int articulosIndeterminados(String frase){
		int contador =0;
		String [] palabras = arrayPalabras(frase);
		for (int i = 0; i < palabras.length; i++) {
			for (int j = 0; j < ARTICULOS_INDETERMINADOS.length; j++) {
				if(palabras[i].equals(ARTICULOS_INDETERMINADOS[j])) contador++;
			}
		}
		return contador;
	}
	/**
	 * @param comienzo caracter a partir del cual empieza a cambiar los caracteres (incluido)
	 * @param fin caracter en el cual termina de cambiar los caracteres(no incluido)
	 * @param frase sobre la que vamos a trabajar
	 * @return devuelve la frase con mayusculas entre comienzo y fin
	 * 
	 * */
	public static String devolverMayuscula(int comienzo, int fin,String frase){
		String mayusc = frase.substring(comienzo, fin).toUpperCase();
		StringBuilder sb = new StringBuilder(frase);
		sb.replace(comienzo, fin, mayusc);
		String str = sb.toString();
		return str;
	}
	private static String[] arrayPalabras(String frase){
		return frase.toLowerCase().split(" ");
	}
}
