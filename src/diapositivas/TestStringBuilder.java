package diapositivas;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		String st="";
		System.out.println("Introduce las palabras // (quit) para salir");
		while(true){
			st= sc.next();
			if(st.equals("quit")) break;
			if(Auxiliar.requisitos(st)) sb.append(st+"#");
		}
		sc.close();
		if(sb.length()>0){
			sb.reverse();
			sb.deleteCharAt(0);
			st = sb.toString();
			String [] arrayStr = st.split("#");
			List<String> arrayListStr= Arrays.asList (arrayStr);
			System.out.println(arrayListStr.toString());
		} else System.out.println("No ha introducido ninguna palabra valida");
	}
}
