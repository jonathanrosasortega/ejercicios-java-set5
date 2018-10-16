/*Muestra la tabla de multiplicar de un número introducido por teclado.*/
public class ej8 {
	public static void main(String[] args) {
	System.out.println("Introduce un número y te doy su tabla de multiplicar:");
	int numero = Integer.parseInt(System.console().readLine());

	for (int i=0; i<=10; i++) {
		System.out.println(numero + " x " + i + " = " + numero*i);
	}
	
    System.out.printf("FIN\n");
   
	}
}
