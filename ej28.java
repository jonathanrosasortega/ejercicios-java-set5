/*Escribe un programa que calcule el factorial de un número entero leído por
teclado.*/
public class ej28 {
	public static void main(String[] args) {
	System.out.println("Introduce un número y te daré su factorial:");
	int numero = Integer.parseInt(System.console().readLine());
	int factorial = 1;
	for (int i=1; i<=numero; i++) {
		factorial *= i;
	}
	System.out.printf("\n%d! = %d\n", numero, factorial);

    System.out.printf("FIN\n");
   
	}
}