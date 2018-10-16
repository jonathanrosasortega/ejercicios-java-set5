/*El usuario tiene que adivinar un número entero. El usuario será avisado si el número introducido es el correcto
, o en caso de falar, si es mayor o menor*/
public class t5extra1 {
	public static void main(String[] args) {
	int acertado = 0;
	int respuesta = 25;

	System.out.println("Introduce un número, a ver si aciertas:");
	
	do {
	int numero = Integer.parseInt(System.console().readLine());
	if (numero < respuesta) {
		System.out.printf("%d no es correcto, la respuesta es un número mayor\n", numero);
	} else if (numero > respuesta) {
		System.out.printf("%d no es correcto, la respuesta es un número menor\n", numero);
	} else if (numero == respuesta) {
		System.out.printf("¡Has acertado, efectivamente la respuesta era %d!\n", respuesta);
		acertado = 1;
	}
	} while (acertado != 1);

	}
}
