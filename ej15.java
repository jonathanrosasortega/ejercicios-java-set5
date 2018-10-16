/*Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 21, 22, 23, 24 y 25.*/
public class ej15 {
	public static void main(String[] args) {
	System.out.println("Introduzca una base:");
	int base = Integer.parseInt(System.console().readLine());
	System.out.println("Introduzca un exponente:");
	int exponente = Integer.parseInt(System.console().readLine());
	
	for (int i=1; i<=exponente; i++) {
		int baseInicial = 1;
		int potencia = 1;

		for (int j=1; j<=i; j++) {
			potencia *= base;
		}
		System.out.println(base + "^" + i + " = " + potencia);
	}

    System.out.printf("FIN\n");
   
	}
}