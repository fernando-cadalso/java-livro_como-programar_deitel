package strings.fundamentos;

public class StringLocalizandoCaracteresESubstrings {

	public static void main(String[] args) {

		/*
		 * Dada uma string qualquer
		 */
		String letras = "abcdefghijklmabcdefghijklm";
		/*
		 * Desejo localizar a PRIMEIRA posição de um caracter qualquer dentro de uma
		 * string. Para tal uso o método .indexOf() que retorna o número do índice do
		 * argumento (posição INICIAL), dentro da string que chamou o método.
		 */
		System.out.printf("A primeira posição de 'c' está no índice: %d%n", letras.indexOf('c'));
		System.out.printf("A primeira posição de 'a' está no índice: %d%n", letras.indexOf('a', 1));
		System.out.printf("A primeira posição de '$' está no índice: %d%n", letras.indexOf('$'));
		System.out.println("Quando o argumento não é encontrado, o retorno é um índice negativo.");
		
		/*
		 * Desejo localizar a ÚLTIMA posição de um caracter qualquer dentro de uma
		 * string. Para tal uso o método .lastIndexOf() que retorna o número do índice do
		 * argumento (posição FINAL), dentro da string que chamou o método.
		 */
		System.out.printf("%nA última posição de 'c' está no índice: %d%n", letras.lastIndexOf('c'));
		System.out.printf("A última posição de 'a' está no índice: %d%n", letras.lastIndexOf('a', 25));
		System.out.printf("A última posição de '$' está no índice: %d%n%n", letras.lastIndexOf('$'));
		
		/*
		 * Desejo localizar a PRIMEIRA posição de um trecho qualquer dentro de uma
		 * string. Para tal uso o método .indexOf() que retorna o número do índice do
		 * argumento (posição INICIAL), dentro da string que chamou o método.
		 */
		System.out.printf("A primeira posição de 'def' está no índice: %d%n", letras.indexOf("def"));
		System.out.printf("A primeira posição de 'def' está no índice: %d%n", letras.indexOf("def", 7));
		System.out.printf("A primeira posição de 'hello' está no índice: %d%n", letras.indexOf("hello"));
		System.out.println("Quando o argumento não é encontrado, o retorno é um índice negativo.");
		
		/*
		 * Desejo localizar a ÚLTIMA posição de um trecho qualquer dentro de uma
		 * string. Para tal uso o método .lastIndexOf() que retorna o número do índice do
		 * argumento (posição FINAL), dentro da string que chamou o método.
		 */
		System.out.printf("%nA última posição de 'def' está no índice: %d%n", letras.lastIndexOf("def"));
		System.out.printf("A última posição de 'def' está no índice: %d%n", letras.lastIndexOf("def", 7));
		System.out.printf("A última posição de 'hello' está no índice: %d%n", letras.lastIndexOf("hello"));
		System.out.println("Quando o argumento não é encontrado, o retorno é um índice negativo.");
		

	}
}
