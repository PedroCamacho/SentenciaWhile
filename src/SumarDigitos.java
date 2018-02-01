import java.util.Scanner;

public class SumarDigitos {

	public static void main(String[] args) {
		// Inicialización
		System.out.print("Introduce un número: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int suma = 0;

		// Proceso
		while (numero>0) {
			suma += numero%10;
			numero/=10;
		}
		
		//Salida
		System.out.printf("La suma de los dígitos es " + suma);
	}

}
