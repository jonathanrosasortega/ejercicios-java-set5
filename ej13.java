/*Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.*/
public class ej13 {
	public static void main(String[] args) {
	System.out.println("Introduce 10 números y te dire cuantos son negativos y cuantos son positivos:");
	int positivos = 0;
	int negativos = 0;
  int numero;
  
	for (int i=1; i<=10; i++) {
		numero = Integer.parseInt(System.console().readLine());

		if (numero >= 0) {
			positivos++;
		} else {
			negativos ++;
		}
	}
	System.out.printf("%d son positivos y %d son negativos\n", positivos, negativos);

    System.out.printf("FIN\n");
   
	}
}
