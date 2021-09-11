package strings.fundamentos;

public class StringValueOF {

	public static void main(String[] args) {
		
		/*
		 * Dada uma lista de tipos primitivos Java
		 */
		char[] charArray = {'a','b','c','d','e','f'};
		boolean boolVal = true;
		char charValue = 'Z';
		int intValue = 7;
		long longValue = 125800000L;
		float floatValue = 2.5f;
		double doubleValue = 33.333;
		Object objectRef = "hello";
		
		/*
		 * Desejo transformá-los em objetos String
		 * MÉTODO .valueOf() retorna um objeto String do tipo
		 * passado no argumento.
		 * É um método estático, para usá-lo chamdo a classe String.
		 */
		System.out.printf("char array = %s%n", String.valueOf(charArray));
		System.out.printf("boolean value = %s%n", String.valueOf(boolVal));
		System.out.printf("char value = %s%n", String.valueOf(charValue));
		System.out.printf("int value = %s%n", String.valueOf(intValue));
		System.out.printf("long value = %s%n", String.valueOf(longValue));
		System.out.printf("float value = %s%n", String.valueOf(floatValue));
		System.out.printf("double value = %s%n", String.valueOf(doubleValue));
		System.out.printf("object ref = %s%n", String.valueOf(objectRef));
		
		
	}
}
