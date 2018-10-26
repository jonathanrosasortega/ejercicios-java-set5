/*Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor
o igual a 3, en caso contrario se debe mostrar un mensaje de error.*/
public class ej35 {
	public static void main(String[] args) {
	System.out.println("Introduce la altura de la X:");
	int altura = Integer.parseInt(System.console().readLine());
	
	if (((altura%2)==1) && (altura>=3)) {
		// pintamos la X
		int espaciosIntermedios = altura-2;
		for (int i=1; i<=(altura/2+1); i++) {
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			} //espacios
			
			if (i < altura/2+1) {
				System.out.print("*");	
			}
			
			for (int j=1; j<=espaciosIntermedios; j++) {
				System.out.print(" ");
			} //espacios
			System.out.print("*\n");
			espaciosIntermedios -= 2;
		} // pintamos la X hasta la mitad

		espaciosIntermedios = 1;
		//Terminamos de pintar la X
		for (int i=altura/2; i>=1; i--) {
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			} //espacios
			
			System.out.print("*");

			for (int j=1; j<=espaciosIntermedios; j++) {
				System.out.print(" ");
			} //espacios
			System.out.print("*\n");
			espaciosIntermedios += 2;
		} // pintamos la X hasta la mitad
	} else {
		System.out.println("La altura debe ser impar y superior o igual a 3.");
	}

    System.out.printf("FIN\n");
   
	}
}