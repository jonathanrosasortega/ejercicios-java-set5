/*Hacer un programa que nos muestre los números del 0-0-0 al 9-9-9, sustituyendo cada dígito "3" por la letra "E"*/
public class t5extra4 {
	public static void main(String[] args) {
	
	int a=0;
	int b=0;
	int c=0;

	int i;
	int j;
	int k;

	for (i=0; i<10; i++) {
		//System.out.println(a + "-" + b + "-" + c);
		for (j=0; j<10; j++) {
			for (k=0; k<10; k++) {
				if (i!=3) {
					System.out.print(i);
				} else {
					System.out.print("E");
				}
				System.out.print("-");
				if (j!=3) {
					System.out.print(j);
				} else {
					System.out.print("E");
				}
				System.out.print("-");
				if (k!=3) {
					System.out.print(k);
				} else {
					System.out.print("E");
				}
				System.out.println();
			} // conteo unidades
		} // conteo decenas
	} //conteo centenas
	System.out.println("\nFIN");
	}
}
