/*Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).*/
public class ej17 {
	public static void main(String[] args) {
	System.out.println("Introduce un número:");
	float numero = Float.parseFloat(System.console().readLine());
	
	if (numero<0) {
		System.out.printf("Solo valen números positivos\n");
	} else {
		for (int i=1; i<=100; i++) {
			numero += (numero+i);
		}
		System.out.printf("La suma de los 100 siguientes es %.0f\n", numero);
   	}
   	System.out.printf("FIN\n");
	}
}
