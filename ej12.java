/*Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
debe introducir por teclado.*/
public class ej12 {
	public static void main(String[] args) {
	System.out.println("Introduce los numeros de la serie de Fibonacci que quieres:");
	int n = Integer.parseInt(System.console().readLine());
	int i=1;

	switch (n) {
		case 1:
			System.out.println("0");
		break;
		case 2:
			System.out.println("0 1");
		break;
		default:
			System.out.printf("0 1");
			
	}
    
  int n1 = 0;
	int n2 = 1;
  int n3;
      
	while (n>2) {
		n3 = n1 + n2;
		System.out.printf(" %d", n3);
		n1 = n2;
		n2 = n3;
		n--;
	}
    System.out.printf("\nFIN\n");
   
	}
}
