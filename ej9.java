/*Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo
de dato que se utilice (int o long).*/
public class ej9 {
	public static void main(String[] args) {
	System.out.println("Introduce un número");
	long numero = Integer.parseInt(System.console().readLine());
	int digitos = 1;
	long numeroWhile = numero;

	while (numeroWhile >= 10) {
		numeroWhile = numeroWhile/10;
		digitos++;
	}
    System.out.printf("Dígitos = %d\n", digitos);
   
	}
}
