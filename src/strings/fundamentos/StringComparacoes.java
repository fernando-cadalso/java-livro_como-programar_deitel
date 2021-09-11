package strings.fundamentos;

public class StringComparacoes {
	public static void main(String[] args) {

		String s1 = new String("Hello");
		String s2 = "Good bye";
		String s3 = "Happy Birthday";
		String s4 = "Happy birthday";
		
		System.out.printf("s1 = %s%n" + 
				"s2 = %s%n" + 
				"s3 = %s%n" + 
				"s4 = %s%n%n"
				, s1, s2, s3, s4);
		
		/*
		 * MÉTODO EQUALS(): RETORNA TRUE OU FALSE SE
		 * A STRING QUE O CHAMOU É IGUAL AO PARÂMETRO
		 * DO MÉTODO.
		 * COMPARA OS CONTEÚDOS DOS OBJETOS, E NÃO
		 * COMPARA AS REFERÊNCIAS DOS OBJETOS.
		 */
		if (s1.equals("Hello")) {
			System.out.println("s1 é igual a \"Hello\"");
		} else {
			System.out.println("s1 é diferente a \"Hello\"");
		}
		System.out.println("Comparação feita com método equals()");
		
		/*
		 * FAZ A COMPARAÇÃO DO OBJETO STRING ATRAVÉS DO
		 * OPERADOR ==.
		 * COMPARA AS REFERÊNCIAS DOS OBJETOS NA MEMÓRIA, E
		 * NÃO COMPARA OS CONTEÚDOS DESSES OBJETOS.
		 */
		if (s1 == "Hello") {
			System.out.println("s1 é o mesmo objeto que \"Hello\"");
		} else {
			System.out.println("s1 não é o mesmo objeto que \"Hello\"");
		}
		System.out.println("Comparação feita com o operador \"==\"");
		
		/*
		 * MÉTODO EQUALSIGNORECASE(): RETORNA UM BOOLEAN APÓS VERIFICAR
		 * SE A STRING QUE CHAMOU É IGUAL AO ARGUMENTO DO MÉTODO,
		 * IGNORANDO MAIÚSCULAS E MINÚSCULAS.
		 */
		if (s3.equalsIgnoreCase(s4)) {
			System.out.printf("%s é igual %s ignorando maiúsculas e minúsculas.", s3, s4);
		} else {
			System.out.println("s3 não é igual a s4.");
		}
		/*
		 * MÉTODO COMPARETO(): RETORNA UM NÚMERO NEGATIVO SE O OBJETO
		 * QUE CHAMOU O MÉTODO FOR MENOR QUE O ARGUMENTO.
		 * 
		 * RETORNA UMA NÚMERO POSITIVO SE O OBJETO QUE CHAMOU FOR
		 * MAIOR QUE O ARGUMENTO.
		 * 
		 * E RETORNA ZERO SE FOREM IGUAIS.
		 * 
		 * A COMPARAÇÃO É FEITA LEXICOGRAFICAMENTE ATRAVÉS DOS
		 * UNICODES DO CARACTERES.
		 */
		System.out.printf("%ns1.compareTo(s2) é %d: ", s1.compareTo(s2));
		System.out.printf("%ns2.compareTo(s1) é %d: ", s2.compareTo(s1));
		System.out.printf("%ns1.compareTo(s1) é %d: ", s1.compareTo(s1));
		System.out.printf("%ns3.compareTo(s4) é %d: ", s3.compareTo(s4));
		System.out.printf("%ns4.compareTo(s3) é %d%n%n: ", s4.compareTo(s3));
		/*
		 * MÉTODO REGIONMATCHES(): COMPARA PARTES DE DUAS STRINGS.
		 * PRIMEIRO ARGUMENTO É O ÍNDICE INICIAL DA STRING QUE CHAMA O MÉTODO.
		 * SE O PRIMEIRO ARGUMENTO FOR TRUE, ENTÃO AS MAIÚSCULAS E MINÚSCULAS
		 * SÃO IGNORADAS.
		 * SEGUNDO ARGUMENTO É A STRING QUE SERÁ COMPARADA.
		 * TERCEIRO É O ÍNDICE INICIAL DA STRING COMPARADA.
		 * O ÚLTIMO ARGUMENTO É A QUANTIDADE DE CARACTERES QUE SERÃO COMPARADOS.
		 * RETORNA UM BOOLEAN DO TRECHO COMPARADO LEXICOGRAFICANTE.
		 */
		if(s3.regionMatches(0, s4, 0, 7)) {
			System.out.println("Os 5 primeiros caracteres de s3 e s4 combinam.");
		} else {
			System.out.println("Os 5 primeiros caracteres de s3 e s4 NÃO combinam.");
		}
		
		if(s3.regionMatches(true, 0, s4, 0, 7)) {
			System.out.println("Os 5 primeiros caracteres de s3 e s4 combinam, ignorando a capitalização.");
		} else {
			System.out.println("Os 5 primeiros caracteres de s3 e s4 NÃO combinam, ignorando a capitalização.");
		}

	}
}
