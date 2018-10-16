/*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle "do-while".*/
public class ej3 {
	public static void main(String[] args) {
	System.out.println("Bucle do-while. Múltiplos de 5 entre 5 y 100");
	int i=0;
	do {
		System.out.println(i);
		i+=5;
	} while (i<=100);
    System.out.printf("FIN\n");
   
	}
}