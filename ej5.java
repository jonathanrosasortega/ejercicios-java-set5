/*Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
utilizando un bucle while.*/
public class ej5 {
	public static void main(String[] args) {
	System.out.println("Bucle while. Números del 320 al 160, contando de 20 en 20 hacia atrás");
	int i=320;
	while (i>=160) {
		System.out.println(i);
		i-=20;
	}

    System.out.printf("FIN\n");
   
	}
}