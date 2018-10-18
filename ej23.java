/*Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.*/
public class ej23 {
	public static void main(String[] args) {
	System.out.println("Introduce números:");
	int numero;
	int sumaTotal = 0;
	int cuentaNumeros = 0;

	while (sumaTotal<=10000) {
		numero = Integer.parseInt(System.console().readLine());
		cuentaNumeros++;
		sumaTotal += numero;
	}

	System.out.printf("La suma de todos los números ha superado los 10000\n");
	System.out.printf("Has introducido %d números\n", cuentaNumeros);
	System.out.printf("Entre todos ellos suman %d\n", sumaTotal);
	System.out.printf("La media es %.2f\n", (float)sumaTotal / (float)cuentaNumeros);

    System.out.printf("FIN\n");
   
	}
}
