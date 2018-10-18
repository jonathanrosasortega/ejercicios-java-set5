/*Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.*/
public class ej20 {
	public static void main(String[] args) {
	System.out.println("Introduce la altura de la piramide:");
	int altura = Integer.parseInt(System.console().readLine());
	
	System.out.println("Introduce el carácter de relleno:");
	String caracter = (System.console().readLine());

	int numEspacios;
	int numCaracteres;
  	int i;
  	int j;

	for (i=0; i<altura; i++) {
		for (j=altura-(i+1); j>0; j--) {
			System.out.print(" ");
		} // Pinta espacios (Fuera)
		
			System.out.print(caracter);
		
		for (j=1; j<(i*2); j++) {
			if (i==(altura-1)) {
        System.out.print(caracter);
      } else {
        System.out.print(" ");
      }
		} // Pinta espacios (Dentro)
    
    if (i!=0) {
		System.out.print(caracter); 
    }
    System.out.println();// Pinta salto de linea
  } //Pinta todo

    System.out.printf("\nFIN\n");
   
	}
}
/*
    *
   * *
  *   *
 *     *
*********
*/
