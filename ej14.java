/*Escribe un programa que pida una base y un exponente (entero positivo) y
que calcule la potencia.*/
public class ej14 {
	public static void main(String[] args) {
	System.out.println("Introduce la base:");
	int base = Integer.parseInt(System.console().readLine());
	System.out.println("Introduce el exponente:");
	int exponente = Integer.parseInt(System.console().readLine());
	int potencia = 1;
	int contador = exponente;

	while (contador >= 1) {
		potencia *= base;
		contador --;
	}
	System.out.printf("%d elevado a %d es %d\n", base, exponente, potencia);

    System.out.printf("FIN\n");
   
	}
}