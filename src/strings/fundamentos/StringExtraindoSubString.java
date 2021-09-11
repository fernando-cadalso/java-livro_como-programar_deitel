package strings.fundamentos;

public class StringExtraindoSubString {

	public static void main(String[] args) {
		
		/*
		 * Data a string:
		 */
		String letras = "abcdefghijklmabcdefghijklm";
		System.out.printf("Data uma string qualquer: %s%n%n", letras);
		
		/*
		 * Desejo extrair um trecho partindo de uma posição passada no
		 * argumento do método.
		 * MÉTODO SUBSTRING() retorna uma string
		 * A extração é aplicada da string que chamou o método
		 */
		System.out.printf("Substring da posição 20 até o final: \"%s\"%n", letras.substring(20));
		System.out.printf("Substring da posição 3 até, mas não incluída, até a posição 6 (6 - 1): \"%s\"%n", letras.substring(3, 6));
	}
}
