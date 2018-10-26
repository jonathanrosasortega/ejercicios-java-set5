/*Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.*/
public class ej27 {
	public static void main(String[] args) {
	System.out.println("");
	int numero = Integer.parseInt(System.console().readLine());
	int contador = 0;
	int sumaTotal = 0;

	for (int i=1; i<=numero; i++) {
		if (numero%3 == 0) {
			System.out.print(i + " ");
			contador++;
			sumaTotal += i;
		}
	}

	System.out.printf("Hay %d múltiplos de 3 entre el 1 y el %d.\n", contador, numero);
	System.out.printf("Todos ellos suman %d.\n", sumaTotal);

    System.out.printf("FIN\n");
   
	}
}