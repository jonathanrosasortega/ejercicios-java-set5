/*Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.*/
public class ej10 {
	public static void main(String[] args) {
	System.out.println("Introduce muchos números (Frena con un número negativo):");
	int numero = 0;
	int dividir = 0;
  int sumar = 0;
  
	while (sumar >= 0) {
		sumar = Integer.parseInt(System.console().readLine());
		numero += sumar;
		dividir++;
	}
	double media = (numero-sumar)/(dividir-1);
    System.out.printf("La media de todos ellos es %.2f\n", media);
   
	}
}
