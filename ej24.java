/*Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
   1
  121
 12321
1234321
*/
public class ej24 {
	public static void main(String[] args) {
	System.out.println("Introduce la altura de la piramide:");
	int altura = Integer.parseInt(System.console().readLine());
  	int i;
  	int j;
  
	for (i=1; i<=altura; i++) {
		for (j=altura-i; j>=0; j--) {
			System.out.print(" ");
		} // Conteo espacios

		for (j=1; j<=i; j++) {
			if (j<=9) {
        System.out.print(j);
      } else {
        System.out.print(j%10);
      }
		} //parte izq
		for (j=(i-1); j>=1; j--) {
			if (j<=9) {
        System.out.print(j);
      } else {
        System.out.print(j%10);
      }
		} // parte der
		System.out.println(); // Pinta salto de linea
	} //conteo altura

    System.out.printf("\nFIN\n");
   
	}
}
