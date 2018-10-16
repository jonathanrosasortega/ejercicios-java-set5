/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.*/
public class ej11 {
	public static void main(String[] args) {
	System.out.println("Introduce un número:");
	int numero = Integer.parseInt(System.console().readLine());
	int i=0;
	System.out.println("Numero		cuadrado	cubo");
	for(i=0;i<5; i++){
		int primerNumero = numero+i;
		System.out.printf("\n");
		System.out.printf("%d		%d	%d\n", primerNumero, primerNumero*primerNumero, primerNumero*primerNumero*primerNumero);
	}

    System.out.printf("FIN\n");
   
	}
}
