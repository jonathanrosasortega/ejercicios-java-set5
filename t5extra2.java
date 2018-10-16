/*Igual que el anterior pero ahora además se especificará entre qué valores se encuentra la respuesta*/
public class t5extra2 {
	public static void main(String[] args) {
	int acertado = 0;
	int respuesta = 25;
	int valorMinimo = 0;
	int valorMaximo = 9999;
	System.out.println("Introduce un número, a ver si aciertas:");
	
	do {
	int numero = Integer.parseInt(System.console().readLine());
	if (numero < respuesta) {
		if (numero > valorMinimo) {
			valorMinimo = numero;
		}
		System.out.printf("%d no es correcto, la respuesta es un número entre %d y %d\n", numero, valorMinimo, valorMaximo);
	} else if (numero > respuesta) {
		if (numero < valorMaximo) {
			valorMaximo = numero;
		}
		System.out.printf("%d no es correcto, la respuesta es un número entre %d y %d\n", numero, valorMinimo, valorMaximo);
	} else if (numero == respuesta) {
		System.out.printf("¡Has acertado, efectivamente la respuesta era %d!\n", respuesta);
		acertado = 1;
	}
	} while (acertado != 1);

	}
}
