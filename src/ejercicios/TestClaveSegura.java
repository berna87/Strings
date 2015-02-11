package ejercicios;

public class TestClaveSegura {
	
	
	public static void main(String[] args) {
		final String FUENTECARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNnoOpPqQrRsStTuUvVwWxXyYzZ0123456789¿?()=@.:,;!¡&{}0123456789¿?()=@.:,;!¡&{}";
		String clave = "";
		while(true){
			int longitudClave = (int)(Math.random()*FUENTECARACTERES.length());
			for (int i = 0; i < longitudClave; i++) {
				int letraAleatoria = (int)(Math.random()*FUENTECARACTERES.length());
				clave += FUENTECARACTERES.charAt(letraAleatoria);
			}
			ClaveSegura cs = new ClaveSegura(clave);
			if(cs.esClaveSegura()) break ;
		}
		System.out.println("Clave segura : "+clave);
	}
}
