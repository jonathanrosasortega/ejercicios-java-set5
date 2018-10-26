/*Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.*/
public class ej26 {
	public static void main(String[] args) {
	System.out.println("Introduce un número:");
	int numero = Integer.parseInt(System.console().readLine());
	System.out.println("Ahora introduce un dígito");
	int digito = Integer.parseInt(System.console().readLine());
	int posicion = 0;
	int cuenta_pos = 0;
	int auxiliar = numero;
  boolean encontrado = false;

	while (auxiliar>0) { // 12345
		if (auxiliar%10 == digito) {
      encontrado = true;
    }
    
    if (encontrado == false) {
			posicion++;
      System.out.println("Chivato posicion:" + posicion);
      System.out.println("Chivato auxiliar:" + auxiliar);
		}
		auxiliar /= 10;
    cuenta_pos++;
	}

	System.out.printf("En el número %d, el dígito %d está en la posición %d\n", numero, digito, cuenta_pos-posicion);

    System.out.printf("FIN\n");
   
	}
}
