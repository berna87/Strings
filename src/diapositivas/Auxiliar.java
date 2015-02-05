package diapositivas;

public class Auxiliar {
	public static boolean requisitos(String st){
		boolean condicion=false;
		boolean mayuscula = false;
		boolean minuscula = false;
		boolean caracterNoAlf = false;
		boolean digito = false;
		boolean ochoCaracteres = (st.length()>=8);
		for (int i = 0; i < st.length(); i++) {
			char aux = st.charAt(i);
			if (Character.isUpperCase(aux)) mayuscula = true;
			if (Character.isLowerCase(aux)) minuscula = true;
			if (Character.isDigit(aux)) digito = true;
			if (!Character.isLetterOrDigit(aux)) caracterNoAlf = true;
		}
		condicion = (mayuscula && minuscula && caracterNoAlf && digito && ochoCaracteres);
		return condicion;
	}
}
