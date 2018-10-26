/*Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.*/
public class ej29 {
	public static void main(String[] args) {
	System.out.println("Introduzca un número (El más grande):");
	int numeroMayor = Integer.parseInt(System.console().readLine());
	
	System.out.println("Introduzca otro número (Más pequeño):");
	int numeroMenor = Integer.parseInt(System.console().readLine());

	System.out.printf("Los nº enteros positivos menores que %d, no-divisibles entre %d son:\n", numeroMayor, numeroMenor);
	
	for (int i = 1; i < numeroMayor; i++) {
		if ((i % numeroMenor) != 0) {
		System.out.print(i + " ");
		}
	}

	System.out.printf("FIN\n");
	}
}