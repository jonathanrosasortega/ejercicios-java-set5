/*Programa que muestre tabla de potencias de un nº introducido por teclado hasta de 10 potencias.*/
public class t5extra3 {
	public static void main(String[] args) {
	System.out.println("Introduce un número:");
	int base = Integer.parseInt(System.console().readLine());
	int numero = base;
	for (int i=1; i<=10; i++) {
    System.out.println(base + "^" + i + " = " + numero);
    numero*=base;
    }
	
    System.out.printf("FIN\n");
   
	}
}
