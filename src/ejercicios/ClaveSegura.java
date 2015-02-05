package ejercicios;

public class ClaveSegura {
	private String clave;
	/**
	 * 
	 * @param clave Strin que utilizaremos para trabajar con el
	 */
	public ClaveSegura(String clave) {
		this.clave = clave;
	}
	/**
	 * 
	 * @return Devuelve true si cumple las siguientes condiciones:
	 * 			1mayuscula, 1minuscula, 1 digito, 1caracter no alfanumerico
	 * 			8 caracteres
	 */
	public boolean esClaveSegura(){
		boolean condicion=false;
		boolean mayuscula = false;
		boolean minuscula = false;
		boolean caracterNoAlf = false;
		boolean digito = false;
		boolean ochoCaracteres = (clave.length()>=8);
		for (int i = 0; i < clave.length(); i++) {
			char aux = clave.charAt(i);
			if (Character.isUpperCase(aux)) mayuscula = true;
			if (Character.isLowerCase(aux)) minuscula = true;
			if (Character.isDigit(aux)) digito = true;
			if (!Character.isLetterOrDigit(aux)) caracterNoAlf = true;
		}
		condicion = (mayuscula && minuscula && caracterNoAlf && digito && ochoCaracteres);
		return condicion;
	}
}
