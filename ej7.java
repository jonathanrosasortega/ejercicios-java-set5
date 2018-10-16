/*Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.*/
public class ej7 {
	public static void main(String[] args) {
	int clave = 1234;
	boolean abierto = false;
	int intentos = 4;
	int claveIntroducida;

	System.out.println("Introduzca la clave de la caja fuerte:");
	while ((intentos >= 1) && (abierto == false)) {
		claveIntroducida = Integer.parseInt(System.console().readLine());
		if (claveIntroducida == clave) {
			System.out.println("La caja fuerte se ha abierto satisfactoriamente");
			abierto = true;
		} else {
			System.out.println("Lo siento, esa no es la combinación");
			intentos -=1;
		}
	}
	System.out.printf("FIN\n");
   
	}
}
