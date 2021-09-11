package strings.fundamentos;

public class StringStartsEnds {
public static void main(String[] args) {
	String[] strings = {"starting", "started", "ended", "endind"};
	/*
	 * MÉTODO STARTSWITH(): RETORNA UM BOOLEAN DO TESTE ENTRE O OBJETO
	 * QUE CHAMOU O MÉTODO COM O ARGUMENTO DO MÉTODO.
	 * VERIFICA SE UMA STRING INICIA COM UM VALOR.
	 */
	for (String string : strings) {
		if(string.startsWith("st")) {
			System.out.printf("\"%s\" inicia com \"st\"%n", string);
		}
	}
	/*
	 * FAZ O TESTE INFORMANDO A POSIÇÃO DE INÍCIO
	 */
	for (String string : strings) {
		if(string.startsWith("art",2)) {
			System.out.printf("\"%s\" inicia com \"art\" na posicao 2%n", string);
		}
	}
	System.out.println();
	/*
	 * MÉTODO ENDSWITH(): RETORNA UM BOOLEAN DO TESTE ENTRE O OBJETO
	 * QUE CHAMOU O MÉTODO COM O ARGUMENTO DO MÉTODO.
	 * VERIFICA SE UMA STRING TERMINA COM UM VALOR.
	 */
	for (String string : strings) {
		if (string.endsWith("ed")) {
			System.out.printf("\"%s\" termina com \"ed\"%n", string);
		}
	}
	
}
}
