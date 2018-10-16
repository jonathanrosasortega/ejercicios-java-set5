/*Escribe un programa que obtenga los números enteros comprendidos entre
dos números introducidos por teclado y validados como distintos, el programa
debe empezar por el menor de los enteros introducidos e ir incrementando de
7 en 7.*/
public class ej18 {
	public static void main(String[] args) {
	System.out.println("Introduce el primer número");
	int primero = Integer.parseInt(System.console().readLine());
	System.out.println("Introduce el segundo número");
	int segundo = Integer.parseInt(System.console().readLine());
	int menor;
	int mayor;

	if (primero == segundo) {
		System.out.println("Ambos números son iguales");
	} else {
		if (primero<segundo) {
			menor = primero;
			mayor = segundo;
		} else {
			mayor = primero;
			menor = segundo;
		}

		for (int i=menor; i<mayor; i+=7) {
			System.out.println(i + " ");
		}
	}
    System.out.printf("FIN\n");
   
	}
}
