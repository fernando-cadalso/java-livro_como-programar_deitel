package strings.fundamentos;

public class StringMetodos {
	public static void main(String[] args) {

		String s1 = "Hello there";
		char[] charArray = new char[5];
		
		System.out.printf("s1 = %s%n", s1);
		
		/*
		 * MÉTODO LENGTH: DEVOLVE O TAMANHO DA STRING
		 */
		System.out.println("Tamanho de s1 é " + s1.length());
		/*
		 * MÉTODO CHARAT: DEVOLVE O CARACTERE DA POSIÇÃO INFORMADA
		 */
		System.out.println("A ordem inversa de Hello there é: ");
		for (int posicao = s1.length() - 1; posicao >= 0; posicao--) {
			System.out.printf("%c", s1.charAt(posicao));
		}
		/*
		 * MÉTODO GETCHAR: DEVOLVE UM CONJUNTO DE CARACTERES DE
		 * UM STRING, COMO UM ARRAY CHAR.
		 */
		System.out.println("\nCópia de uma parte de Hello there:");
		s1.getChars(0, 5, charArray, 0);
		System.out.println("O array char resultante é: ");
		for (char c : charArray) {
			System.out.printf("%c", c);
		}
	}
}
