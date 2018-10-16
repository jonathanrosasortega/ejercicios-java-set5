/*Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.*/
public class ej16 {
	public static void main(String[] args) {
	System.out.println("Introduce un número y te diré si es primo:");
	int numero = Integer.parseInt(System.console().readLine());
	int divisibles = 0;
	for (int i=1; i<=numero; i++) {
		if (numero%i == 0) {
			divisibles++;
		}
	}

	if (divisibles>=3) {
		System.out.println("El número" + numero + "NO es primo");
	} else {
		System.out.println("El número" + numero + "ES primo");
	}
    System.out.printf("FIN\n");
   
	}
}