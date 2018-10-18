/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.*/
public class ej19 {
	public static void main(String[] args) {
	System.out.println("Introduce la altura de la piramide:");
	int altura = Integer.parseInt(System.console().readLine());
	
	System.out.println("Introduce el carácter de relleno:");
	String caracter = (System.console().readLine());

	int numEspacios;
	int numCaracteres;
  	int i;
  	int j;
  
	for (i=1; i<=altura; i++) {
		for (j=altura-i; j>=0; j--) {
			System.out.print(" ");
		} // Conteo espacios

		for (j=1; j<(i*2); j++) {
			System.out.print(caracter);
		} // Conteo caracteres

		System.out.println(); // Pinta salto de linea
	} //conteo altura

    System.out.printf("\nFIN\n");
   
	}
}
/*
    *
   ***
  *****
 *******
*********
*/