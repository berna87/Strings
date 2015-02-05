package ejercicios;
/**
 * 
 * @author Bernabe Fernandez Ogayar
 * @version 1.0
 */
public class PalabraLeida {
	private String valor;
	/**
	 * 
	 * @param palabra Palabra con la que vamos a trabajar
	 */
	public PalabraLeida(String palabra) {
		this.valor = palabra;
	}
	/**
	 * 
	 * @return Devuelve el numero de letras que contiene la palabra
	 */
	public int numeroDeLetras(){
		return valor.length();
	}
	/**
	 * 
	 * @return Devuelve true si la palabra empieza por vocal 
	 */
	public boolean empiezaPorVocal(){
		return valor.toLowerCase().matches("^[aeiou].*");
	} 
	/**
	 * 
	 * @return Devuelve true si la palabra termina en vocal
	 */
	public boolean acabaEnVocal(){
		return valor.toLowerCase().matches(".*[AEIOUaeiou]$");
	}
	/**
	 * 
	 * @return Devuelve el numero de vocales que contiene la palabra
	 */
	public int numeroVocales(){
		int contador = 0;
		for (int i = 0; i < valor.length(); i++) {
			String aux = valor.toLowerCase();
			if (aux.charAt(i) == 'a' || aux.charAt(i) == 'e' 
					|| aux.charAt(i) == 'i' || aux.charAt(i) == 'o' 
					|| aux.charAt(i) == 'u' ) contador++;
		}
		return contador;
	}
	/**
	 * 
	 * @return Devuelve true si la palabra contiene la H
	 */
	public boolean contieneH(){
		return valor.matches(".*[hH].*");
	}
	/**
	 * 
	 * @return Devuelve true si es un palindromo
	 */
	public boolean esUnPalindromo(){
		StringBuilder sb1 = new StringBuilder(valor);
		String s2 = sb1.reverse().toString();
		return valor.equalsIgnoreCase(s2);
	}
	/**
	 * 
	 * @param p2 Palabra que queremos comparar
	 * @return Devuelve true si la palabra es similar a la que contine la clase
	 */
	public boolean sonIguales(String p2){
		return p2.equals(valor);
	}	
}
