/*Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.*/
public class ej21 {
	public static void main(String[] args) {
	System.out.println("Introduce números. Frena con un negativo:");
	
	int cuentaNumeros = 0;
	float sumaImpares = 0;
	int cuentaImpares = 0;
	float maximoPar = 0;
	float numero=0;
	do {
		numero = Float.parseFloat(System.console().readLine());
	    if (numero>=0) {
	      if (numero%2==1) {
	        sumaImpares += numero;
	        cuentaImpares++;
	      } else {
	        if (numero>maximoPar) {
	          maximoPar = numero;
	        }
	      }
	      cuentaNumeros++;
	    }
	} while (numero>=0);

	System.out.printf("Se han introducido %d números\n", cuentaNumeros);
	System.out.printf("La media de los impares es %.2f\n", sumaImpares/cuentaImpares);
	System.out.printf("El mayor de los pares es %.0f\n", maximoPar);

    System.out.printf("FIN\n");
	}
}
