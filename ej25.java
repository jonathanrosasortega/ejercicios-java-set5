/*Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.*/
public class ej25 {
	public static void main(String[] args) {
	System.out.println("Introduce un número y te lo mostraré al revés:");
	int numeroInicial = Integer.parseInt(System.console().readLine());
	int invertido = 0;
	int auxiliar = numeroInicial;
	while (auxiliar>0) { // 12345
		invertido += auxiliar%10;
		auxiliar /= 10;
    if (auxiliar > 0) {
      invertido *= 10;
    }
	}

    System.out.printf("\nEl número %d invertido sería %d\n", numeroInicial, invertido);
   
	}
}
