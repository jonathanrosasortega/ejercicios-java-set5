/*Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.*/
public class ej22 {
	public static void main(String[] args) {
	System.out.println("Números primos entre 2 y 100:");
	boolean primo = true;
  int i;
	for (int n=2; n<=100; n++) {
		primo = true;
		for (i=2; (i<n) && primo; i++) {
			if (n%i==0) {
				primo = false;
			}
		}
    if (primo) {
				System.out.print(n + " ");
			}
	}
	
    System.out.printf("FIN\n");
   
	}
}
